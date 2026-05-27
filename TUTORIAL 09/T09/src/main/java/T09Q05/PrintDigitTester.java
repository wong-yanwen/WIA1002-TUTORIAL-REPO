/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T09Q05;

/**
 *
 * @author Wong Yan Wen
 */
public class PrintDigitTester {
    public void printDigit(int n){
        if (n<10){
            System.out.print(n+" ");
        } else {
            //call method
            printDigit(n/10);
            // print last digit
            System.out.print(n%10+" ");
        }
    }
    
    public static void main (String[] args){
        PrintDigitTester p = new PrintDigitTester();
        p.printDigit(4567);
    }
}
