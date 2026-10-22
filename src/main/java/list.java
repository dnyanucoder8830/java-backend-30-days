import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class list {
    public static void main(String[] args) {
        List<Integer> num=new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(10);
        num.add(30);
        num.add(20);
        num.add(40);
        Set<Integer> remove=new HashSet<>(num);//Hashset remove the duplicates
        System.out.println(remove);
    }
}
