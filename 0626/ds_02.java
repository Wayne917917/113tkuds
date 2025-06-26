import java.util.Scanner;

public class ds_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入R: ");
        int R = scanner.nextInt();
        System.out.print("請輸入r: ");
        int  r = scanner.nextInt();       
        System.out.println("面積: " + (R*r*3.14));
    }
}
