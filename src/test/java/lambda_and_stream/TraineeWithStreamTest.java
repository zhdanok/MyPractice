package lambda_and_stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class TraineeWithStreamTest {

    TraineeWithStream traineeWithStream = new TraineeWithStream();

    @Test
    void trainee() {
        traineeWithStream.trainee();
        traineeWithStream.anotherMethods();
        traineeWithStream.factorial();
        traineeWithStream.anyTerminals();
        traineeWithStream.distinctMethod();
    }

    @Test
    void examples() throws Exception {
        List<String> list = Arrays.asList("a1", "a2", "a3", "a1");
        long result = list.stream().filter("a1"::equals).count();
        System.out.println(result);

        String first = list.stream().findFirst().orElse("0");
        System.out.println(first);

        List<String> emptyList = new ArrayList<>();
        String empty = emptyList.stream().skip(list.size() - 1).findAny().orElse("empty");
        System.out.println(empty);

        String third = list.stream().skip(2).findFirst().get();
        System.out.println(third);

        List<String> strs = list.stream().skip(1).limit(2).collect(Collectors.toList());
        System.out.println(strs);

        Set<String> sets = list.stream().collect(Collectors.toSet());
        System.out.println(sets);

        String error = list.stream().filter("jhg"::equals).findFirst().orElseThrow(() -> new Exception("bla bla exception"));
    }
}