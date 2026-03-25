package T03Q01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Wong Yan Wen
 */


public class CandyMachine{
    Dispenser candies = new Dispenser("candies",10,1.00);
    Dispenser chips = new Dispenser ("chips",10,2.00);
    Dispenser gum = new Dispenser ("gum",10,0.50);
    Dispenser cookies = new Dispenser("cookies",10,5.00);
    CashRegister register = new CashRegister();
    ArrayList <Dispenser> list = new ArrayList<>();

    public CandyMachine(){
        list.add(candies);
        list.add(chips);
        list.add(gum);
        list.add(cookies);
    }
    

    public void showProduct(){
        for (int i=0;i<list.size();i++){
            System.out.println(i+" "+list.get(i).getType()+"\t"+list.get(i).getCostPerItem());
        }
    }

    public void selectProduct(int index,int numRequired){
        Dispenser selected = list.get(index);
        if (numRequired <selected.getNumOfItems()){
            double totalCost = selected.getCostPerItem()*numRequired;
            System.out.println("Item selected\t: "+selected.getType());
            System.out.println("Quantity\t: "+numRequired);
            System.out.println("Total Cost\t: "+totalCost);

        handleTransaction(selected,numRequired);

        }
    }

    public void handleTransaction (Dispenser selectedType , int numRequired){
        Scanner sc = new Scanner (System.in);
        double payment;
        do{
            System.out.print("Enter amount\t: ");
            payment = sc.nextDouble();
        }while(payment<selectedType.getCostPerItem()*numRequired);
        register.acceptMoney(payment);
        System.out.println("Change\t: "+register.change(selectedType.getCostPerItem()));
        selectedType.dispenseItem(numRequired);
        
    }
    
}
