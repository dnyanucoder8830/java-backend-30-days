import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        Set<String> id=new HashSet<>();
        id.add("Ajay");
        id.add("pratiksha");
        id.add(null);
        id.add(null);
        id.add("Ajay");
        System.out.println(id);
        System.out.println(id.size());
     }
}
