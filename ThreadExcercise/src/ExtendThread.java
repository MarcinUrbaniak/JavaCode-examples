public class ExtendThread {
    public static void main(String[] args) {
        NewThreadEx newThreadEx = new NewThreadEx();

        newThreadEx.start();

        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println("Wątek główny " + i );
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Przerwano działanie wątku głównego");
        }
        System.out.println("Zakończenie wątku głównego");
    }

}
