package groceryManagementPackage;

/**
 *
 * @author Wong Yan Wen
 */
public class Product {
    private int id;
    private String name;
    private double price;
    private int stock;
    
    public Product(int id, String name, double price, int stock){
        this.id =id;
        this.name = name;
        this.price =price;
        this.stock=stock;
    }
    
    //GETTER METHODS
    /**
     * Return id of a product
     *@return id of a product 
     */
    public int getId(){ 
        return this.id;
    }
    
    
    /**
     *Returns name of the product
     * @return name of the product
     */
    public String getName(){
        return this.name;
    }
    
    /**
     *Return price per unit of a product
     * @return price per unit of product
     */
    public double getPrice(){
        return this.price;
    }
    
    /**
     *Return number of stock of product left
     * @return number of stock of product left
     */
    public int getStock(){
        return this.stock;
    }
    
    //SETTER METHODS
    /**
     * Sets the id of a product
     * @param id
     */
    public void setId(int id){
        this.id =id;
    }
    
    /**
     *Set the name of the product
     * @param name
     */
    public void setName(String name){
        this.name =name;
    }
    
    /**
     * Set the price per unit of a product
     * @param price
     */
    public void setPrice(double price){
        this.price= price;
    }
    
    /**
     * Set the number of stock of a product
     * @param stock
     */
    public void setStock(int stock){
        this.stock=stock;
    }
    
    @Override
    public String toString(){
        String myStr = "%10d\t%10s\t%10.2f\t%10d\n";
        String result = String.format(myStr,this.id,this.name,this.price,this.stock);
        return result;
    }
}

