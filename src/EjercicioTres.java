import java.util.ArrayList;
import java.util.List;

public class EjercicioTres {

    public static void main(String[] args) {

        List<Integer> listnumbers = new ArrayList<>();

        listnumbers.add(1);
        listnumbers.add(2);
        listnumbers.add(3);
        listnumbers.add(4);
        listnumbers.add(5);
        listnumbers.add(6);
        listnumbers.add(7);
        listnumbers.add(8);
        listnumbers.add(9);
        listnumbers.add(10);

        System.out.println("lista de numeros del 1 al 10"+listnumbers);

        List<Integer> listevenNumbers = new ArrayList<>();

        listevenNumbers.add(2);
        listevenNumbers.add(4);
        listevenNumbers.add(6);
        listevenNumbers.add(8);
        listevenNumbers.add(10);

        System.out.println("lista de numeros pares"+listevenNumbers);
    }
}
