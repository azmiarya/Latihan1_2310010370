
package hitung;


public class MatematikaBeraksi {
    public static void main(String[] args) {
        //Membuat objek
        Matematika arya = new Matematika(7, 0);
        
        System.out.println("Hasil penjumlahan: "+arya.setPenjumlahan()); // 7 + 0 = 7
        System.out.println("Hasil pengurangan: "+arya.setPengurangan()); // 7 - 0 = 7
        System.out.println("Hasil perkalian: "+arya.setPerkalian()); // 7 * 0 = 0
        System.out.println("Hasil pembagian: "+arya.setPembagian()); // 7 / 0 = ?
                
    }
}
