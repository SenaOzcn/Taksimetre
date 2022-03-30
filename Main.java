import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int km;
    double perKm, total, startPrice;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Mesafeyi KM Cinsinden Giriniz: ");
    km = input.nextInt();
    
    perKm = 2.20;
    startPrice = 10;
    total = (km * perKm);
    total += startPrice;

    total = (total < 20) ? 20 : total;
    System.out.println("Toplam Tutar: " + total);
  }  
}
