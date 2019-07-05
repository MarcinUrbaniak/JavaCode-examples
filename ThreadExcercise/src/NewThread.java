public class NewThread implements Runnable {

    Thread t;

    NewThread(){
        t = new Thread(this, "Przykladowy watek");
        System.out.println("Wątek potomny " + t);
    }

    @Override
    public void run() {

        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println("Wątek potomny " + i);
                Thread.sleep(1000);
            }

        }catch (InterruptedException e){
            System.out.println("Przerwanie wątku potomka");
        }
        System.out.println("Wyjście z wątku potomka");
    }
}
