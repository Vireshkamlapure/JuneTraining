package lamda;

import java.util.Arrays;
import java.util.List;

public class TestMap {
    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5,6,7,8,9,10};

        //Find Square of each num
//        for(int i=0 ; i < nums.length ; i++

//        for (int num : nums)
//            System.out.println(num);

        //Find Square of each num using map
        List<Integer> listnums = Arrays.asList(nums);
//        listnums = listnums.stream().map(num -> num * num).toList();
//        listnums.forEach(System.out::println);

        int sumOfEvenSquare = listnums.stream()
                .map(num -> num * num)
                .filter(num -> num % 2 == 0)
                .reduce(0, (num1, num2) -> num1 + num2);

        System.out.println(sumOfEvenSquare);
    }
}
