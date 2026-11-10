package main.threads.exircise;

public class Main {

    public static void main(String[] args) throws InterruptedException {



        NumberThread numberThread = new NumberThread();
        MessageThread messageThread = new MessageThread();

        numberThread.start();
        messageThread.start();


        numberThread.setPriority(Thread.MAX_PRIORITY);
        numberThread.setPriority(Thread.NORM_PRIORITY);
        messageThread.setPriority(Thread.MIN_PRIORITY);


        numberThread.join();
        messageThread.join();

        System.out.println("Alla trådar är klara");



    }

}
