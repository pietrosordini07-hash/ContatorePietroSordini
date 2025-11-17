


class Main {
    public static void main(String[] args) {
        Contatore counter = new Contatore();

        // Create multiple threads to increment the counter
        Thread t1 = new Thread(() -> counter.incrementoSny());
        Thread t2 = new Thread(() -> counter.incrementoSny());
        Thread t3 = new Thread(() -> counter.incremento());
        Thread t4 = new Thread(() -> counter.incremento());

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

        System.out.println("Final count: " + counter.getCount());
    }

}
