import java.util.ArrayList;
import java.util.List;

public class EjercicioUno {

    public static void main(String[] args) {
        String nombre = "Apple";
        String nombre1 = "Banana";
        String nombre2 = "Cherry";

        List<String> listfruits = new ArrayList<>();

        listfruits.add(nombre);
        listfruits.add(nombre1);
        listfruits.add(nombre2);

        System.out.println(listfruits);

        System.out.println(listfruits.size());
        listfruits.remove(1);
        System.out.println(listfruits);

        listfruits.set(1,"Orange");
        System.out.println(listfruits);

    }
}
