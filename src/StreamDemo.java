import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        System.out.println(numbers.stream().filter(x->x%2==0).count());

        //Creating Streams
        //1.From Collections
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream();
        //2.From Arrays
        String[] array={"a","b","c"};
        Arrays.stream(array);

        //3.Using Stream.of()
        Stream<String> stream=Stream.of("a","b");
        //4.Infinite Streams
        Stream<Integer> generate = Stream.generate(() -> 1);
        List<Integer> iterate = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
        System.out.println(iterate);

    }
}
