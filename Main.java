import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Player player = null;

        FileInputStream filein = new FileInputStream("C:\\Users\\aadit\\IdeaProjects\\Project1\\file1.ser");
        ObjectInputStream in = new ObjectInputStream(filein);
        player = (Player) in.readObject();

        in.close();
        filein.close();

        System.out.println(player.name);
        System.out.println(player.age);

        player.display();

        long serialVersionUID = ObjectStreamClass.lookup(player.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);

    }
}