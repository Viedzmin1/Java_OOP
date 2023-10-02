package org.example;

public class Cat {

    private String name;
    private String color;
    private Integer age;

    public Cat(String name, String color, Integer age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    /**
     * В сеттере на возраст происходит валидация на введенный пользователем возраст
     * @param age
     */
    public void setAge(Integer age) {
        if (age >= 0 && age < 20) {
            this.age = age;
        } else {
            System.out.println("Введенный возраст некорректен: "+ age);
        }
    }
}
