/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;

/**
 *
 * @author mac
 */

//import java.util.Scanner;

public class GradeBookTest {
    
    public static void main(String[] args) {
        
        
        
        GradeBook gradeBook1 = new GradeBook("CS213 - Introduction To Object Oriented Programming");
        
        GradeBook gradeBook2 = new GradeBook("CS203 - Introduction To Data Structures");
        
        System.out.printf("GradeBook1 Course Name Is: %s\n\n", gradeBook1.getCourseName());
        
        
        System.out.printf("GradeBook2 Course Name Is: %s\n\n", gradeBook2.getCourseName());
        
        
        System.out.println("Please Enter The Name Of ");
        
//        java.util.Scanner input = new java.util.Scanner(System.in);
//        
//        GradeBook myGradeBook = new GradeBook();
//        
//        System.out.println("Please Enter The Course Name: ");
//        
//        String nameOfCourse = input.nextLine();
//        System.out.println("");
//        
//        myGradeBook.setCourseName(nameOfCourse);
//        
//        myGradeBook.displayMessage(  );
    }
}
