package javaPractice.streamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class MapToIntExample {
    public static void main(String[] args) {
        List<String> numString = Arrays.asList("2", "3", "4", "5");
        IntStream numberStream = numString.stream().mapToInt((String val) -> Integer.parseInt(val));

        int[] num = numberStream.toArray();
        System.out.println(Arrays.toString(num));

        //mapToLong

        LongStream longNum = numString.stream().mapToLong((String val) -> Long.parseLong(val));
        long[] longNumRes = longNum.toArray();
        System.out.println(Arrays.toString(longNumRes));


        //mapToDouble
        List<String> doubleString = Arrays.asList("2.87", "7.99", "0.876", "5");
        DoubleStream doubleStream = doubleString.stream().mapToDouble((String val) -> Double.parseDouble(val));
        double[] doub = doubleStream.toArray();
        System.out.println(Arrays.toString(doub));

    }
}