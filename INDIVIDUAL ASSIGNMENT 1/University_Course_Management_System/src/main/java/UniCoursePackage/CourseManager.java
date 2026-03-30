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
public class CourseManager <T extends Course> {
    ArrayList<T> list = new ArrayList<>();
    
    /**
     * Adds a course to the manager.
     * @param course
     * 
     */ 
     public void addCourse(T course){
         list.add(course);
     }
    /**
     * Removes a course by its unique code. 
     * @param courseCode
     * @return true if course with the code is removed,false if course with code not found.
     */
    public boolean removeCourse(String courseCode){
        for (int i=0;i<list.size();i++){
            if (list.get(i).getCourseCode().equals(courseCode)){
                list.remove(i);
                return true;
            }       
        }    
        return false;
     }
    /**
     * Retrieves and returns the course with the highest total workload. 
     * @return courseWithMaxWorkload after calculating course workload with highest number
     */
    public T getCourseWithHighestWorkload(){
        T courseWithMaxWorkload=list.get(0);
        int currentWorkload;
        int maxWorkload=list.get(0).calculateTotalWorkload();
        for (int i=1;i<list.size();i++){
            currentWorkload=list.get(i).calculateTotalWorkload();
            if (currentWorkload>maxWorkload){
                courseWithMaxWorkload=list.get(i);
                maxWorkload=currentWorkload;
            }
        }
        return courseWithMaxWorkload;
    }
    
    /**
     *  Sorts the courses by their total workload in ascending order. 
     * @return a sorted list of course by workload (low to high)
     */
    public ArrayList<T> sortCoursesByWorkload(){
        ArrayList<T> copy= new ArrayList<>();
        for (int i=0;i<list.size();i++){
            copy.add(list.get(i));
        }
        
        //number of passes
        for (int i=0;i<copy.size()-1;i++){
            //number of comparisons
            //minus i : to avoid comparing the largest value after the loop
            for (int j=0;j<copy.size()-1-i;j++)
                if (copy.get(j).calculateTotalWorkload()>copy.get(j+1).calculateTotalWorkload()){
                    T temp = copy.get(j);
                    copy.set(j,copy.get(j+1));
                    copy.set(j+1, temp);
                }
        }
            return copy;
    }
    /**
     * Prints the details of all courses in the collection.
     */
    public void printAllCourses(ArrayList<T> a){
        for (int i=0;i<a.size();i++){
            a.get(i).printCourseDetails();
            System.out.println("");
        }
    }
}
