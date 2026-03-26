
package T02Q05;

import java.util.ArrayList;

/**
 *
 * @author Wong Yan Wen
 */
public class Duo <T,E>{
    T A;
    E B;
    public Duo(T A,E B){
        this.A=A;
        this.B=B;
    }
    
    
    public static void main (String[] args){
        Duo <String,Integer> sideShape=new Duo<>("Hello World",23);
        Duo<Double,Double> points = new Duo<>(12.22,3.33);
        
    }
}
