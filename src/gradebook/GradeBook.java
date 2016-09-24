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
public class GradeBook {

    /**
     * @param args the command line arguments
     */
    private String courseName;
    
    private String instructor_name;

    
    
    public void setInstructorName(String name)
    {
        instructor_name = name;
    }
    
    public String getInstructorName()
    {
        return instructor_name;
    }
    
    public GradeBook(String name)
    {
        courseName = name;
    }
    
    
    
    public void setCourseName(String name)
    {
        courseName = name;
    }
    
    public String getCourseName()
    {
        return courseName;
    }
    
        public void displayMessage()
        {
            System.out.printf("Welcome To The Grade Book For %s!\nThis Course Is Being Conducted By %s\n\n\n", getCourseName(), getInstructorName());
            
           
        }
        
}
 

    

