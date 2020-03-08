import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class day30_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (sc.hasNext()){
            int N=sc.nextInt();
            BigInteger[] bigarray=new BigInteger[N];
            for(int i=0;i<N;i++){
                bigarray[i]=sc.nextBigInteger();
            }
            Arrays.sort(bigarray);
            for(int j=0;j<N;j++){
                System.out.println(bigarray[j]);
            }
        }
    }
}
