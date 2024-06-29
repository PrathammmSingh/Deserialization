import java.io.Serializable;

public class Player implements Serializable {

    String name;
    transient int age;

    public void display(){
        System.out.println("hello "+name);
    }

}