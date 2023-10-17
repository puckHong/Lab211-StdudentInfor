/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.ArrayList;
import model.Student;

/**
 *
 * @author MINH TUAN
 */
public interface IStudentRepository {

    void addStudent(ArrayList<Student> s);

    void display(ArrayList<Student> s);
}
