package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /**
         * Создайте класс, который описывает вектор в трехмерном пространстве
         * У него должны быть:
         * 1. Конструктор с параметрами в виде списка координат x, y, z;
         * 2. Метод, вычисляющий длину вектора;
         * 3. Метод, вычисляющий скалярное произведение;
         * 4. Метод, вычисляющий векторное произведение с другим вектором;
         * 5. Метод, вычисляющий угол между векторами (или косинус угла):
         * косинус угла между векторами равен скалярному произведению векторов, деленному
         * на произведение модулей (длин) векторов;
         * 6. Методы для суммы и разности.
         */

        Vector vector1 = new Vector(1,3,6);
        Vector vector2 = new Vector(3,5,8);

        System.out.println("Длина вектора 1 = " + vector1.lengthVector());
        System.out.println("Скалярное произведение вектора1 на вектор2 = " + vector1.scalar(vector2));
        System.out.println("Векторное произведение вектора1 на вектор2 = " + vector1.vectorProduct(vector2));
        System.out.println("Косинус угла между вектором1 и вектором2 = " + vector1.cosinusAngle(vector2));
        System.out.println("Сумма вектора1 и вектора2 = " + vector1.getSumm(vector2));
        System.out.println("Разность вектора1 и вектора2 = " + vector1.getDifference(vector2));
    }
}