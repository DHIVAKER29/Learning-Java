package Executor;

public class PrintNumber implements Runnable{
    int noToPrint;
    PrintNumber(int noToPrint){
        this.noToPrint = noToPrint;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": " + noToPrint);
    }
}