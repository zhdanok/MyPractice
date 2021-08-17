package lambda_and_stream;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterfaces {

    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> (3 + 7);
        Runnable runnable = () -> System.out.println(supplier.get());
        runnable.run();
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(supplier.get());
        Function<String, Integer> function = Integer::valueOf;
        function.apply("19");
        consumer.accept(function.apply("1235"));

    }
}
