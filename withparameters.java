public class Ogrenci {

    private int ogrenciNo;
    private String adi;
    private int yas;

    // Parametre alan constructor
    public Ogrenci(int ogrenciNo, String adi, int yas) {
        this.ogrenciNo = ogrenciNo;
        this.adi = adi;
        this.yas = yas;
    }

    // Öğrenci bilgilerini gösteren metot
    public void goster() {
        System.out.println("Öğrenci No: " + ogrenciNo);
        System.out.println("Adı: " + adi);
        System.out.println("Yaşı: " + yas);
    }

    public static void main(String[] args) {
        // Parametreli constructor kullanımı
        Ogrenci ogrenci1 = new Ogrenci(101, "Ahmet", 20);
        Ogrenci ogrenci2 = new Ogrenci(102, "Ayşe", 21);

        // Öğrenci bilgilerini göster
        ogrenci1.goster();
        System.out.println("--------------------");
        ogrenci2.goster();
    }
}