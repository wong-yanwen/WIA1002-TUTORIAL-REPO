/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UniCoursePackage;

/**
 *
 * @author Wong Yan Wen
 */
public interface Course {
    /**
     * Returns the course's unique code. 
     * @return course Code 
     */
    public String getCourseCode();

    /**
     * Returns the course's title. 
     * @return the course title
     */
    public String getCourseTitle();

    /**
     *  Returns the total workload hours for the course per semester.
     * @return total workload hours for the course per semester
     */
    public int calculateTotalWorkload();

    /**
     * : Returns the name of the assigned instructor. 
     * @return instructor's name for the course
     */
    public String getInstructorName() ;

    /**
     * Prints all relevant information about the course. 
     */
    public void printCourseDetails();
}
