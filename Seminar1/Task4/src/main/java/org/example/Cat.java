package org.example;

public class Cat extends Animal {


    private String color;
    private Integer age;

    public Cat(String name, String color, Integer age) {
        super(name);
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name= " + getName() +
                " color='" + color + '\'' +
                ", age= " + age +
                '}';
    }

    /**
     * В сеттере на возраст происходит валидация на введенный пользователем возраст
     *
     * @param age
     */
    public void setAge(Integer age) {
        if (age >= 0 && age < 20) {
            this.age = age;
        } else {
            System.out.println("Введенный возраст некорректен: " + age);
        }
    }
}
