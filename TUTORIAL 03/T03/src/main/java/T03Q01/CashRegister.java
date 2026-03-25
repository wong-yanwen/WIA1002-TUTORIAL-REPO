package T03Q01;

/**
 *
 * @author Wong Yan Wen
 */

public class CashRegister{
    private double cash;
    
    public void acceptMoney(double cash){
        this.cash=cash;
    }

    public double change(double cost){
        return this.cash-cost;
    }
}
