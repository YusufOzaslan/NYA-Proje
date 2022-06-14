package paket;

public class Subscriber1 implements IObserver {

    public Subscriber1(){

    }
    @Override
    public void update(String mesaj) {
        System.out.println("Abone1 e gelen mesaj->" + mesaj);
    }
}