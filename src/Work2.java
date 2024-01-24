import java.util.Scanner;
public class Work2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入想要打印的等腰三角形的行数：");
        int n = s.nextInt();
        showTriangle(n);
    }
    public static void showTriangle(int n){
        int a,b,i;
        for(i=1;i<=n;i++){
            for(b=1;b<=n-i;b++){
                System.out.print(" ");}
            for(a=1;a<=2*i-1;a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
