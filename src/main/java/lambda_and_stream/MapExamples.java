package lambda_and_stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class MapExamples {

    Collection<String> collection1 = Arrays.asList("a1", "a2", "a3", "a1");
    Collection<String> collection2 = Arrays.asList("1,2,0", "4,5");

    public void mapping(){
        collection1.stream().map((s) -> s + "_1 ").forEach(System.out::print);
        int sum = collection1.stream().map((s) -> s.substring(1)).mapToInt(s -> Integer.valueOf(s)).distinct().sum();
        System.out.println(sum);
        String[] array = collection2.stream().flatMap(s -> Arrays.asList(s.split(",")).stream()).toArray(String[]::new);
        System.out.println(Arrays.toString(array));
        int sum2 = collection2.stream().flatMapToInt(s -> Arrays.asList(s.split(",")).stream().mapToInt(Integer::valueOf)).sum();
        System.out.println(sum2);
    }
}
