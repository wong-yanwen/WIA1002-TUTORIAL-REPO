/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T03Q02;

/**
 *
 * @author Wong Yan Wen
 */
public interface BidInterface {

    /*
    example of instance variables in Bid
    private String name ;               name of the company, 
    private double seer;                seer value
    private double performanceTons ;    the performance of the unit (Tons)
    private double performanceBTU       the performance of the unit (BTU)
    private double UnitCost;            the cost of the unit, 
    private double InstallationCost;    the cost of installation.
    */

    //@return the name of the company making this bid. 
    public String getName();
    //@return the description of the air conditioner that this bid is for. 
    public String getDescription();

    //@return the capacity of this bid's AC in tons (1 ton = 12,000 BTU).
    //@postcondition Returns capacity where 1 ton = 12,000 BTU.
    public double getCapacityTons();
    
    /*
    @return the seasonal efficiency of this bid's AC (SEER)
    */
    public double getSEER();
    
    /* 
    @return the cost of this bid's AC. 
    @precondition installationCost and UnitCost must be intialized and positive
    @postconditiomn returns value of bid cost = installationCost + UnitCost
    */
    public double getBidCost();

    //@return the cost of installing this bid's AC. 
    public double getInstallationCost();

    //@return the cost of a unit of AC
    public double getUnitCost();

    /* 
    @return the yearly cost of operating this bid's AC.
    @precondition seer and capacityBTU must be initialized and positive
    @param hourPerDay (hours of usage per day )
    @param daysPerTYear (number of days in use per year) 
    @postcondition returns the value of yearlyCost = (capacityBTU*hoursPerYear*CostPerkWh)/(seer*1000)
    */
    public double getYearlyCost(int hoursPerDay , int daysPerYear);
}
