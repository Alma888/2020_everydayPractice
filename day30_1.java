/*Java解法：
思路：
1.字符--->整数
2.判断二进制整数中 1 的个数：让其每一位与对应的位数为1的数字相与，如果为1则计数器+1
3.判断计数器值是否为偶数，为偶数则最高位（第八位）置1，完成奇校验
4.整数换为二进制输出（字符串拼接）
*/
import java.util.Scanner;

public class day30_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (sc.hasNext()){
            String s=sc.nextLine();
            for(int i=0;i<s.length();i++){
                int num=s.charAt(i);
                if(Count(num)%2==0){
                    //若1的个数为偶数
                    num+=128;
                }
                System.out.println(BinarySystem(num));
            }
        }
    }

    private static int Count(int n) {
        //判断二进制整数中1的个数
        int count=0;
        int b=1;
        for(int i=0;i<8;i++){
            if((n&b)==b){
                count++;
            }
            b=(b<<1);
        }
        return count;
    }
    private static String BinarySystem(int n) {
        //整数换为二进制输出
        int b=128;
        //StringBuilder string=new StringBuilder();
        String string="";
        for(int i=0;i<8;i++){
            if((n&b)==b){
                string+="1";
            }else {
                string+="0";
            }
            b=(b>>>1);
        }
        return string.toString();
    }

}
