package vaccinesystem;

import java.awt.Color;
import java.awt.Container;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class GUI_Helper {
    public static void setBackground(Container form){
        LoginForm lf = new LoginForm();
        if (lf.GetID() != null && lf.GetID().equals("Personnel")) {
            form.setBackground(new Color(233, 242, 239));
        } else {
            form.setBackground(new Color(228, 237, 242));
        }
    }
    
    //apply in all form
    public static void switchForm(JFrame current, JFrame first_choice, JFrame second_choice){
        LoginForm lf = new LoginForm();      
        if (lf.GetID() != null && lf.GetID().equals("Personnel")) {
            current.setVisible(false);
            first_choice.setVisible(true);
        } else {
            current.setVisible(false);
            second_choice.setVisible(true);
        }
    }
    
    //apply in vaccine, centre, appointment form
    public static void switchFormComplex(JFrame current, JFrame first_choice, JFrame second_choice){
        LoginForm lf = new LoginForm();
        PersonnelMainForm pmf = new PersonnelMainForm();
        if (lf.GetID() != null && lf.GetID().equals("Personnel")) {
            if (pmf.GetFunction() != null && (pmf.GetFunction().equals("add_vaccine") || pmf.GetFunction().equals("add_centre") || pmf.GetFunction().equals("add_appointment"))) {
                current.setVisible(false);
                first_choice.setVisible(true);
            } else {
                current.setVisible(false);
                second_choice.setVisible(true);
            }
        } else {
            current.setVisible(false);
            second_choice.setVisible(true);
        }
    }

    //apply in record people, vaccine, centre, appointment form
    public static String search(String input, DefaultTableModel model, JTable table) {
        String message = "";
        if (input.equals("")) {
            message = "Please enter a search keyword";
        } else {
            TableRowSorter rowSorter = new TableRowSorter(model);
            table.setRowSorter(rowSorter);
            rowSorter.setRowFilter(RowFilter.regexFilter(input, 0, 1));
        }
        return message;
    }
}
