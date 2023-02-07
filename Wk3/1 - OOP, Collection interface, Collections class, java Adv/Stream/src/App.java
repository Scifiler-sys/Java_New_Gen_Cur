import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Functional style of defining operations on a stream of elements
        //TLDR, we can manipulate the contents of a collection even further
        //They do not store the data that was manipulated (VERY DIFFERENT FROM COLLECTIONS API)
        List<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            randomNumbers.add(new Random().nextInt(10));
        }
        System.out.println(randomNumbers);

        //stream() method exists as long as it inherits collection interface
        //It gives us the Stream object that has all the methods we can use to manipulate this current collection
        List<Integer> filtered = randomNumbers.stream()
            .filter(currentVal -> currentVal>5 && currentVal<=8)
            .collect(Collectors.toList());

        System.out.println(filtered);

        double avg = randomNumbers.stream()
            .filter(currentVal -> currentVal>5 && currentVal<=8)
            .collect(Collectors.averagingInt(currentVal -> currentVal));

        System.out.println(avg);

        //We can even just convert the entire list into something else
        List<String> stringList = randomNumbers.stream()
            .map(currentVal -> currentVal.toString()) //map method is great for converting values or just changing them outright
            .collect(Collectors.toList());
        
        System.out.println(stringList);
    }
}
