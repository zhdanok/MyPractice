package lambda_and_stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TraineeWithStream {

    List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
    Collection<String> ordered = Arrays.asList("a1", "a2", "a2", "a3", "a1", "a2", "a2");
    Collection<String> notOrder = new HashSet<>(ordered);

    public void distinctMethod(){
        System.out.println(notOrder);

    }

    public void trainee() {
        myList.stream().filter((s) -> s.startsWith("c"))
                .map((s) -> s.toUpperCase())
                .sorted()
                .forEach(System.out::println);

        System.out.println(myList);

        long a = myList.stream()
                .filter((s) -> s.contains("1"))
                .count();

        System.out.println(a);
    }

    public void anotherMethods() {
        int result = IntStream.of(7, 16, 54, 1, 56, 12, 2, 3, 2 ,56, 17)
                .filter((s) -> s > 30)
                .reduce(15, Integer::sum);
        System.out.println(result);

    }

    public void factorial(){
        Stream<Integer> factorial = Stream.iterate(1, (s) -> s < 10, (s) -> s +1 );
        Stream<Integer> factorial2 = Stream.iterate(1, (s) -> s < 10, (s) -> s +1 );
        List<Integer> list = factorial.collect(Collectors.toList());
        factorial2.forEach(System.out::println);
        System.out.println(list);
    }

    public void anyTerminals(){
        Integer[] array = {12, 7, 53, 87, 59, 0, -5, 11};
        var a = Arrays.stream(array).filter((s) -> s < 52).max(Integer::compareTo).get();
        var c = Arrays.stream(array).filter((s) -> s < 52).max(Integer::compare).get();
        var b = Arrays.stream(array).max(Integer::compare).get();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
