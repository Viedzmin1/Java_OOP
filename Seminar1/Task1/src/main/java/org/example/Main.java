package org.example;


public class Main {
    public static void main(String[] args) {

        /**
         * 1. Создать класс Cat с полями:
         * имя, цвет, количество лет. Поработать с полями напрямую
         */

        Cat cat1 = new Cat("Барсик", "Рыжий", 7);
        cat1.setAge(-10);
        cat1.setAge(10);


        /**
         * 2. Добавить инкапсуляцию и сделать валидацию на введенный возраст
         */

         System.out.println("имя: " + cat1.getName() + " цвет: " + cat1.getColor() + " возраст:" + cat1.getAge());


    }
}