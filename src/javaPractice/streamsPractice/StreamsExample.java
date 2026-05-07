package javaPractice.streamsPractice;

import java.util.ArrayList;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        List<Integer> salaryList = new ArrayList<>();
        salaryList.add(3000);
        salaryList.add(4000);
        salaryList.add(1000);
        salaryList.add(3500);
        salaryList.add(5000);

        long result = salaryList.stream().filter((Integer s) -> s>3000).count();
        System.out.println(result);
    }
    
}
