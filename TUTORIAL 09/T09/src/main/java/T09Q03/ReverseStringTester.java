/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package T09Q03;

/**
 *
 * @author Wong Yan Wen
 */
public class ReverseStringTester {

    
    public String reverse(String l, int lengthOfString){
        if (lengthOfString<1){
            return "";
        }
        if (lengthOfString==1){
            return String.valueOf(l.charAt(0));
        }else{
            return (l.charAt(lengthOfString-1))+reverse(l,lengthOfString-1);

        }
    }
    public static void main(String[] args) {
        ReverseStringTester r = new ReverseStringTester();
        String s1 = "String";
        String s2 = r.reverse(s1,s1.length());
        System.out.println("Before reverse: "+s1);
        System.out.println("After reverse: "+s2);
    }
}
