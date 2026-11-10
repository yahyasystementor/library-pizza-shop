package main.threads;

public class SlowTask implements Runnable{

    private String taskName;

    public SlowTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run(){
        for (int i = 0; i <= 3 ; i++) {
            System.out.println(taskName + " steg " + i);
        }
        System.out.println(taskName + " är färdig");
    }
}
