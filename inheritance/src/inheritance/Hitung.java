package inheritance;

public class Hitung 
{

	public static void main(String[] args) 
	{
        // membuat objek persegi dan mengisi nilai properti
        Persegi mPersegi = new Persegi();
        mPersegi.sisi = 5;
        
        // membuat objek Lingkaran dan mengisi nilai properti
        Lingkaran mLingkaran = new Lingkaran();
        mLingkaran.r = 25;
        
        
        // membuat objek Segitiga dan mengisi nilai properti
        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas = 8;
        mSegitiga.tinggi = 6;
        
        
        // memanggil method luas dan keliling

        
        mPersegi.luas();
        mPersegi.keliling();
        
        mLingkaran.luas();
        mLingkaran.keliling();
        
       
        mSegitiga.luas();

    }
}