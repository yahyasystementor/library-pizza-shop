package main.threads.exircise;

public class NumberThread extends Thread{

    @Override
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Nummer: " + i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("NumberThread avbröts");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
