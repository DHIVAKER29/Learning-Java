
package Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(3);
        //ExecutorService ex2 = Executors.newCachedThreadPool();
        for(int i = 1 ; i <= 10 ; i++){
            PrintNumber t = new PrintNumber(i);
            ex.submit(t);
        }
    }
}
