package groceryManagementPackage;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Wong Yan Wen
 */
public class Grocery_Store_System {

    public static void displayOptionChoices(){
        System.out.println("\n=========GROCERY STORE SYSTEM==========");
        System.out.println("OPTIONS:");
        System.out.println("0. quit");
        System.out.println("1. Inventory-add product");
        System.out.println("2. Inventory-remove product by id ");
        System.out.println("3. Inventory-search by id");
        System.out.println("4. Inventory-search by name");
        System.out.println("5. Inventory-update stock");
        System.out.println("6. Inventory-display all");
        System.out.println("");
        System.out.println("7. Cart-add item");
        System.out.println("8. Cart-remove item");
        System.out.println("9. Cart-update quantity of product");
        System.out.println("10. Cart-find item by id");
        System.out.println("11. Cart-display cart");
        System.out.println("12. Cart-check out");
        System.out.println("13. Cart-undo last item");
        System.out.println("14. Cart-clear");
        System.out.println("");
        
       }
    
    public static void main(String[] args) {
        InventoryManager inventory = new InventoryManager();
        CartList myCart = new CartList();
        String filename = "inventory.txt";
        inventory.loadFromFile(filename);
        
        Scanner sc= new Scanner(System.in);
        int choice;
        
        do {
            
            displayOptionChoices();
            choice=sc.nextInt();
            
            
            switch(choice){
                
                case 0->{
                    break;
                }
                //add product
                case 1->{
                    
                    int productId;
                    String productName;
                    double productPrice;
                    int productStock;
                    System.out.print("Enter product id: ");
                    productId=sc.nextInt();
                    //clear
                    sc.nextLine();
                    System.out.print("Enter product name: ");  
                    productName=sc.nextLine();
                    do{
                        System.out.print("Enter product price: ");
                        productPrice = sc.nextDouble();
                    }while(productPrice<=0);
                    
                    do{
                        System.out.print("Enter stock:  ");
                        productStock=sc.nextInt();
                    }while(productStock<0);
                    
                    boolean haveDuplicate=inventory.addProduct(new Product(productId, productName, productPrice, productStock));
                    if (!haveDuplicate){
                        inventory.saveToFile(filename);
                    }
                }
                //remove product
                case 2->{
                    int productId;
                    System.out.print("Enter product id: ");
                    productId = sc.nextInt();
                    inventory.removeProduct(productId);

                }
               
                
                //search by id
                case 3->{
                    int productId;
                    System.out.print("Enter product id: ");
                    productId =sc.nextInt();
                    Product p =inventory.searchById(productId);
                    System.out.println("Matching Product: "+p);
                }
                
                //search by name
                case 4 ->{
                    sc.nextLine();
                    String productName;
                    System.out.print("Enter product name: ");
                    productName = sc.nextLine();
                    ArrayList<Product> pList =inventory.searchByName(productName);
                    System.out.println("Matching product names: "+pList+"\n");
                }
                
                //update stock
                case 5->{
                    int productId;
                    int productStock;
                    System.out.print("Enter product id: ");
                    productId = sc.nextInt();
                    if (inventory.searchById(productId)!=null){
                        do{
                            System.out.print("Enter new stock:  ");
                            productStock = sc.nextInt();
                        }while(productStock<0);
                        inventory.updateStock(productId, productStock);
                    }
                
                }
                
                //display all
                case 6->{
                    inventory.displayAll();
                }
                
                //cart - add item
                case 7->{
                    
                    int productId;
                    int quantity;
                    
                    System.out.print("Enter product id: ");
                    productId=sc.nextInt();
                    //clear
                    sc.nextLine();
                    Product p = inventory.searchById(productId);
                    if (p!=null){
                        do{
                            System.out.print("Enter desired quantity: ");  
                            quantity=sc.nextInt();
                        }while(quantity<0);
                        
                        if (inventory.isAvailable(productId, quantity)){
                                myCart.addItem(p, quantity);
                                inventory.updateStock(productId, p.getStock()-quantity);
                        }else{
                            System.out.println("Not available.");
                        }
                    }else{
                        System.out.println("Product id not found.");
                    }
                    
                }
                
                //cart - remove item
                case 8 ->{
                    int productId ;
                    System.out.print("Enter product id: ");
                    productId =sc.nextInt();
                    CartNode removedNode =myCart.removeItem(productId);
                    if (removedNode!=null){
                        inventory.updateStock(productId, removedNode.product.getStock()+removedNode.quantity);
                    }
                
                }
                
                //Cart-update quantity of product
                case 9 ->{
                    int productId;
                    int newQty;
                    
                    System.out.print("Enter product id: ");
                    productId = sc.nextInt();
                    CartNode currentCartNode = myCart.findItem(productId);
                    if (currentCartNode!=null){
                        do {
                            System.out.print("Enter new quantity: ");
                            newQty= sc.nextInt();
                        }while(newQty<=0);
                        
                            int oldQty = currentCartNode.quantity;
                            if (newQty>= currentCartNode.product.getStock()+oldQty){
                                inventory.updateStock(productId, oldQty+currentCartNode.product.getStock());
                                myCart.updateQuantity(productId, newQty);
                                inventory.updateStock(productId, currentCartNode.product.getStock()-newQty);
                            }

                    }
                }
                
                //Cart-find item by id
                case 10 ->{
                    int productId;
                   
                    System.out.print("Enter product id: ");
                    productId = sc.nextInt();
                    CartNode currentCartNode = myCart.findItem(productId);
                    if (currentCartNode!=null){
                        System.out.println("FOUND ITEM BY ID: "+currentCartNode.product.getName()+" "+currentCartNode.quantity);
                    }
                
                }   
                
                // cart
                case 11 ->{
                    myCart.displayCart();
                }
                
                //checkout
                case 12->{
                    myCart.displayCart();
                    double totalNeeded = myCart.calculateTotal();
                    double change = handleTransaction(totalNeeded);
                    System.out.println("Change (RM): "+change);
                    inventory.saveToFile(filename);
                    myCart.clear();
      
                }
                //Cart-undo last item
                case 13-> {
                    CartNode removedPNode = myCart.undo();
                    if (removedPNode!=null){
                        int newStock=removedPNode.quantity+removedPNode.product.getStock();
                        inventory.updateStock(removedPNode.product.getId(),newStock);
                    }
                }
                    
                
                //clear cart
                case 14->{
                   CartNode removedPNode;
                   int productId;
                   int quantity;
                   int newQty;
                    for (int i=0;i<myCart.getSize();i++){
                        removedPNode = myCart.undo();
                        productId = removedPNode.product.getId();
                        quantity=removedPNode.quantity;
                        newQty = quantity+ removedPNode.product.getStock();
                        inventory.updateStock(productId, newQty);
                    }
                    myCart.clear();
                }
            }
        
        }while(choice!=0);
       
        System.out.println("End of Program.");
    }   
    
    public static double handleTransaction(double amountNeeded){
        
        Scanner sc= new Scanner (System.in);
        double amountGiven ;
        do{
            System.out.print("Enter Payment(RM): ");
            amountGiven=sc.nextDouble();
        }while(amountGiven<amountNeeded);
        System.out.println("Payment Successful.");
        return amountGiven-amountNeeded;
    }
    
}
