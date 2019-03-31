package test;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class Test1 {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[10];
        List<Integer> list = Arrays.asList(tenEvenNumbers(numbers));
        out.print(list);
    }

    static private Integer []tenEvenNumbers(Integer [] array)
    {
        int initialValue=10;
        for(int index=0;index<array.length;index++)
        {
            array[index]=initialValue;
            initialValue+=2;
        }
        return array;
    }
}