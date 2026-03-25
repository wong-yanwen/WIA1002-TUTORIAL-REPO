/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package T03Q01;

/**
 *
 * @author Wong Yan Wen
 */

public class Dispenser{
    private String type;
    private int numOfItems;
    private double costPerItem;

    public Dispenser(String type ,int numOfItems , double costPerItem){
        this.type = type;
        this.numOfItems=numOfItems;
        this.costPerItem=costPerItem;
    }

    public String getType(){return this.type;}

    public int getNumOfItems(){ return this.numOfItems;}

    public double getCostPerItem(){return this.costPerItem;}

    public void dispenseItem(int numRequired){ 
        if (numRequired<=numOfItems){
            numOfItems-=numRequired;
            System.out.println("Successfully dispensed "+numRequired+" "+this.getType());
        }
    }
}
