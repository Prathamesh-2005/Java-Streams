import java.util.List;
import java.util.stream.Stream;

public class Parallel_streams {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        List<Integer> list= Stream.iterate(1,x->x+1).limit(20000).toList();
       List<Long>factorialList= list.stream().map(Parallel_streams::factorial).toList();
       long endTime=System.currentTimeMillis();
        System.out.println("Time Taken for Sequential Streams:"+(endTime-startTime)+"ms");

         startTime=System.currentTimeMillis();
        factorialList= list.parallelStream().map(Parallel_streams::factorial).toList();
         endTime=System.currentTimeMillis();
        System.out.println("Time Taken for Parallel Streams:"+(endTime-startTime)+"ms");
    }

    private static long factorial(int n){
        long result=1;

        for(int i=2;i<=n;i++){
            result*=i;
        }

        return result;
    }
}
