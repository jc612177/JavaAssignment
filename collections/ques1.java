package collections;
import java.util.ArrayList;
import java.util.List;
public class ques1 {
    public static void main(String[] args) {
           
        List<Float> list = new ArrayList<>();
        list.add(5.6f);
        list.add(6.5f);
        list.add(7.5f);
        list.add(10.4f);
        list.add(9.3f);

        float sum=0;
        
        for (float i : list)
            
        sum += i;
        System.out.println("sum is :" + sum);
    }
}
