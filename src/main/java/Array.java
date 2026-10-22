import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        List<String> name=new ArrayList<>();
        name.add("Ajay");
        name.add("sanket");
        name.add(null);
        name.add(null);
        name.add("ajay");
        System.out.println(name.get(2));
        name.remove("ajay");
        System.out.println(name);
        System.out.println(name.size());
    }
}
