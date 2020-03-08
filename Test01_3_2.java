import java.util.Scanner;

public class Test01_3_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.nextLine();
        String[] str=s.split("\r");
        /*
        Integer n1=sc.nextInt();
        Integer n2=sc.nextInt();
        Integer n3=sc.nextInt();
        Integer n4=sc.nextInt();
        Integer[] num={n1,n2,n3,n4};
        */
        for(int i=0;i<str.length;i++){
            Integer n=Integer.parseInt(str[i]);
            System.out.println(Fun(n)+" "+Fun(n*n));
        }
    }
    public static long Fun(Integer n){
        String str=n.toString();//整型数字转化为字符串
        long sum=0;//n的 每位数之和
        int[] intArray=new int[str.length()];//新数组来保存n每一位的数字
        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            intArray[i]=Integer.parseInt(ch.toString());//将Character类型元素转化为整型元素
            sum+=intArray[i];
        }
        return sum;
    }
}
