package org.example;

public class Animal {
    protected Strqing name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void animalInfo(){
        System.out.println("info");
    }
    void voice(){
        System.out.println("info");
    }
    void jamp(){
        System.out.println("info");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
