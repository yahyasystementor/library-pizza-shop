package main.threads.exircise;

public class MessageThread extends Thread{


    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Jag arbetar");
            try {
                Thread.sleep(2000);

            }catch (InterruptedException e){
                System.out.println("MessageThread blev avbruten");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
