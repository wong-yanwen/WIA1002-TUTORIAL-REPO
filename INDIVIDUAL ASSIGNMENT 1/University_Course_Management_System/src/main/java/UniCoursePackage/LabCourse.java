/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UniCoursePackage;

/**
 *
 * @author Wong Yan Wen
 */
  public class LabCourse implements Course { 
        private String courseCode; 
        private String courseTitle; 
        private String instructorName; 
        private double labHoursPerWeek; 
        private int numberOfSessions; 
 
        public LabCourse(String courseCode, String courseTitle, String instructorName, double 
labHoursPerWeek, int numberOfSessions) { 
            this.courseCode = courseCode; 
            this.courseTitle = courseTitle; 
            this.instructorName = instructorName; 
            this.labHoursPerWeek = labHoursPerWeek; 
            this.numberOfSessions = numberOfSessions; 
        } 
 
        @Override 
        public String getCourseCode() { 
            return courseCode; 
        } 
 
        @Override 
        public String getCourseTitle() { 
            return courseTitle; 
        } 
 
        // --- MISSING METHOD IMPLEMENTATIONS --- 
        // TODO: Implement getInstructorName() 
        @Override
        public String getInstructorName(){
            return this.instructorName;
        }
        // TODO: Implement calculateTotalWorkload() 
        @Override
        public int calculateTotalWorkload(){
            return (int)labHoursPerWeek*numberOfSessions*14;
        }
        // TODO: Implement printCourseDetails() 
        @Override 
        public void printCourseDetails() { 
            System.out.println("Lab Course: " + courseTitle + " (" + courseCode + ")"); 
            System.out.println("  Instructor: " + instructorName); 
            System.out.println("  Lab Hours/Week: " + labHoursPerWeek); 
            System.out.println("  Total Workload (Semester): " + calculateTotalWorkload() + " hours"); 
        } 
        
        // ------------------------------------------------- 
    
    }