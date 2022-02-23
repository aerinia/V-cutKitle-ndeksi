import java.util.Scanner;
public class VucutKitleIndeks {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    System.out.print("Kilonuzu girin:");
    double kg =scan.nextDouble();
    System.out.println("Boyunuzu girin:");
    double boy=scan.nextDouble();
    double vdk = kg/(boy*boy);
    System.out.print("Vücut kitle indeksiniz "+vdk);
    }
}
