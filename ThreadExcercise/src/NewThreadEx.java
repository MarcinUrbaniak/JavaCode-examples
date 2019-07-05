public class NewThreadEx extends Thread {

    NewThreadEx() {
        super("Nowy wątek");
        System.out.println("Wątek potomny " + this);
    }

    public void run(){

        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println("Wątek potomny " + i);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e){
            System.out.println("Przerwanie działanie wątku potomka");
        }
        System.out.println("Wyjscie z wątku potomka");
    }

}
