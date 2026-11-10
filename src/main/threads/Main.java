package main.threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        long startTime =  System.currentTimeMillis();

        SlowTask task1 = new SlowTask("Uppgift A");
        SlowTask task2 = new SlowTask("Uppgift B");

        task1.run();
        task2.run();

        long endTime =  System.currentTimeMillis();

        System.out.println("Sekventiellt tid: " + (endTime - startTime) + "ms");

        long startTimeForThread =  System.currentTimeMillis();

        Thread thread1 = new Thread(new SlowTask("Uppgift C"), "worker-1");
        Thread thread2 = new Thread(new SlowTask("Uppgift D"), "worker-2");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        long endTimeForThread =  System.currentTimeMillis();
        System.out.println("Olika trådar tid; " + (endTimeForThread - startTimeForThread) + "ms");







    }
}




      /*
        SlowTask task1 = new SlowTask("Läsa info");
        SlowTask task2 = new SlowTask("Kontrollera resultat");

        Thread thread1 = new Thread(task1, "worker-1");
        Thread thread2 = new Thread(task2, "worker-2");

        thread1.start();
        thread2.start();

        thread1.sleep(1000);

        System.out.println(thread1.getState());


        System.out.println("Main väntar på båda trådarna");
        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
            System.out.println("Main blev avbruten");
        }
        System.out.println("Alla uppgifter är klara");

          */

/*
PrintTask task = new PrintTask("Uppgift a");
        Thread worker = new Thread(task, "worker-1");

        System.out.println("Main innan start");

        worker.start();

        System.out.println("Main efter start");



String threadName = Thread.currentThread().getName();
        System.out.println("Vi kör på tråden " + threadName);

        for (int i = 0; i <= 5; i++) {
            System.out.println("Main räknar " + i);
        }
        System.out.println("Main är done");
 */