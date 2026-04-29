package groceryManagementPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Wong Yan Wen
 */
public class InventoryManager {
    private ArrayList <Product> productList = new ArrayList<>();
    /**
     * Reads inventory.txt and populates ArrayList
     * @param fileName
     */
    public void loadFromFile(String fileName){
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            System.out.println("Loading file starts.");
            String line;
            while((line=br.readLine())!=null && !line.equals("")){
                String[] data = line.split(",");
                Product product = new Product(Integer.parseInt(data[0]),data[1],Double.parseDouble(data[2]),Integer.parseInt(data[3]));
                productList.add(product);             
            }
            System.out.println("Product added to list successfully.");
            System.out.println(productList);
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());  
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("End of loading file.");
        }  
    }
    
    /**
     *Writes current inventory to file 
     * @param fileName
     */
    public void saveToFile(String fileName){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter (fileName))){
            Product product;
            for (int i=0;i<productList.size();i++){
                product=productList.get(i);
                
                bw.write(product.getId()+","+product.getName()+","+product.getPrice()+","+product.getStock()+"\n");
            }
            System.out.println("Successfully saved current inventory to file.");
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("End of saving file process.");
        }
    }
    
    /**
     * Adds product to ArrayList (check duplicate ID) 
     * @param p
     */
    public boolean addProduct(Product p){
        boolean haveDuplicate =false;
        for (int i=0;i<productList.size();i++){
            if (productList.get(i).getId()==p.getId()){
                haveDuplicate = true;
            }
        }
        
        if(!haveDuplicate){
            productList.add(p);
            System.out.println("Product added to list successfully.");
        }else{
            System.out.println("Duplicate product found. Product not added.");
        }
        
        return haveDuplicate;
    }
    
    /**
     * Removes product by ID
     * @param id
     */
    public void removeProduct(int id){
        boolean hasRemoved=false;
        for (int i=0;i<productList.size();i++){
            if (productList.get(i).getId()==id){
            productList.remove(productList.get(i));
            hasRemoved = true;
            break;
            }
        }
        
        if (hasRemoved){
            System.out.println("Product removed successfully.");
        }else{
            System.out.println("Product not found.");
        }
    }
    
    /**
     * Returns product or null
     * @param id
     * @return a product that matches the id , null if no matching id
     */
    public Product searchById(int id){
        if(!productList.isEmpty()){
            for (int i=0;i<productList.size();i++){
                if (productList.get(i).getId()==id){
                    return productList.get(i);
                }
            }
        }
        System.out.println("Empty Inventory. ");
        return null;
    }
    
    /**
     *Returns ArrayList of matching products 
     * @param name
     * @return  an ArrayList of matching products
     */
    public ArrayList<Product> searchByName(String name){
        ArrayList<Product> matchingNameList = new ArrayList <>();
        if(!productList.isEmpty()){
           
            for (int i=0;i<productList.size();i++){
                if (productList.get(i).getName().equals(name)){
                    matchingNameList.add(productList.get(i));
                }
            }
            return matchingNameList;
        }
        System.out.println("Empty Inventory. ");
        return null;
    }
    
    /**
     * Updates stock quantity 
     * @param id
     * @param newStock
     */
    public void updateStock(int id, int newStock){
        if (!productList.isEmpty()){
            for (int i=0;i<productList.size();i++){
                if (productList.get(i).getId()==id){
                    productList.get(i).setStock(newStock);
                    System.out.println("Product stock updated. ");
                    return;
                }
            } 
            System.out.println("Product not found.");
        }else{
            System.out.println("Empty Inventory.");
        }
    }
    
    /**
     * Prints all products in table format
     */
    public void displayAll(){
        System.out.println("All product: ");
        System.out.printf("%10s\t%10s\t%10s\t%10s\n","ID","NAME","PRICE(RM)","STOCK");
        for (int i=0;i<productList.size();i++){
            System.out.println(productList.get(i).toString());
        }System.out.println("");
    }
    
    /**
     * Returns product for cart operations
     * @param id
     */
    public Product getProductById(int id){
        return searchById(id);
    }
    
    /**
     * Checks if sufficient stock exists 
     * @param id
     * @param requestedQty
     * @return the boolean value true if requested quantity is less than or equal to stock
     */
    public boolean isAvailable(int id,int requestedQty){
        Product p= this.getProductById(id);
        return p!=null && p.getStock()>=requestedQty;
    }
}
