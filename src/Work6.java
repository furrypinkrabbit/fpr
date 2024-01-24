import java.util.Scanner;
public class Work6 {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        int[] a = new int[10];
        int n = a.length;
        for(int i=0;i<10;i++) {
             a[i]=s.nextInt();
        }
        arraysDemo(a,n);
    }
    public static void arraysDemo(int a[] ,int n){
        int max =a[0],big = 0;
        int min =a[0],small = 0;
        for(int i =0;i<n;i++){
            if(a[big]<a[i]){max = a[i];big = i;}
            if(a[small]>a[i]){min = a[i];small = i;}
        }
        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);

    }
}
