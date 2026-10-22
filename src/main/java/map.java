import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<Integer,String> Loan=new HashMap<>();
        Loan.put(1,"Ajay");
        Loan.put(2,"Ajay");
        Loan.put(3,"bali");
        Loan.put(4,"abhi");
        System.out.println(Loan);
        System.out.println(Loan.get(1));
    }
}
