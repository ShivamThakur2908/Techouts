package assessment;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrintFilteredNumbers {
	public static void main(String[] args) {
        Consumer<Integer> numberPrinter = new Consumer<Integer>() {
            @Override
            public void accept(Integer number) {
                System.out.println(number);
            }
        };

        Stream<Integer> myStream = Stream.iterate(1,num -> num+1).limit(10).filter(n -> n < 3 || n > 7);
        myStream.forEach(numberPrinter);
    }
}
