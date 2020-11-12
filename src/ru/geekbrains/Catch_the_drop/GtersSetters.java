package ru.geekbrains.Catch_the_drop;

import java.util.*;

class GettersSetters {
    private static Map<String, List<String>> PhoneBook = new HashMap<>();

    public static void add(String surname, String number){

        if(PhoneBook.containsKey(surname)){
            List<String> numbers = PhoneBook.get(surname);
            if(!numbers.contains(number)){
                numbers.add(number);
            }
        } else {
            PhoneBook.put(surname, new ArrayList<>(Arrays.asList(number)));
        }
        System.out.println("Номер " + number + " добавлен под фамилией: " + surname);
    }


        public static List<String> get(String surname){

            if (PhoneBook.containsKey(surname)) {
                return PhoneBook.get(surname);
            } else {
                return new ArrayList<>();
            }

        }
    }
