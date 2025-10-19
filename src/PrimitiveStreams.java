import java.util.Arrays;
import java.util.stream.IntStream;

public class PrimitiveStreams {
    public static void main(String[] args) {
        int [] num={1,2,3,4,5};
        IntStream stream = Arrays.stream(num);
        stream.boxed();
    }
}
