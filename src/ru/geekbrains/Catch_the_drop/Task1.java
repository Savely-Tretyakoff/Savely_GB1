package ru.geekbrains.Catch_the_drop;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {

        String[] ArrayWords = {
                "Прага","Гамбург","Париж","Гамбург","Талин","Лондон",
                "Париж","Берлин","Мадрид","Рим","Мюнхен","Милан",
                "Афины","Лондон","Милан","Прага","Лондон", "Афины"
        };
        Set<String> uniqueWords = new TreeSet<String>();
        uniqueWords.addAll(Arrays.asList(ArrayWords));
        System.out.println("Уникальные слова: " + uniqueWords);
        System.out.println("Количество уникальных элементов: " + uniqueWords.size());

        System.out.println("Кол-во каждого слова: ");
        for (String key : uniqueWords) {
            System.out.println(key + ": " + Collections.frequency(Arrays.asList(ArrayWords), key));
        }


    }
}

