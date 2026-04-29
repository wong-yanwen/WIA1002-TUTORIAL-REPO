package groceryManagementPackage;

/**
 *
 * @author Wong Yan Wen
 */
public class CartNode {
    //reference to product (from university)
    Product product;
    int quantity;
    CartNode next ;
    
    public CartNode(Product product, int quantity){
        this.product = product;
        this.quantity=quantity;
    }
    
   
}

