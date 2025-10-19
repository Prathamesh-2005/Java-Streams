import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
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

        //6.Peek
        System.out.println(Stream.iterate(1,x->x+1).limit(10).peek(x-> System.out.println(x)).count());


        //7. FlatMap
        List<List<String>> listoflist=Arrays.asList(
                Arrays.asList("Apple","banana"),
                Arrays.asList("Orange","kiwi")
        );
        System.out.println(listoflist.get(1).get(1));
        System.out.println(        listoflist.stream().
                flatMap(x->x.stream().
                        map(y->y.toUpperCase())).
                toList());

        List<String> lines = List.of("I am Coder", "Prathamesh Jadhav");

        lines.stream()
                .map(line -> line.split(" "))
                .flatMap(Arrays::stream)
                .forEach(System.out::println);

    }
}
