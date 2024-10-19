import java.util.ArrayList;
import java.util.List;

public class EjercicioCuatro {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        list1.add("Date");

        list2.add("Banana");
        list2.add("Date");
        list2.add("Elderberry");
        list2.add("Fig");

        List<String> listcommonElements = new ArrayList<>();

        for (String encontrar : list1) {
            if (list2.contains(encontrar)) {
                listcommonElements.add(encontrar);
            }
        }

        System.out.println("Los elementos comunes de las listas son:"+listcommonElements);


    }
}
