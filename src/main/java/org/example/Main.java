package org.example;

public class Main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();
        store.addToy(new Toy("1", "Мягкий мишка"));
        store.addToy(new Toy("2", "Конструктор LEGO"));
        store.addToy(new Toy("3", "Радиоуправляемый автомобиль"));
        store.addToy(new Toy("4", "Кукла"));
        store.addToy(new Toy("5", "Машинка"));
        store.addToy(new Toy("6", "Робот"));

        store.drawToys(10);

        Randomizer.close();
    }
}
