package groceryManagementPackage;

/**
 *
 * @author Wong Yan Wen
 */
//singly linked list
public class CartList {
    private CartNode head;
    private int size;
    
    public CartList(){
        this.head=null;
        this.size=0;
    }
    
    /**
     *  Add a product into the cart according to desired quantity  
     * @param p
     * @param qty
     */
    public void addItem(Product p,int qty){
        
        CartNode newNode=new CartNode(p,qty);
        if (this.isEmpty()){
            head = newNode;
            size++;
        }else {
            newNode.next=head;
            head=newNode;
            size++;
        }
        System.out.println("Product added to cart.");
    }
    
    /**
     * Remove a product from the cart based on product id
     * @param productId
     * @return a cartNode of the removed product
     */
    public CartNode removeItem(int productId){
        CartNode previous=head;
        CartNode removed;
       
        if (this.isEmpty()) {
            System.out.println("Empty cart");
            return null;
        }else if(size==1){
            if (previous.product.getId()==productId){
                removed=previous;
                head=null;
                size--;  
                return removed;
            }
            System.out.println("Product Id Not Found.");
            return null;
        }else{ 
            
            for (int i=0;i<size;i++){
                if (previous.next.product.getId()==productId){
                    removed=previous.next;
                    previous.next=removed.next;
                    size--;
                }
            }
            System.out.println("Product Id Not Found.");
            return null;
        }
    }
    
    /**
     * Update the quantity of a product in the cart.
     * @param productId
     * @param newQty
     */
    public void updateQuantity(int productId, int newQty){
        if (!this.isEmpty()){
            CartNode current = head;
            while (current!=null){
                if (current.next.product.getId()==productId){
                    current.next.quantity=newQty;
                }

                current=current.next;
            } 
        }
        
    }
    
    /**
     * Finds a product based on product id in the cart.
     * @param productId
     * @return a cartNode of the found product 
     */
    public CartNode findItem(int productId){
        if (!this.isEmpty()){
            CartNode current =head;
            while(current!=null){
                if (current.product.getId()==productId){
                    return current;
                }
                current=current.next;
            }
        }else
            System.out.println("Empty Cart");
        return null;
    }
    
    /**
     * Display all products in a cart.
     */
    public void displayCart(){
        System.out.println("==============List of Items in Cart==============");
        System.out.printf("%10s\t%10s\t%10s\t%10s\t%10s\n","id","name","quantity","price(RM)","subtotal(RM)");
        CartNode current = head;
        for (int i=0;i<size;i++){
            
            int currentId= current.product.getId();
            String currentName = current.product.getName();
            int currentQuantity = current.quantity;
            double currentPrice =  current.product.getPrice();
            double currentTotal = currentPrice*currentQuantity;
            System.out.printf("%10d\t%10s\t%10d\t%10.2f\t%10.2f\n",currentId,currentName,currentQuantity,currentPrice,currentTotal);
            current=current.next;
        }
        System.out.printf("TOTAL (RM): %.2f\n",this.calculateTotal());
    }
    
    /**
     * Calculate total of all the products combined in the cart.
     * @return the total price of all products in cart
     */
    public double calculateTotal(){
        double total =0;
         CartNode current = head;
        for (int i=0;i<size;i++){
            int currentQuantity = head.quantity;
            double currentPrice = head.product.getPrice();
            total += currentPrice*currentQuantity;
            current=current.next;
        }
        return total; 
    }
    
    /**
     * Clear the cart.
     */
    public void clear(){
        head=null;
        size=0;
        System.out.println("Cart cleared.");
    }
    
    /**
     *to remove last added item/product
     */
    public CartNode undo(){
        if (size>0){
            CartNode removed=head;
            head = head.next;
            size--;
            System.out.println("Undo scuccessful.");
            return removed;
        }else{
            System.out.println("Empty Cart. Undo Failed.");
            return null;
        }
    }
    
    /**
     * Returns number of items in cart
     * @return the size of the cart
     */
    public int getSize(){
        return this.size;
    }
    
    /**
     * Checks if cart is empty 
     * @return if the cart is empty
     */
    public boolean isEmpty(){
        return size==0;
    }
    
}
