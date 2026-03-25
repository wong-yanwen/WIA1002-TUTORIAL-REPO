package T01Q01;

public class Telephone {
    String areaCode;
    String number;
    static int numberOfTelephoneObject=0;

    public Telephone(String areaCode , String number){
        this.areaCode = areaCode;
        this.number = number;
        numberOfTelephoneObject++;
    }

    public String makeFullNumber(){
        return areaCode+"-"+number;

    }

}