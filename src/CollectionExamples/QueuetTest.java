package CollectionExamples;

import java.util.PriorityQueue;

public class QueuetTest {
    public static void main(String[] args) {
        PriorityQueue<Task> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Task(3, "Zrób pranie"));
        priorityQueue.add(new Task(5, "Zrób zakupy"));
        priorityQueue.add(new Task(1, "Odbierz dzieci"));
        priorityQueue.add(new Task(9, "Słuchaj uważnie na wykładzie"));
        priorityQueue.add(new Task(10, "Podlej kwiaty"));

        while (priorityQueue.size() > 0 ){
            System.out.println(priorityQueue.poll().getTaskMessage());
        }
        System.out.println("Wielkość kolejki to: " + priorityQueue.size());


    }

}
