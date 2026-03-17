package T01Q01;


public class TelephoneTester {
    public static void main (String[] args){
        Telephone t0= new Telephone ("03","79676300");
        Telephone t1= new Telephone ("03","79676301");
        Telephone t2= new Telephone ("03","79676302");
        Telephone t3= new Telephone ("03","79676303");
        Telephone t4= new Telephone ("03","79676304");

        Telephone[] allTelephones = {t0,t1,t2,t3,t4};

        for (Telephone eachT : allTelephones){
            System.out.println(eachT.makeFullNumber());
        }
    }

}

