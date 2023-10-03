package org.example;


public class Main {
    public static void main(String[] args) {
        /**
         * 1. Создать для класса Cat родительский класс Animal с методами:
         * animalinfo, voice, jump
         */

        Cat cat1 = new Cat("Барсик", "Рыжий", 7);
        cat1.setAge(-10);
        cat1.setAge(10);
        System.out.println("cat1 = " + cat1);



    }
}