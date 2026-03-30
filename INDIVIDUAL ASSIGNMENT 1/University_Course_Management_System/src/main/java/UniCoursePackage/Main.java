/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UniCoursePackage;

import java.util.ArrayList;

/**
 *
 * @author Wong Yan Wen
 */
public class Main {
    public static void main(String [] args){
        //1.Create at least two `LectureCourse` objects and two `LabCourse` objects with sample data of your choice. 
        LectureCourse lec1 = new LectureCourse("CS101", "Intro to Programming", "Dr. Smith", 3); 
        LectureCourse lec2 = new LectureCourse("CS102", "OOP", "Prof. Lee", 4); 
        LabCourse lab1 = new LabCourse("CS201", "Data Structures Lab", "Prof. Jones", 2.5, 3); 
        LabCourse lab2 = new LabCourse("CS202", "Algorithms Lab", "Dr. Brown", 2.0, 1); 
        Course[] courses = {lec1,lec2,lab1,lab2};
        //2.  Create a `CourseManager` instance. 
        CourseManager manager = new CourseManager ();
        //3.  Add all the created courses to the manager. 
        for (Course eachCourse: courses){
            manager.addCourse(eachCourse);
        }
        
        //4.  Print the details of the course with the highest total workload. 
        Course courseWithHighestWorkload = manager.getCourseWithHighestWorkload();
        System.out.println("\n==================Course with highest workload================");
        courseWithHighestWorkload.printCourseDetails();
        //5.  Sort the courses by their total workload and print all course details. 
        ArrayList<Course> sortedCourse = manager.sortCoursesByWorkload();
        System.out.println("===================Sorted Course by Workload=====================");
        manager.printAllCourses(sortedCourse);
        //6.  Remove a course by its course code and print the remaining course details to confirm it was removed.
        System.out.println("=============Remove a course by course code============");
        System.out.println("Removing CS105: "+manager.removeCourse("CS105"));
        System.out.println("========result of removal==========");
        manager.printAllCourses(manager.list);
        System.out.println("Removing CS101: "+manager.removeCourse("CS101"));
        System.out.println("========result of removal==========");
        manager.printAllCourses(manager.list);
    }
}
