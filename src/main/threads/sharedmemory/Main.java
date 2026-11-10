package main.threads.sharedmemory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        ArrayList<Thread> threads = new ArrayList<>();

        int numberOfThreads = 10;
        int increasePerThread = 100_000;

        for (int i = 0; i < numberOfThreads; i++) {
            CounterTask task = new CounterTask(counter,increasePerThread);
            Thread worker = new Thread(task, "worker-" + i);
            threads.add(worker);
        }

        for(Thread worker: threads){
            worker.start();
        }

        for (Thread worker: threads){
            worker.join();
        }

        int expected = numberOfThreads * increasePerThread;
        int actual = counter.getCount();

        System.out.println("Förväntat: " + expected);
        System.out.println("Faktiskt: " + actual);










    }
}
