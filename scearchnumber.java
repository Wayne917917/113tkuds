import java.util.Scanner;
public class scearchnumber {
   public static void main(String[] args){
      int[] s ={1,3,5,7,9,11,13,};
      Scanner scanner =new Scanner (System.in);

      System.out.print("請輸入窯查找的數字");
      int x = scanner.nextInt();
      boolean found =false;

      for(int num:s){
        if(num==x){
            found=true;
            break;
        }
    }
    if (found) {
        System.out.println("數字 " + x + " 存在於陣列中。");
    } else {
        System.out.println("數字 " + x + " 不存在於陣列中。");
    }
}
}