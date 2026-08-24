package org.tnsif.acc.c2tc.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllTerminalOps {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 8, 9);

        // 1. forEach()
        System.out.println("For Each:");
        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        // 2. count()
        long count = numbers.stream().count();
        System.out.println("Count: " + count);

        // 3. collect()
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);

        // 4. reduce()
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum: " + sum);

        // 5. min()
        int min = numbers.stream()
                .min(Integer::compareTo)
                .get();

        System.out.println("Minimum: " + min);

        // 6. max()
        int max = numbers.stream()
                .max(Integer::compareTo)
                .get();

        System.out.println("Maximum: " + max);

        // 7. anyMatch()
        boolean anyEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println("Any Even: " + anyEven);

        // 8. allMatch()
        boolean allPositive = numbers.stream()
                .allMatch(n -> n > 0);

        System.out.println("All Positive: " + allPositive);

        // 9. noneMatch()
        boolean noneNegative = numbers.stream()
                .noneMatch(n -> n < 0);

        System.out.println("None Negative: " + noneNegative);

        // 10. findFirst()
        int first = numbers.stream()
                .findFirst()
                .get();

        System.out.println("First Element: " + first);

        // 11. findAny()
        int any = numbers.stream()
                .findAny()
                .get();

        System.out.println("Any Element: " + any);
    }
}