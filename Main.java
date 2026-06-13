import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n2=n;
        int g1=0;
        int g2=0;
        int g3=0;
        for(int i=1;i<4;i++){
        if(n>=7){
           g1=7;
           System.out.println("god1:offered"+g1);
           n=n-7;
        }
        else {
            g1=n;
              int temp=7-g1;
           if(!(n>0)){
System.out.println("god"+i+" :need 7");
            }
            else{
            System.out.println("god"+i+":have"+g1+"need"+Math.abs(temp));
            }
            n=0;
        }
        }
        if(n2==21){
            System.out.println("Sufficient");
        }
        else if(n2<21){
            int temp=21-n2;
            if(n2<0){
                 System.out.println("Shortage: "+21);
            }
            else{
            System.out.println("Shortage: "+temp);
            }
        }else{
            int temp=n2-21;
              System.out.println("Surplus:"+temp);
        }
        System.out.println("God bless you :) ");
    }
}