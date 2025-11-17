public class Contatore {
    private int count = 0;

    public synchronized void incrementoSny() {

        /*for (int i = 0; i < 1000; i ++){
          */  count++;
        //}
    }

    public void incremento() {
        count++;
    }

    public int getCount() {
        return count;
    }


}

