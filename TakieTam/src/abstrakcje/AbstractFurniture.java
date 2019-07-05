package abstrakcje;

public  abstract class AbstractFurniture implements Latajace{
    int Wysokosc, dlugosc;

    AbstractFurniture(){

    }

    public abstract int zmierzObjetosc();
    public abstract int zmierzPole();
}
