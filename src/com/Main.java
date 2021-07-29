package com;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        List<String> output = new ArrayList<>();
        Set<String> set = new LinkedHashSet<>();

        System.out.println("Введите слово: ");
        String word = in.nextLine();
        String[] arrayWord = word.split("");

        output.add(arrayWord[0]);

        for ( int x = 1; x<word.length();x++){
            int cons = output.size();

            for (int c = 0; c<cons;c++){
                String rewritingWithAddingLetter = output.get(c) + arrayWord[x];
                String withAddingPoint = output.get(c) + "." + arrayWord[x];
                output.set(c,(rewritingWithAddingLetter));
                output.add(withAddingPoint);
            }

        }

        System.out.println("Output: ");
        output.forEach(wordWithPoint -> set.add(wordWithPoint));
        set.forEach(s -> System.out.println(s));//вывод без повторяющих значений

    }
}