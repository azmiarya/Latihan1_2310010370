
package hitung;

public class Matematika {
    //Membubat variable
    private double bil1, bil2;
    
    //Membuat constructor
    public Matematika(double bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    //Membuat method setPenjumlahan
    double setPenjumlahan(){
        return bil1+bil2;
        
    }
    
    //Membuat method setPengurangan
    double setPengurangan(){
        return bil1-bil2;
        
    }
    
    //Membuat method setPerkalian
    double setPerkalian(){
        return bil1*bil2;
        
    }
    
    //Membuat method setPembagian
    double setPembagian(){
        return bil1/bil2;
        
    }
}
