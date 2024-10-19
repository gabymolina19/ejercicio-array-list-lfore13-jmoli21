import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EjercicioDos {

    public static void main(String[] args) {

        /*int numero = 1;
        int numero1 = 2;
        int numero2 = 3;
        int numero3 = 4;
        int numero4 = 5;*/



        List<Integer> listnumbers = new ArrayList<>();

        listnumbers.add(1);
        listnumbers.add(2);
        listnumbers.add(3);
        listnumbers.add(4);
        listnumbers.add(5);


        System.out.println(listnumbers);

        System.out.println("Blucle for que imprime los elementos:");
        for (int i = 0; i < listnumbers.size(); i++) {
            System.out.println(listnumbers.get(i));
        }

        System.out.println("Bucle for-each que imprime los elementos:");
        for (Integer listnumero : listnumbers) {
            System.out.println(listnumero);
        }

        int ultimowhile = listnumbers.size() -1;
        System.out.println("Bucle while imprime los elementos inverso");
        while (ultimowhile >= 0) {
            System.out.println(listnumbers.get(ultimowhile));
            ultimowhile--;
        }



    }
}
