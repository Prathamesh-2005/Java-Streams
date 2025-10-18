import javax.swing.*;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            System.out.println("Hello");
        }
        );
        t1.start();

        Thread t2= new Thread(()->{
            System.out.println("I Love JIT");
        }
        );
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("hhddfv");
            }
        };
        Thread t=new Thread(runnable);


        MathOperation add=(a,b)->a+b;
        int res=add.operate(1,2);
        System.out.println("result is "+res);
        add.c();

        //Predicate
        Predicate<Integer> predicate=x->x%2==0;
        System.out.println(predicate.test(4));

        //Function-->it will work for you
        Function<Integer,Integer> doubleIt=x->2*x;
        System.out.println(doubleIt.apply(100));

        //Consumer -->only consume does not return anything
        Consumer<Integer> consumer=(x)-> System.out.println(x);
        consumer.accept(5);

        List<Integer> list=Arrays.asList(1,2,3);
        Consumer<List<Integer>>printlist=x->{
            for(int i:x)
            {
                System.out.println(i);
            }
        };
        printlist.accept(list);

        //Supplier ->does not take anything just output something
        Supplier<String>give=()->"Hello.sh";
        System.out.println(give.get());

        //Method Reference-->Use Without Invoking and lambda expression
        List<String> students=Arrays.asList("Ram","Shyam","Ghanshyam");

        students.forEach(x-> System.out.println(x));
        students.forEach(System.out::println);

        //Constructor Reference

        List<String >names=Arrays.asList("A","B","C");
        List<Mobile>collect=names.stream().map(Mobile::new).collect(Collectors.toList());


    }


}
class Mobile{
    String name;

    public Mobile(String name){
        this.name=name;
    }
}
@FunctionalInterface
interface MathOperation
{
    int operate(int a,int b);

    default void  c(){
        System.out.println("hi");
    }
}

