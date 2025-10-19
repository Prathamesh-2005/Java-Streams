import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        //Collectors is Utility class

        List<String> names=List.of("Alice","Bob");
        List<String> a = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(a);

        // Collecting to specific Collection
        ArrayDeque<String> collect = names.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));

        //Joining Strings

        String collect1 = names.stream().collect(Collectors.joining(" ."));
        System.out.println(collect1);

        //Summarizing Data
        //Generates Statistical summary(count,max,average,min,sum)
        List<Integer> numbers= Arrays.asList(2,3,5,7,11);
        IntSummaryStatistics collect2 = numbers.stream().collect(Collectors.summarizingInt(x -> x));

        System.out.println("count"+collect2.getCount());
        System.out.println("Maxx"+collect2.getMax());
        System.out.println("Minn"+collect2.getMin());

        //Grouping Elements

        List<String> words=Arrays.asList("Hello","World","Java","C++");
        System.out.println(words.stream().collect(Collectors.groupingBy(x->x.length())));

        //Example : Counting Word Occurence
        String sent = "Hello World ,hello java world";

        Map<String, Long> result = Arrays.stream(sent.toLowerCase().split("\\W+"))
                .filter(s -> !s.isEmpty())
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        System.out.println(result);

        //Example : creating a map of string and freq of it

        List<String> words2=Arrays.asList("apple","banana","apple","banana","Orange");
        Map<String, Integer> collect3 = words2.stream().collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y));
        System.out.println(collect3);

    }
}