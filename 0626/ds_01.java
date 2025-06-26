import java.util.Scanner;

public class ds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入第一個整數: ");
        int x = scanner.nextInt();
        System.out.print("請輸入第二個整數: ");
        int  y = scanner.nextInt();
        int sum = x + y;
        System.out.println("兩個整數的和為: " + sum);
    }
}
