package ProducerConsumer;

public class Consumer implements Runnable{
    private Store store;

    Consumer(Store st){
        this.store = st;
    }
    @Override
    public void run() {
        while(true) {

            synchronized (store) {
                //only 1 of them will come here at a time
                if (store.getItems().size() > 0) {
                    store.removeItem();
                }
            }
        }
    }
}