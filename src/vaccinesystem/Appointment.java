package vaccinesystem;

import java.io.*;
import java.text.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Appointment {
    
    //load all appointment records into appointment table
    public static void loadAppointmentTable(DefaultTableModel model){
        File appointmentfile = new File("appointment.txt");
        int line = AuthenticationHelper.countLine("appointment.txt") / 5;
        model.setRowCount(line);
        try {
            Scanner myReader = new Scanner(appointmentfile);
            for (int row = 0; row != line; row++) {
                for (int col = 0; col != 5; col++) {
                    while (myReader.hasNextLine()) {
                        String data = myReader.nextLine();
                        model.setValueAt(data, row, col);
                        break;
                    }
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
        }
    }
    
    //load all appointment records belongs to the login user into appointment table
    public static void loadUserAppointmentTable(DefaultTableModel model) {
        LoginForm lf = new LoginForm();
        String tempdata = "";
        int line = 0;
        File appointmentfile = new File("appointment.txt");
        try {
            Scanner myReader = new Scanner(appointmentfile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (lf.GetID().equals(data)) {
                    tempdata = tempdata + myReader.nextLine() + "\n" + myReader.nextLine() + "\n" + myReader.nextLine() + "\n" + myReader.nextLine() + "\n";
                    line++;
                }
            }
            myReader.close();
            model.setRowCount(line);
            
            //split string into an array
            String[] eachdata = tempdata.split("\n");

            //load the array into people table
            int i = 0;
            for (int row = 0; row != line; row++) {
                for (int col = 1; col != 5; col++) {
                    model.setValueAt(eachdata[i], row, col);
                    i++;
                }
            }
        } catch (FileNotFoundException e) {
        }
    }
    
    //validate appointment input when adding appointment
    public static int validateAppointment(String id, String venue, String vaccine) {
        LoginForm lf = new LoginForm();
        String current;
        int error = 0;
        //error = 1 => invalid ic/passport
        //error = 2 => booking available
        //error = 3 => no vaccine/venue selected

        if (lf.GetID().equals("Personnel")) {
            current = id;
            error = 1;
            try {
                File peoplefile = new File("people.txt");
                Scanner myReader = new Scanner(peoplefile);
                while (myReader.hasNextLine()) {
                    if (id.equals(myReader.nextLine())) {
                        error = 0;
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
            }
        } else {
            current = lf.GetID();
        }

        try {
            File appointmentfile = new File("appointment.txt");
            Scanner myReader = new Scanner(appointmentfile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.equals(current)) {
                    try {
                        Calendar cal = Calendar.getInstance();
                        cal.add(Calendar.MONTH, 0);
                        Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(myReader.nextLine());
                        if (date1.after(cal.getTime())) {
                            error = 2;
                        }
                    } catch (ParseException ex) {
                        Logger.getLogger(VaccineForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
        }

        if (venue.equals("") || vaccine.equals("")) {
            error = 3;
        }
        return error;
    }
    
    //modify appointment by storing all data with modify details in a temporary String
    public static String modifyAppointment(Date date, String time, String venue, String vaccine) {
        String newFile = "";
        RecordAppointmentForm raf = new RecordAppointmentForm();
        try {
            File appointmentfile = new File("appointment.txt");
            Scanner myReader = new Scanner(appointmentfile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String tempdate = myReader.nextLine();
                if (data.equals(raf.GetSelected()) && tempdate.equals(raf.GetSelectedDate())) {
                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                    newFile = newFile + data + "\n" + sdf.format(date) + "\n" + time + "\n" + venue + "\n" + vaccine + "\n";
                    String temp = myReader.nextLine() + myReader.nextLine() + myReader.nextLine();
                } else {
                    newFile = newFile + data + "\n" + tempdate + "\n" + myReader.nextLine() + "\n" + myReader.nextLine() + "\n" + myReader.nextLine() + "\n";
                }
            }
        } catch (IOException e) {
        }
        return newFile;
    }
    
    //add appointment into appointment file
    public static void addAppointment(Date date, String id, String time, String venue, String vaccine) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            String ndate = sdf.format(date);
            try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("appointment.txt", true)))) {
                writer.println(id);
                writer.println(ndate);
                writer.println(time);
                writer.println(venue);
                writer.println(vaccine);
                writer.close();
            } catch (IOException ioe) {
            }
        } catch (Exception e) {
        }
    }
    
    //remove appointment based on the selected record
    public static String removeAppointment(String selected, String selected_date) {
        String newFile = "";
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
                        if (tempdate.equals(selected_date)) {
                            if (date1.before(cal.getTime())) {
                                error = 1;
                                newFile = newFile + data + "\n" + tempdate + "\n" + myReader.nextLine() + "\n" + myReader.nextLine() + "\n" + myReader.nextLine() + "\n";
                            } else {
                                data = myReader.nextLine() + myReader.nextLine() + myReader.nextLine();
                            }
                        } else {
                            newFile = newFile + data + "\n" + tempdate + "\n" + myReader.nextLine() + "\n" + myReader.nextLine() + "\n" + myReader.nextLine() + "\n";
                        }
                    } catch (ParseException ex) {
                        Logger.getLogger(VaccineForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    newFile = newFile + data + "\n";
                }
            }
            if (error == 1) {
                newFile = "Appointment not able to cancel";
            }
        } catch (IOException e) {
        }
        return newFile;
    }
}
