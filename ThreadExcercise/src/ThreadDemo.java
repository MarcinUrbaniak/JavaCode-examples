public class ThreadDemo {

    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        newThread.t.start();
        //System.out.println(Thread.currentThread());
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println("Wątek główny " + i);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e){
            System.out.println("Przerwano działanie wątku głównego");
        }
        System.out.println("Wyjście z wątku głównego");
    }
}
