package paket;

public class Subscriber2 implements IObserver {

    public Subscriber2(){

    }
    @Override
    public void update(String mesaj) {
        System.out.println("Abone2 ye gelen mesaj->" + mesaj);
    }
}