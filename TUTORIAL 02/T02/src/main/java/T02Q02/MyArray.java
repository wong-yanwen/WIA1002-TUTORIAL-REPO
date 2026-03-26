/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T02Q02;

/**
 *
 * @author Wong Yan Wen
 */

public class MyArray <T> {
    public static void create3Arrays(){
        Integer[] arr1= {1,2,3,4,5};
        String[] arr2 = {"Jane","Tom","Bob"};
        Character [] arr3 = {'a','b','c'};
        
        MyArray a1 = new MyArray ();
        
        a1.listAll(arr1);
        a1.listAll(arr2);
        a1.listAll(arr3);
    }

    public  void listAll(T[] array){    
        System.out.print("Array: ");
        for (T eachEntry : array){
            System.out.print(eachEntry+" ");
        }
        System.out.println();    
    }

    public static void main (String[] args){
        create3Arrays();
    }

}