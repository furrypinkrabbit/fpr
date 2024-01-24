public class Work5 {
    public static void main(String args[]){
        for(int i =100;i<=999;i++ ){
            ShuiXianHua(i);
        }
    }
    public static void ShuiXianHua(int n){
        int ge,shi,bai;
        ge =n%10;
        shi =n/10%10;
        bai =n/100;
        if(ge*ge*ge+bai*bai*bai+shi*shi*shi==n){
            System.out.println(n);
        }

    }
}
