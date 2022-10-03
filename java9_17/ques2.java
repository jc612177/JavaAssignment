package java9_17;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ques2 {
    public static void main(String[] args) {

        System.out.println(IntStream
                .rangeClosed(1,10)
                .takeWhile(x->x<=5)
                .boxed()
                .collect(Collectors.toList()));

        System.out.println(IntStream
                .rangeClosed(1,10)
                .dropWhile(x->x<=5)
                .boxed()
                .collect(Collectors.toList()));
    }
}