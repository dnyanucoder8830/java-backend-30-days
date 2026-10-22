import java.util.HashMap;
import java.util.Map;

public class Count {
    public static void main(String[] args) {
        String subject ="java spring java sql java spring";
        Map<String,Integer> word=new HashMap<>();
        for(String text: subject.split(" ")){
            word.put(text,word.getOrDefault(text,0)+1);
        }
        System.out.println(word);

    }
}
