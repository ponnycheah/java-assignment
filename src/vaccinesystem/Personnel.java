package vaccinesystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

public class Personnel extends Registration {
    //load all people records into people table
    public static void loadPeopleTable(DefaultTableModel model) {
        String tempdata = "";
        File peoplefile = new File("people.txt");
        int line = AuthenticationHelper.countLine("people.txt") / 7;
        model.setRowCount(line);
        //loading all data into a temporary string
        try {
            Scanner myReader = new Scanner(peoplefile);
            for (int row = 0; row != line; row++) {
                for (int col = 0; col != 3; col++) {
                    for (int i = 2; i != 0; i--) {
                        while (myReader.hasNextLine() && i != 0) {
                            String data = myReader.nextLine();
                            tempdata = tempdata + data + "\n";
                            break;
                        }
                    }
                    for (int i = 1; i != 0; i--) {
                        while (myReader.hasNextLine() && i != 0) {
                            String data = myReader.nextLine() + myReader.nextLine();
                            data = myReader.nextLine();
                            tempdata = tempdata + data + "\n";
                            data = myReader.nextLine() + myReader.nextLine();
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
            for (int col = 0; col != 3; col++) {
                model.setValueAt(eachdata[i], row, col);
                i++;
            }
        }
    }
}
