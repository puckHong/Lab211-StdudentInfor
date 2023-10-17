/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess;

import common.Library;
import common.Validation;
import java.util.ArrayList;
import java.util.Collections;
import model.Student;

/**
 *
 * @author MINH TUAN
 */
public class StudentInfoAccess {

    Library l;
    Validation vl;

    private StudentInfoAccess() {
        l = new Library();
        vl = new Validation();
    }

    public static StudentInfoAccess instance = null;

    public static StudentInfoAccess Instance() {
        if (instance == null)
            synchronized (StudentInfoAccess.class) {
            if (instance == null) {
                instance = new StudentInfoAccess();
            }
        }
        return instance;
    }

    public void addStudent(ArrayList<Student> s) {
        System.out.println("====== Collection Sort Program ======");
        while (true) {
            System.out.println("Please input student information ");
            String name = l.getName("Name: ");
            String classes = l.getString("Classes: ");
            float mark = l.getMark("Mark: ");
            s.add(new Student(name, mark, classes));
            System.out.println("Do you want to enter more student information?(Y/N): ");
            if (!vl.checkInputYN()) {
                break;
            }
        }
    }

    public void display(ArrayList<Student> s) {
        if (s.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        Collections.sort(s);
        for (int i = 0; i < s.size(); i++) {
            System.out.println("-------- Student " + (i + 1) + " --------");
            System.out.println("Name: " + s.get(i).getName());
            System.out.println("Classes: " + s.get(i).getClasses());
            System.out.println("Mark: " + s.get(i).getMark());
        }
    }
}
