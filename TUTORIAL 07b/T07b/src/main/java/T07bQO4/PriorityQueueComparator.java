/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T07bQO4;

import java.util.Comparator;

 
public class PriorityQueueComparator implements Comparator<String>{ 
    public int compare(String s1, String s2) { 
        if (s1.length() < s2.length()) { 
            return -1; 
        } 
        if (s1.length() > s2.length()) { 
            return 1; 
        } 
        return 0; 
    } 
} 
