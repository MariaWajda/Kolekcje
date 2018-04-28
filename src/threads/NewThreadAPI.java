package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewThreadAPI {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool(); //stworzenie nowego, jednego wątku

        executorService.execute(new Runnable() { // przekazanie zadania do wątku
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Witaj świecie 1");

                }
            }
        });
        executorService.execute(new Runnable() { //przekazanie drugiego zadania do wątku
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Witaj świecie 2");
                }
            }
        });
        executorService.execute(new Runnable() { //przekazanie drugiego zadania do wątku
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Witaj świecie 3");
                }
            }
        });
        executorService.execute(new Runnable() { //przekazanie drugiego zadania do wątku
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Witaj świecie 4");
                }
            }
        });

    }
}
