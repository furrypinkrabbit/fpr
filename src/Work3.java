import java.util.Scanner;
public class Work3 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        String a = s.nextLine();
        reverseSUM(a);
    }
    public static void reverseSUM(String s){
        char[] chars =s.toCharArray();
        System.out.println("您输入的正整数的位数是："+s.length());
        System.out.println("您输入的正整数的逆序是：");
        for(int i =s.length()-1;i>=0;i--){
            System.out.print(chars[i]);
        }

    }

}
