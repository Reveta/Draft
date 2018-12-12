package com.reveta.politech.macheska.oop.createTasks;

public class Pirat {

    private String name;
    private int age;

    private Papyga papyga;


    public Pirat(String name, int age, Papyga papyga) {

        this.name = name;
        this.age = age;
        this.papyga = papyga;
    }


    public void sayYoHoHO() {
        System.out.println("YoHoHo");
    }

    @Override
    public String toString() {
        return "Pirat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", papyga=" + papyga +
                '}';
    }
}
