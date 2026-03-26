package T02Q01;

/**
 *
 * @author Wong Yan Wen
 */
public class Container <T>{
    private T t;
    public Container(){}

    public void initialization(T newT){
        this.t =newT;
    }

    public T retrieve(){
        return this.t;
    }
    

    public static void main (String[] args){
        Container<Integer> c1 = new Container <> ();
        Container <String> c2 = new Container <> ();
        c1.initialization(50);
        c2.initialization("Java");
        System.out.println(c1.retrieve());
        System.out.println(c2.retrieve());

    }

}