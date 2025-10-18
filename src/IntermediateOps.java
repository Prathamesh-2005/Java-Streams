import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Prathamesh","Pratham", "Kartik", "Shubham", "Suyash", "Sanket", "Yash");
        //1.Filter
        List<String> f = list.stream()
                .filter(x -> x.startsWith("S")).toList();
        System.out.println(f);
        long res = list.stream().filter(x -> x.startsWith("S")).count();
        System.out.println(res);


        //2.Map
       List<String>ans= list.stream()
               .map(x->x.toUpperCase()).toList();
        System.out.println(ans);

        //3.sorted();
        List<String>sorted=list.stream().sorted().toList();
        System.out.println(sorted);

        //4.Distinct
        System.out.println(list.stream().filter(x->x.startsWith("Pratham")).distinct().count());

        //5.skip
        System.out.println(Stream.iterate(1,x->x+1).skip(10).limit(100).toList());
        
    }
}
