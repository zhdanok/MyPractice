package lambda_and_stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;


public class StreamOfObjects {
    Collection<People> peoples = Arrays.asList(
            new People("Вася", 16, Sex.MAN),
            new People("Петя", 23, Sex.MAN),
            new People("Вася", 16, Sex.WOMEN),
            new People("Иван Иванович", 69, Sex.MAN)
    );

    public void search() {
        peoples.stream().filter((s) -> (s.getAge() >= 18 && s.getAge() <= 27) && s.getSex() == Sex.MAN).forEach(System.out::println);
        Double avg = peoples.stream().filter((s) -> s.getSex().equals(Sex.MAN)).mapToInt(People::getAge).average().getAsDouble();
        System.out.println(avg);
        peoples.stream().filter((s) -> s.getAge() >= 18).filter((s) -> (s.getSex().equals(Sex.MAN) && s.getAge() < 60) || (s.getSex().equals(Sex.WOMEN) && s.getAge() < 55)).forEach(System.out::println);

    }

    public void compareWithComparator(){
        Comparator<People> compareByName = Comparator.comparing(People::getName);
        Comparator<People> compareByAge = Comparator.comparing(People::getAge);
        Comparator<People> compareBySex = Comparator.comparing(People::getSex);
        peoples.stream().sorted(compareByName.thenComparing(compareByAge).thenComparing(compareBySex)).peek(System.out::println).collect(Collectors.toList());
    }

    private enum Sex {
        MAN,
        WOMEN
    }

    private static class People {
        private final String name;
        private final Integer age;
        private final Sex sex;

        public People(String name, Integer age, Sex sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Sex getSex() {
            return sex;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex=" + sex +
                    '}';
        }

    }
}