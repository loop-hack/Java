package app;

import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your Name:");
        JOptionPane.showMessageDialog(null, "Hello " + name);
        
        // JOption.showInputDialog always return users input as string
        /*To overcome this problem we need to covert it into int for age
         * We will use Integer.parseInt() to convert it into integer*/
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter you age : "));
        JOptionPane.showMessageDialog(null, "Your age is " + age);
        
        // we will use Double.parseDouble() to covert input into double
        
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your height in cm"));
        JOptionPane.showMessageDialog(null," You are " + height + "cm tall.");
    }
}