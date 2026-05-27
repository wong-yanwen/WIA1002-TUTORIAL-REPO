/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T09Q04;

/**
 *
 * @author Wong Yan Wen
 */
public class AddNumTester {
    public int sum(int n){
        if (n==1){
            return n;
        }else{
            return n+sum(n-1);
        }
    
    }
    
    public static void main (String[] args){
        AddNumTester a = new AddNumTester();
        int num = 5;
        System.out.println("Result: "+a.sum(5));
    }

}
