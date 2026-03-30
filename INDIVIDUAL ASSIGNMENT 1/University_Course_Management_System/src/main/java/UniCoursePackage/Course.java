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
    public String getCourseCode();
    public String getCourseTitle();
    public int calculateTotalWorkload();
    public String getInstructorName() ;
    public void printCourseDetails();
}
