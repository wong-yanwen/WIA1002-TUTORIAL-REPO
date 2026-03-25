package T03Q02;

public interface BidCollectionInterface {
    /**
     * Adds a bid to this collection.
     * @param newBid
     * @param 
     * @postcondition the collection size increase by one
    */
    public void addBid (BidInterface newBid);

    /**
    * @return  the bid in this collection with the best yearly cost. 
    * @precondition yearlyCost for every Bid object is calculated
    * @precondition collection must possessed one or more Bid object
    * @params hoursPerDay (hours of usage per day)
    * @params daysPerYear (days of usage per year)
    * @postcondition returns bid with bid cost lowest numerical value of bid cost
    */
    public BidInterface bestYearlyCost(int hoursPerDay, int daysPerYear);

    /**
     * @return the bid in this collection with the best initial cost. The initial cost will be defined 
as the unit cost plus the installation cost. 
     * @precondition unitCost and installation cost in initialized and positive
     * @postcondition  returns Bid object with the lowest numerical value for yearly cost
     */
    public BidInterface bestInitialCost();

    /**
     * Clears all of the items from this collection.
     * @precondition collection is not empty
     * @postcondition collection is fully empty
     */
    public void clearCollection();

    /**
     * @return the number of items in this collection.  
     */
    public int numberOfItems();

    /**
     *  Sees whether this collection is empty
     * @return boolean value , true if empty , false if not empty
     */
    public boolean collectionIsEmpty();
    
}   
