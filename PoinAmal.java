import java.util.Scanner;

public class PoinAmal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int poinAmal = 0; // poin amal awalnya 0
        String tindakan;
        int nilaiTindakan;

        System.out.println("===[ PROGRAM NILAI AMAL ]===");

        while (true) {
            System.out.println("Poin Amal Anda: " + poinAmal);
            System.out.println("Masukkan tindakan (baik/buruk/stop): ");
            tindakan = input.nextLine();

            if (tindakan.equalsIgnoreCase("stop")) {
                break;
            }

            System.out.println("Masukkan nilai tindakan (1-10): ");
            nilaiTindakan = input.nextInt();
            input.nextLine(); 

            if (tindakan.equalsIgnoreCase("baik")) {
                poinAmal += nilaiTindakan; 
                System.out.println("Poin amal ditambah " + nilaiTindakan);
            } else if (tindakan.equalsIgnoreCase("buruk")) {
                poinAmal -= nilaiTindakan;
                System.out.println("Poin amal dikurangi " + nilaiTindakan);
            } else {
                System.out.println("Tindakan tidak valid");
            }
        }

        System.out.println("Total poin amal Anda: " + poinAmal);
        System.out.println("Terima kasih telah menggunakan program ini");
    }
}
