package javaPractice.streamsPractice;

import java.lang.classfile.ClassFile.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MultipleStreams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,10,3,6,99);

        Stream<Integer> numberStream = list.stream().filter((Integer i) -> i>3).peek((Integer val) -> System.out.println(val)).map((Integer mp) -> (mp * -1)).peek((Integer val) -> System.out.println(val))
        .sorted()
        .peek((Integer sor) -> System.out.println(sor));

        List<Integer> result = numberStream.collect(Collectors.toList());
        System.out.println(result);


        //for Each
        list.stream().filter((Integer val) -> val > 4).forEach((Integer i) -> System.out.println(i));

        //reduce
        //optional checks npe
        Optional<Integer> reducedVal = list.stream().reduce((Integer val1, Integer val2) -> val1 + val2);
        System.out.println(reducedVal);

        //collect
        List<Integer> res = list.stream().filter((Integer val) -> val > 4).collect(Collectors.toList());
        System.out.println(res);

        //min-max
        Optional<Integer> mini = list.stream().filter((Integer val) -> val > 4).min((Integer v1, Integer v2) -> v1-v2);
        System.out.println(mini);

        Optional<Integer> max = list.stream().filter((Integer val) -> val > 3).min((Integer v1, Integer v2) -> v2-v1);
        System.out.println(max);

        //count
        long cnt = list.stream().count();
        System.out.println(cnt);

        //anyMatch - return boolean
        boolean result1 = list.stream().anyMatch((Integer val) -> val > 4);
        System.out.println(result1);

        //allMatch
        boolean result2 = list.stream().allMatch((Integer val) -> val > 4);
        System.out.println(result2);

        //noneMatch
        boolean non = list.stream().noneMatch((Integer val) -> val > 4);
        System.out.println(non);

        //findFirst
        Optional<Integer> ff = list.stream().filter((Integer val) -> val > 4).findAny();
        System.out.println(ff);

        //findAny
        Optional<Integer> fa = list.stream().filter((Integer val) -> val > 10).findAny();
        System.out.println(fa);

    }
    
}
