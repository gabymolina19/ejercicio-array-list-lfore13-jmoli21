import java.util.ArrayList;
import java.util.List;

public class EjercicioCinco {

    public static void main(String[] args) {

        List<Integer> listnumbers = new ArrayList<>();
        listnumbers.add(1);
        listnumbers.add(2);
        listnumbers.add(3);
        listnumbers.add(4);
        listnumbers.add(5);

        Integer [] arrayListnumbers = listnumbers.toArray((new Integer[0]));

        System.out.println("Arraylist en un array nativo java:");
        for (int i = 0; i < arrayListnumbers.length; i++) {
            System.out.println("Posición del array: " + i + ": " + arrayListnumbers[i]);
        }


    }
}
