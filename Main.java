import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int co=sc.nextInt();
        int n;
        while (co!=0){
            System.out.println(sum(co)+" "+sum(co*co));
        }
    }
    public static int sum(int n){
        int sum=0;
        while (n!=0){
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }
}
