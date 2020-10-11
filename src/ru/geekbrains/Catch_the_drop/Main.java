package ru.geekbrains.Catch_the_drop;

public class Main {

    public static void main(String[] args) {
        employee employee1 = new employee("Василий Васильевич Пупкин ", "Шахтер", "vasaVas@mail.ru", "89678327651", 25789, 29);

        employee1.age = 29;
        employee1.Email = "vasaVas@mail.ru ";
        employee1.salary = 25789;
        employee1.position = "Шахтер ";
        employee1.phoneNumber = "89678327651 ";
        employee1.fio = "Василий Васильевич Пупкин ";
        employee1.info();

        System.out.println("Другое упражнение ");

        employee[] employee2 = new employee[5];
        employee2[0] = new employee("Валерий Валерьивич Валерон", "Шахтер", "Valera@mail.ru", "88956667772", 10000, 56);
        employee2[1] = new employee("Арсений Арсеньевич Арасович", "Разнаробочий", "rsenya@mail.ru", "8895666667", 15000, 41);
        employee2[2] = new employee("Александр Александрович Алёша", "Менэджер", "Alexa@mail.ru", "88956666666", 25000, 47);
        employee2[3] = new employee("Кузя Кузин Кузьмин", "Актер", "РаботаюЗаЕду@mail.ru", "88956667894", 1000, 22);
        employee2[4] = new employee("Александра Александровна Алька", "Секретарь", "lolita@mail.ru", "889566677778", 78000, 19);
        for (int i = 0; i < employee2.length; i++) {
            if (employee2[i].getAge() > 40) {
                employee2[i].info();

            }

        }
    }
}