import java.util.Scanner;

public class day27_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] str=s.split("\\.");
        String a="";
        for(int j=0;j<str.length;j++){
            while (str[j]!=null){
                int n1=Integer.parseInt(str[j])%2;
                String n=a+n1;
            }
        }

    }
}
