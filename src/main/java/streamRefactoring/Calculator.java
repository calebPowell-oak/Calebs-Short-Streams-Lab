package streamRefactoring;

import java.util.List;
import java.util.stream.Stream;

public class Calculator {

    /**
     * Objective: Rewrite the methods below ( sqaureRoots() and squares() ) using the Streams API.
     *      Ensure all tests pass in the end.
     *
     * Useful resources include:
     *  How to get a Stream from an array:
     *      https://www.mkyong.com/java8/java-how-to-convert-array-to-stream/
     *
     *  How to collect a Stream back into an array:
     *      https://stackoverflow.com/questions/23079003/how-to-convert-a-java-8-stream-to-an-array
     *
     *  Examples on the usage of the .map() intermediate operator:
     *      https://www.mkyong.com/java8/java-8-streams-map-examples/
     *
     *  */

    //Example: Print out only the first letter from a list of names.
    public static void printFirstInitial(String[] names){
        Stream.of(names)
                .map( (x) -> x.substring(0,1)) //Intermediate operation
                .forEach(System.out::println); //Terminal operation
    }

    public static void main(String[] args) {
        String[] names = {"Henry", "Adam", "Peter", "Patty", "Yolanda"};
        printFirstInitial(names);
    }

    // TODO: rewrite using streams API
    public static Double[] squareRoots(Double... value) {
        Double[] array = new Double[value.length];
        for (int i = 0; i < value.length; i++){
            array[i] = squareRoot(value[i]);
        }
        return array;
    }

    // TODO: rewrite using streams API
    public static Double[] squares(Double... values) {
        Double[] array = new Double[values.length];
        for (int i = 0; i < values.length; i++){
            array[i] = square(values[i]);
        }
        return array;
    }

    // Helper methods

    public static Double squareRoot(Double value) {
        return Math.sqrt(value);
    }

    public static Double square(Double value) {
        return value * value;
    }
}
