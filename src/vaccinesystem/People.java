package vaccinesystem;

import java.io.*;
import java.util.Scanner;
import javax.swing.*;

public class People extends Registration {
    //load selected people information
    public static void loadPeopleInfo(JLabel title, JFrame form, JLabel id, JTextField name, JSpinner age, JComboBox gender, JTextField contact, JTextField email, JTextArea address) {
        RecordPeopleForm rpf = new RecordPeopleForm();
        LoginForm lf = new LoginForm();
        try {
            File peoplefile = new File("people.txt");
            Scanner myReader = new Scanner(peoplefile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.equals(lf.GetID())) {
                    title.setText("My Account (Modifiable)");
                    form.setTitle("My Account");
                    id.setText(lf.GetID());
                    name.setText(myReader.nextLine());
                    age.setValue(Integer.parseInt(myReader.nextLine()));
                    gender.setSelectedItem(myReader.nextLine());
                    contact.setText(myReader.nextLine());
                    email.setText(myReader.nextLine());
                    address.setText(myReader.nextLine());
                } else if (data.equals(rpf.GetSelected())) {
                    id.setText(rpf.GetSelected());
                    name.setText(myReader.nextLine());
                    age.setValue(Integer.parseInt(myReader.nextLine()));
                    gender.setSelectedItem(myReader.nextLine());
                    contact.setText(myReader.nextLine());
                    email.setText(myReader.nextLine());
                    address.setText(myReader.nextLine());
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
        }
    }
}
