package main.threads.sharedmemory;

public class Counter {

    private int count = 0;

    public void increment(){
        System.out.println(count);
        count++;
    }

    public int getCount(){
        return count;
    }
}
