
import java.util.ArrayList;
import model.Student;
import repository.StudentRepository;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MINH TUAN
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        StudentRepository sr = new StudentRepository();

        sr.addStudent(list);
        sr.display(list);

    }
}
