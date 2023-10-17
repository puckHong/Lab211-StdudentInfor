/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Scanner;

/**
 *
 * @author MINH TUAN
 */
public class Library {

    protected Scanner sc;

    public Library() {
        sc = new Scanner(System.in);
    }

    public String getString(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }

    public float getMark(String msg) {
        while (true) {
            String check = getString(msg);
            try {
                float output = Float.parseFloat(check);
                if (output > 100 || output < 0) {
                    System.err.println("Mark must be [0 to 100]. Please input again");
                    continue;
                } else {
                    return output;
                }
            } catch (Exception e) {
                System.err.println("Can't follow wrong data type. Please input again.");
            }
        }
    }
    
    public String getName(String msg) {
        String input = null;

        while (true) {
            input = getString(msg);
            boolean isValid = true;

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (!Character.isLetter(ch) && !Character.isWhitespace(ch)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid && !input.isEmpty()) {
                break;
            }
            System.err.println("Name cannot contain special characters or numbers. Please try again");
        }
        return input;
    }
}
