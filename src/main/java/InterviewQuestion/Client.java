package InterviewQuestion;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args){
        PrintNumber printNumber;
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i=1;i<=10;i++){
           PrintNumber t = new PrintNumber(i);
            executor.submit(t);
        }
        executor.shutdown();
    }
}

