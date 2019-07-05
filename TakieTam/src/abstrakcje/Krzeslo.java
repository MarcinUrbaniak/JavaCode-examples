package abstrakcje;

public  final class Krzeslo extends AbstractFurniture{

    public final int stlaFinalna = 0;






    @Override
    public int zmierzObjetosc() {
        return 0;
    }

    @Override
    public int zmierzPole() {
        return 0;
    }

    @Override
    public void fruwaj(String text) {
        System.out.println(text);
    }

    @Override
    public void wyladuj() {

    }
}
