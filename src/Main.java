public class Main {
    public static void main(String[] args) {
        BujurSangkar bujurSangkar = new BujurSangkar(5);
        PersegiPanjang persegiPanjang = new PersegiPanjang(4, 6);
        Segitiga segitiga = new Segitiga(3, 4, 3, 4, 5);

        System.out.println("Luas Bujur Sangkar: " + bujurSangkar.luas());
        System.out.println("Keliling Bujur Sangkar: " + bujurSangkar.keliling());

        System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling());

        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("Keliling Segitiga: " + segitiga.keliling());
    }
}