package InterviewQuestion;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintNumber implements Runnable {
    private  int num;

    private static final Lock lock = new ReentrantLock();

    PrintNumber(int num){
        this.num = num;
    }
    @Override
    public void run() {
        lock.lock();
        System.out.println(Thread.currentThread().getName() + ": " + num);
        lock.unlock();
    }
}
