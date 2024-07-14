package assessment;

import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DoubleNumbersExample {
    public static void main(String[] args) {
        Consumer<Integer> numberPrinter = number -> System.out.println(number * 2);

        Stream<Integer> myStream = Stream.iterate(1,num -> num+1).limit(10);
        myStream.forEach(numberPrinter);
    }
}

