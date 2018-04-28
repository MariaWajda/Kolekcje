package threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class NewThredAPI2 {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor(); //stworzenie nowego, jednego wątku

        executorService.scheduleAtFixedRate(new Runnable() { // przekazanie zadania do wątku
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("HELLO");

                }
            }
        }, 0, 5, TimeUnit.SECONDS);

        executorService.shutdown();

        AtomicInteger atomicInteger = new AtomicInteger(5);

    }
}