


class Main {
    public static void main(String[] args) {


        Contatore contatore = new Contatore();

        SynchronizedBlockExample example = new SynchronizedBlockExample();

        // Create multiple threads to increment the counter
        Thread t1 = new Thread(() -> contatore.increment());
        Thread t2 = new Thread(() -> contatore.increment());
        Thread t3 = new Thread(() -> example.incrementSny());
        Thread t4 = new Thread(() -> example.incrementSny());

        t1.start();
        t2.start();
        t3.start();
        t4.start();


        try {

            t1.join();
            //mette in pausa un thred finche il primo non ha finito
            t2.join();
            t3.join();
            t4.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Final count: " + contatore.getCount());
        System.out.println("Final count: " + example.getCountSny());

    }

}
