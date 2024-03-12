package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;

public class ToyStore {
    private final PriorityQueue<Toy> toysQueue;

    public ToyStore() {
        toysQueue = new PriorityQueue<>((a, b) -> b.getFrequency() - a.getFrequency());
    }

    public void addToy(Toy toy) {
        toysQueue.add(toy);
    }

    public void drawToys(int n) {
        try (FileWriter writer = new FileWriter("output.txt", true)) {
            for (int i = 0; i < n; i++) {
                Toy toy = toysQueue.poll();
                if (toy != null) {
                    writer.write(toy + "\n");
                    toy.setFrequency(Randomizer.getNumber(6));
                    // Добавляем игрушку обратно для следующего розыгрыша
                    toysQueue.add(toy);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
