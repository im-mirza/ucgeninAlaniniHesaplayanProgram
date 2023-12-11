import java.util.Scanner;

public class ucgeninAlaniniHesaplayanProgram {
    public static void main(String[] args) {
        //degiskenleri tanimladim
        int a,b,c, ucgeninCevresi,uFormulu;
        double alan;
        //kullanicidan veri aldim
        Scanner sc = new Scanner(System.in);
        System.out.println("Dik Ucgeninin Kenarlarini Girin: ");
        System.out.println("1. kenari giriniz: ");
        a= sc.nextInt();
        System.out.println("2. kenari giriniz: ");
        b= sc.nextInt();
        System.out.println("3. kenari giriniz: ");
        c= sc.nextInt();
        //formullari olusturdum
        uFormulu=(a+b+c)/2;
        ucgeninCevresi=2*uFormulu;
        // Math kutuphanesinin sqrt methodu ile formulun sonucununun karekokunu aldim
        alan=Math.sqrt(uFormulu * (uFormulu-a)* (uFormulu-b)*(uFormulu-c));

        System.out.println("Dik Ucgenin Alani: "+alan);
    }
}
