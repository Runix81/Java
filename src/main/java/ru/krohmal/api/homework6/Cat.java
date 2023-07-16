package ru.krohmal.api.homework6;

import java.util.Objects;

public class Cat {
    String name;
    int age;
    int weight;
    String gender;
    public Cat(){

    }
    public Cat(String name, int age, int weight, String gender){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && weight == cat.weight && Objects.equals(name, cat.name) && Objects.equals(gender, cat.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight, gender);
    }


    @Override
    public String toString(){
        return String.format("Этого кота зовут - %s, ему %d лет, он весит %d кг и он %s рода.",name,age,weight,gender);
    }
}
