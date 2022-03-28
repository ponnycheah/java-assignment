package vaccinesystem;

import com.toedter.calendar.JDateChooser;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class AuthenticationHelper {

    //javadoc
    /**
     * apply in login form
     * error = 1 => invalid name/ic/passport
     * error = 2 => people(user) login
     * error = 3 => personnel login
     * @param name
     * @param ic_passport
     * @return 
     */
    public static int login(String name, String ic_passport) {
        int error = 1;
        

        if (name.isEmpty() || ic_passport.isEmpty()) {
            error = 1;
        } else {
            try {
                File peoplefile = new File("people.txt");
                Scanner myReader = new Scanner(peoplefile);
                while (myReader.hasNextLine()) {
                    String read_ic_passport = myReader.nextLine();
                    if (ic_passport.equals(read_ic_passport)) {
                        String read_name = myReader.nextLine();
                        if (name.equals(read_name) && ic_passport.equals(read_ic_passport)) {
                            error = 2;
                        }

                    }
                }
                if (name.equals("Personnel") && ic_passport.equals("personnel123")) {
                    error = 3;
                }
            } catch (FileNotFoundException e) {
            }
        }
        return error;
    }

    //apply in loadPeopleTable, loadCentreTable, loadAppointmentTable, loadVaccineTable
    public static int countLine(String fileName) {
        int line = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.readLine() != null) {
                line++;
            }
        } catch (IOException e) {
        }
        return line;
    }

    //apply in record people, vaccine, centre, appointment form
    public static String checkSelected(JTable table) {
        String selected_message = "";
        int row = table.getSelectedRow();

        if (row != -1) {
            selected_message = table.getValueAt(row, 0).toString();
        } else {
            selected_message = "Please select a record";
        }
        return selected_message;
    }

    //apply in appointment, vaccine form and viewModAppointment
    public static void loadCentre(JComboBox centre) {
        try {
            File centrefile = new File("centre.txt");
            Scanner myReader = new Scanner(centrefile);
            while (myReader.hasNextLine()) {
                centre.addItem(myReader.nextLine());
                String data = myReader.nextLine() + myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
        }
    }

    //apply in centre form
    public static int validateModCentre(String contact) {
        int error = 0;
        if (contact.length() < 8 || contact.length() > 11 || contact.matches("[+-]?\\d*(\\.\\d+)?") == false) {
            error = 1;
        }
        return error;
    }

    //apply in apply appointment form
    public static void viewModAppointment(JTextField id, JDateChooser sdate, JComboBox time, JComboBox venue, JComboBox vaccine) {
        RecordAppointmentForm raf = new RecordAppointmentForm();

        try {
            File appointmentfile = new File("appointment.txt");
            Scanner myReader = new Scanner(appointmentfile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String tempdate = myReader.nextLine();

                //find the selected appoinment ID and date
                if (data.equals(raf.GetSelected()) && tempdate.equals(raf.GetSelectedDate())) {
                    id.setText(data);
                    //load selected date
                    try {
                        Date date = new SimpleDateFormat("dd-MM-yyyy").parse(tempdate);
                        sdate.setDate(date);
                    } catch (ParseException ex) {
                        Logger.getLogger(VaccineForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    time.setSelectedItem(myReader.nextLine()); //load selected time
                    AuthenticationHelper.loadCentre(venue); //load available centre
                    venue.setSelectedItem(myReader.nextLine()); //load selected venue
                    vaccine.setSelectedItem(myReader.nextLine()); //load selected vaccine
                } else {
                    String temp = myReader.nextLine() + myReader.nextLine() + myReader.nextLine();
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
        }
    }

    //apply in record appointment form
    public static int checkModAppointmentDate(String selected, String selected_date) {
        int error = 0;
        try {
            File appointmentfile = new File("appointment.txt");
            Scanner myReader = new Scanner(appointmentfile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.equals(selected)) {
                    try {
                        Calendar cal = Calendar.getInstance();
                        cal.add(Calendar.MONTH, 0);
                        String tempdate = myReader.nextLine();
                        Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(tempdate);
                        if (tempdate.equals(selected_date) && date1.before(cal.getTime())) {
                            error = 1;
                        } else {
                            data = myReader.nextLine() + myReader.nextLine() + myReader.nextLine();
                        }
                    } catch (ParseException ex) {
                        Logger.getLogger(VaccineForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } catch (IOException e) {
        }
        return error;
    }
}
