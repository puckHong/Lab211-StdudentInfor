/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

/**
 *
 * @author MINH TUAN
 */
public class Validation {

    Library l;

    public Validation() {
        l = new Library();
    }

    public boolean checkInputYN() {
        while (true) {
            String input = l.getString("Please enter y/Y or n/N: ");

            if (input.equalsIgnoreCase("Y")) {
                return true;
            } else if (input.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Invalid. Try again.");
        }
    }

}
