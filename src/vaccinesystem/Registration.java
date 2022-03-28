package vaccinesystem;

import java.io.*;
import java.util.Scanner;

public class Registration {
    public static int validatePeople(String type, String id, String name, String num, String email, String address) {
        int error = 0;
        //error = 0 => no error
        //error = 1 => input error
        //error = 2 => ID number invalid
        //error = 3 => account already registered

        // all data validation (except for ID)
        if (name.length() < 5 || name.length() > 50 || name.matches("[+-]?\\d*(\\.\\d+)?") == true
                || num.length() < 10 || num.length() > 11 || num.matches("[+-]?\\d*(\\.\\d+)?") == false
                || email.contains("@") == false || email.contains(".com") == false
                || address.length() < 20 || address.length() > 150 || address.matches("[+-]?\\d*(\\.\\d+)?") == true) {
            error = 1;
        }

        // ID validation for IC and passport
        if (type.equals("IC Number:")) {
            if (id.length() != 12 || id.matches("[+-]?\\d*(\\.\\d+)?") == false) {
                error = 2;
            }
        } else if (type.equals("Passport Number:")) {
            if (id.length() != 9) {
                error = 2;
            }
        }

        // validation for registered users
        try {
            File peoplefile = new File("people.txt");
            Scanner myReader = new Scanner(peoplefile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.equals(id)) {
                    error = 3;
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
        }
        return error;
    }

    //apply in register form
    public static void addPeople(String id, String name, String age, String gender, String contact, String email, String address) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("people.txt", true)))) {
            writer.println(id);
            writer.println(name);
            writer.println(age);
            writer.println(gender);
            writer.println(contact);
            writer.println(email);
            writer.println(address);
            writer.close();
        } catch (IOException ioe) {
        }
    }

    //apply in modify people form
    public static void modifyPeople(String filePath, String olddata, String newdata, String id) {
        File peoplefile = new File(filePath);
        String file = "";

        try {
            Scanner myReader = new Scanner(peoplefile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                file = file + data + "\n";
                if (data.equals(id)) {
                    break;
                }
            }
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.equals(olddata)) {
                    data = data.replaceFirst(olddata, newdata);
                    file = file + data + "\n";
                    break;
                }
                file = file + data + "\n";
            }
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                file = file + data + "\n";
                if (data.equals(id)) {
                    break;
                }
            }
            FileWriter writer = new FileWriter(peoplefile);
            writer.write(file);
            writer.close();

        } catch (IOException e) {
        }
    }
}
