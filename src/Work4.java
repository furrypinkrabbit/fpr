import java.util.Scanner;
public class Work4 {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        int n =s.nextInt();
        isPalindrome(n);
    }
    public static void isPalindrome(int n1){
        int r=0,n2 =n1,x;
        while(n1!=0){
            x = n1%10;
            r = r*10+x;
            n1 = n1/10;

        }
        if(n2==r){
            System.out.println("是的");
        }
        else{
            System.out.println("不是");
        }
    }
}
