import java.util.Scanner;

public class Test01_3_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();//总的课程数
        /*
        String str=scanner.nextLine();//相应课程的学分
        String[] score=str.split(" ");
        String ss=scanner.nextLine();//对应课程的实际得分
        String[] scores=ss.split(" ");
        */
        int[] nums1=new int[n];//相应课程的学分
        int[] nums2=new int[n];//对应课程的实际得分
        double sum=0;//学分绩点总和
        int sum1=0;//所有课程学分之和
        for(int j=0;j<n;j++){
            nums1[j]=scanner.nextInt();
            sum1+=nums1[j];
        }
        for(int j=0;j<n;j++){
            nums2[j]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            int grade=nums2[i];
            if (grade>=90&&grade<=100){
                sum+=4.0*nums1[i];
            }
            if (grade>=85&&grade<=89){
                sum+=3.7*nums1[i];
            }
            if (grade>=82&&grade<=84){
                sum+=3.3*nums1[i];
            }
            if (grade>=78&&grade<=81){
                sum+=3.0*nums1[i];
            }
            if (grade>=75&&grade<=77){
                sum+=2.7*nums1[i];
            }
            if (grade>=72&&grade<=74){
                sum+=2.3*nums1[i];
            }
            if (grade>=68&&grade<=71){
                sum+=2.0*nums1[i];
        }
            if (grade>=64&&grade<=67){
                sum+=1.5*nums1[i];
            }
            if (grade>=60&&grade<=63){
                sum+=1.0*nums1[i];
            }
            if (grade<60){
                sum+=0;
            }
        }
        System.out.println(String.format("%.2f",sum/sum1));
    }
}
