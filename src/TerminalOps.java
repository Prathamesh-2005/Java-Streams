import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3);
        //1.Collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).collect(Collectors.toSet());
        list.stream().skip(1).toList();

        //2.ForEach

        list.stream().forEach(x-> System.out.println(x));


        //3.Reduce /Accumulator

        Optional<Integer> reduce = list.stream().reduce(Integer::sum);
        System.out.println(reduce.get());

        //4.Count

        //5.Anymatch ,allmatch,nonematch

        boolean b=list.stream().anyMatch(x->x%2==0);
        System.out.println(b);
        list.stream().allMatch(x->x>0);
        list.stream().noneMatch(x->x<0);


        //6.findfirst,findany
        list.stream().findFirst();


        //Example -- Filtering and Collecting names
        List<String>name=Arrays.asList("Prathamesh","Jadhav","Bob","Jon");
        System.out.println(name.stream().filter(x->x.length()>3 ).toList());

        //Example -- squaring and sorting numbers

        System.out.println(list.stream().map(x->x*x).sorted().toList());


        //Example --Summing values
        List<Integer>numbers=List.of(1,2,3,4);
        Optional<Integer> sum=numbers.stream().reduce((x, y)->x+y);
        System.out.println(sum.get());

        int sum2 = numbers.stream()
                .reduce((x, y) -> x + y)
                .orElse(0);
        System.out.println(sum2);

        //Example -Counting occurence of a Char;

        String sentence="Hello World";
        int ans= (int) sentence.chars().filter(x->x=='l').count();
        System.out.println(ans);

        //stateful and stateless Operation


    }
}
