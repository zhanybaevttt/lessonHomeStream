import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer[]array ={1,3,4,6,7,9,13,18,22};
        List<Integer>list= Arrays.asList(array);

        list.stream().filter(x->x%2==0).map(x->x*x).max(Integer::compare).stream().forEach(System.out::println);




    }
}