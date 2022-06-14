package paket;

public class AnaIslemPlatformu implements IAnaIslemPlatformu{

    private ISicaklikAlgilayici sicaklikAlgilayici;

    public AnaIslemPlatformu(){
       sicaklikAlgilayici = SicaklikAlgilayiciModul.getInstance(new Publisher());
       sicaklikAlgilayici.aboneEkle(new Subscriber1());
       sicaklikAlgilayici.aboneEkle(new Subscriber2());
    }
    @Override
    public void eyleyiciAcmaKomutu() {
        IKontrolEdilebilir eyleyici = new EyleyiciModul();
        KontrolEdilebilirDonanım kontrolEdilebilir = new KontrolEdilebilirDonanım(eyleyici);
        kontrolEdilebilir.ac();
    }

    @Override
    public void eyleyiciKapatmaKomutu() {
        IKontrolEdilebilir eyleyici = new EyleyiciModul();
        KontrolEdilebilirDonanım kontrolEdilebilir = new KontrolEdilebilirDonanım(eyleyici);
        kontrolEdilebilir.kapat();
    }

    @Override
    public void sicaklikAlgilayiciyaGonder() {
        sicaklikAlgilayici.sicakilkOku();
    }
}
