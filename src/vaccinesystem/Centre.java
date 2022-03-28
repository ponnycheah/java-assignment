package vaccinesystem;

import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Centre {

    //load all centre records into centre table
    public static void loadCentreTable(DefaultTableModel model) {
        File centrefile = new File("centre.txt");
        int line = AuthenticationHelper.countLine("centre.txt") / 3;
        model.setRowCount(line);
        try {
            Scanner myReader = new Scanner(centrefile);
            for (int row = 0; row != line; row++) {
                for (int col = 0; col != 3; col++) {
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

    //remove centre based on the selected record
    public static String removeCentre() {
        String newFile = "";
        RecordCentreForm rvf = new RecordCentreForm();
        try {
            File centrefile = new File("centre.txt");
            Scanner myReader = new Scanner(centrefile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.equals(rvf.GetSelected())) {
                    data = myReader.nextLine() + myReader.nextLine();
                } else {
                    newFile = newFile + data + "\n";
                }
            }
        } catch (IOException e) {
        }
        return newFile;
    }

    //validate centre input when adding centre
    public static int validateCentre(String name, String contact, String address) {
        int error = 0;
        //error = 1 => invalid input
        //error = 2 => centre available

        // all data validation (except for ID)
        if (name.length() < 5 || name.length() > 50 || name.matches("[+-]?\\d*(\\.\\d+)?") == true
                || contact.length() < 8 || contact.length() > 11 || contact.matches("[+-]?\\d*(\\.\\d+)?") == false
                || address.length() < 20 || address.length() > 150 || address.matches("[+-]?\\d*(\\.\\d+)?") == true) {
            error = 1;
        }
        try {
            File centrefile = new File("centre.txt");
            Scanner myReader = new Scanner(centrefile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.equals(name) || data.equals(address)) {
                    error = 2;
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
        }
        return error;
    }

    //add centre into centre file
    public static void addCentre(String name, String contact, String address) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("centre.txt", true)))) {
            writer.println(name);
            writer.println(contact);
            writer.println(address);
            writer.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    //modify vaccine by storing all data with modify details in a temporary String
    public static String modifyCentre(String contact, String olddata) {
        String newFile = "";
        String newdata = contact;
        File centrefile = new File("centre.txt");
        String oldFile = "";
        try {
            Scanner myReader = new Scanner(centrefile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                oldFile = oldFile + data + "\n";
                if (data.equals(olddata)) {
                    olddata = myReader.nextLine();
                    oldFile = oldFile + olddata + "\n";
                }
            }
            newFile = oldFile.replaceAll(olddata, newdata);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newFile;
    }

    //formatting JFrame elements for showing not modifiable centre information to users  
    public static void formatCentre(JTextField name, JTextArea address, JScrollPane scroll) {
        name.setEditable(false);
        name.setBorder(null);
        address.setOpaque(false);
        address.setEditable(false);
        scroll.setBorder(null);
    }

    //load selected centre information
    public static void loadCentreInfo(JTextField name, JTextField contact, JTextArea address) {
        RecordCentreForm rcf = new RecordCentreForm();
        try {
            File centrefile = new File("centre.txt");
            Scanner myReader = new Scanner(centrefile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.equals(rcf.GetSelected())) {
                    name.setText(data);
                    contact.setText(myReader.nextLine());
                    address.setText(myReader.nextLine());
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
        }
    }
}
