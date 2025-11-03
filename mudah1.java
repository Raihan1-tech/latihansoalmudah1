import java.util.Scanner;

public class mudah1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tarif, total;

    
        System.out.print("Masukkan jarak (km): ");
        double jarak = input.nextDouble();

        System.out.println("masukkan berat (kg): ");
        double berat = input.nextDouble();

        
        if (jarak <= 10) {
            tarif = 4250;
        } else {
            tarif = 6000;
        }

    
        total =  tarif * berat;
        System.out.println("Total ongkir berdasarkan jarak: " + total);

        
        System.out.print("Masukkan panjang (cm): ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar (cm): ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi (cm): ");
        double tinggi = input.nextDouble();

        
        if (lebar * panjang * tinggi> 100) {
            total = total + 50000;
            System.out.println("Barang melebihi ukuran, tambahan biaya Rp 50.000");
        }

        
        System.out.println("Total ongkir yang harus dibayar: " + total);

        
    }
}

