package vaccinesystem;

import com.toedter.calendar.JDateChooser;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Vaccine {

    //load all vaccine records into vaccine table
    public static void loadVaccineTable(DefaultTableModel model) {
        String tempdata = "";
        File vaccinefile = new File("vaccine.txt");
        int line = AuthenticationHelper.countLine("vaccine.txt") / 7;
        try {
            model.setRowCount(line);
            Scanner myReader = new Scanner(vaccinefile);
            //loading all data into a temporary string
            for (int row = 0; row != line; row++) {
                for (int col = 0; col != 4; col++) {
                    for (int i = 3; i != 0; i--) {
                        while (myReader.hasNextLine() && i != 0) {
                            String data = myReader.nextLine();
                            tempdata = tempdata + data + "\n";
                            break;
                        }
                    }
                    for (int i = 1; i != 0; i--) {
                        while (myReader.hasNextLine() && i != 0) {
                            String data = myReader.nextLine() + myReader.nextLine() + myReader.nextLine();
                            data = myReader.nextLine();
                            tempdata = tempdata + data + "\n";
                            break;
                        }
                    }
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
        }
        //split string into an array
        String[] eachdata = tempdata.split("\n");

        //load the array into people table
        int i = 0;
        for (int row = 0; row != line; row++) {
            for (int col = 0; col != 4; col++) {
                model.setValueAt(eachdata[i], row, col);
                i++;
            }
        }
    }

    //remove vaccine based on the selected record
    public static String removeVaccine() {
        String newFile = "";
        RecordVaccineForm rvf = new RecordVaccineForm();
        try {
            File vaccinefile = new File("vaccine.txt");
            Scanner myReader = new Scanner(vaccinefile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.equals(rvf.GetSelected())) {
                    data = myReader.nextLine() + myReader.nextLine() + myReader.nextLine() + myReader.nextLine() + myReader.nextLine() + myReader.nextLine();
                } else {
                    newFile = newFile + data + "\n";
                }
            }
        } catch (IOException e) {
        }
        return newFile;
    }

    //validate vaccine input when adding vaccine
    public static int validateVaccine(String id, String name, String country) {
        int error = 0;

        //all data validation
        if (id.length() < 5
                || id.length() > 10
                || name.equals("")
                || country.length() < 4
                || country.length() > 56
                || country.matches("[+-]?\\d*(\\.\\d+)?") == true) {
            error = 1;
        }
        try {
            File vaccinefile = new File("vaccine.txt");
            Scanner myReader = new Scanner(vaccinefile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.equals(id)) {
                    error = 2;
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
        }
        return error;
    }

    //add vaccine into vaccine file
    public static void addVaccine(Date macdate, Date expdate, String id, String name, String origin, String quantity, String choice) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            String temp_macdate = sdf.format(macdate);
            String temp_expdate = sdf.format(expdate);
            try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("vaccine.txt", true)))) {
                writer.println(id);
                writer.println(name);
                writer.println(origin);
                writer.println(temp_macdate);
                writer.println(temp_expdate);
                writer.println(quantity);
                writer.println(choice);
                writer.close();
            } catch (IOException ioe) {
            }
        } catch (Exception e) {
        }
    }

    //modify vaccine by storing all data with modify details in a temporary String
    public static String modifyVaccine(String id, String quantity, String choice) {
        String olddata = id;
        String newFile = "";
        try {
            File vaccinefile = new File("vaccine.txt");
            Scanner myReader = new Scanner(vaccinefile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                newFile = newFile + data + "\n" + myReader.nextLine() + "\n" + myReader.nextLine() + "\n" + myReader.nextLine() + "\n" + myReader.nextLine() + "\n";
                if (data.equals(olddata)) {
                    newFile = newFile + quantity + "\n" + choice + "\n";
                    data = myReader.nextLine() + myReader.nextLine();
                } else {
                    newFile = newFile + myReader.nextLine() + "\n" + myReader.nextLine() + "\n";
                }
            }
        } catch (IOException ioe) {
        }
        return newFile;
    }

    //setting the available date range for date chooser
    public static void setVaccineDateRange(JDateChooser macdate, JDateChooser expdate) {
        Calendar cal = Calendar.getInstance();
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        Calendar cal3 = Calendar.getInstance();
        cal.add(Calendar.MONTH, -1);//1 month before
        cal1.add(Calendar.DATE, -3);//3 day before
        cal2.add(Calendar.MONTH, 6);//6 month after
        cal3.add(Calendar.YEAR, 1);//1 year after
        Date min = cal.getTime();
        Date max = cal1.getTime();
        Date min1 = cal2.getTime();
        Date max1 = cal3.getTime();
        macdate.setDate(max);
        expdate.setDate(min1);
        //set range of calendar
        macdate.setSelectableDateRange(min, max);
        expdate.setSelectableDateRange(min1, max1);
    }

    //formatting JFrame elements for showing not modifiable vaccine information to users 
    public static void formatVaccine(JTextField id, JTextField name, JTextField origin, JDateChooser mac, JDateChooser exp) {
        id.setEditable(false);
        id.setBorder(null);
        name.setEditable(false);
        name.setBorder(null);
        origin.setEditable(false);
        origin.setBorder(null);
        mac.setVisible(false);
        exp.setVisible(false);
    }

    //load selected vaccine information
    public static void loadVaccineInfo(JTextField id, JTextField name, JTextField origin, JLabel mac, JLabel exp, JLabel quantity, JLabel centre) {
        RecordVaccineForm rvf = new RecordVaccineForm();
        try {
            File vaccinefile = new File("vaccine.txt");
            Scanner myReader = new Scanner(vaccinefile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.equals(rvf.GetSelected())) {
                    id.setText(data);
                    name.setText(myReader.nextLine());
                    origin.setText(myReader.nextLine());
                    mac.setText(myReader.nextLine());
                    exp.setText(myReader.nextLine());
                    quantity.setText(myReader.nextLine());
                    centre.setText(myReader.nextLine());
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
        }
    }

    //load selected vaccine information that is modifiable
    public static void loadModVaccineInfo(JTextField id, JTextField name, JTextField origin, JLabel mac, JLabel exp, JSpinner quantity, JLabel centre) {
        RecordVaccineForm rvf = new RecordVaccineForm();
        try {
            File vaccinefile = new File("vaccine.txt");
            Scanner myReader = new Scanner(vaccinefile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.equals(rvf.GetSelected())) {
                    id.setText(data);
                    name.setText(myReader.nextLine());
                    origin.setText(myReader.nextLine());
                    mac.setText(myReader.nextLine());
                    exp.setText(myReader.nextLine());
                    quantity.setValue(Integer.parseInt(myReader.nextLine()));
                    centre.setText(myReader.nextLine());
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
        }
    }
}
