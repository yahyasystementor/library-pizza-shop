package main.threads;

public class PrintTask implements Runnable{

    private String taskName;

    public PrintTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run(){
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            String threadName = Thread.currentThread().getName();
            System.out.println(taskName + " " + threadName + " steg " + i);

        }
    }
}
