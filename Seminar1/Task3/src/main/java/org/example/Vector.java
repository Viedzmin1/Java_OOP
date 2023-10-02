package org.example;

public class Vector {
    private Integer x;
    private Integer y;
    private Integer z;

    public Vector(Integer x, Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @return возвращает результат
     * @apiNote Метод, вычисляющий длину вектора
     */
    public Double lengthVector() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * @param vector2 Метод принимает второй вектор в качестве параметра
     * @return Возвращает скалярное произведение двух векторов
     * @apiNote Метод вычисляет скалярное произведение векторов
     */
    public Integer scalar(Vector vector2) {
        return x * vector2.x + y * vector2.y + z * vector2.z;
    }

    /**
     * @param vector2 Принимает в качестве параметра второй вектор
     * @return Возвращает векторное произведение двух векторов
     * @apiNote Метод вычисляет векторное произведение двух векторов
     */
    public Vector vectorProduct(Vector vector2) {
        return new Vector(
                y * vector2.z - z * vector2.y,
                z * vector2.x - x * vector2.z,
                x * vector2.y - y * vector2.x);
    }

    /**
     * @param vector2 В качестве парметра принимает второй вектор
     * @return Возвращает косинус угла между двумя векторами
     * @apiNote Метод вычисляет косинус угла между двумя векторами
     */
    public Double cosinusAngle(Vector vector2) {
        return this.scalar(vector2) / (lengthVector() * vector2.lengthVector());
    }

    /**
     * @apiNote Метод вычисляет сумму двух векторов
     * @param vector2 В качестве параметра принимает вектор 2
     * @return Возвращает сумму двух векторов
     */
    public Vector getSumm(Vector vector2) {
        return new Vector(x + vector2.x, y + vector2.y, z + vector2.z);
    }

    /**
     * @apiNote Метод вычисляет разность двух векторов
     * @param vector2 В качестве параметра принимает вектор 2
     * @return Возвращает разность двух векторов
     */
    public Vector getDifference(Vector vector2) {
        return new Vector(x - vector2.x, y - vector2.y, z - vector2.z);
    }


}
