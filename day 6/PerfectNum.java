import java.util.Scanner;

public class PerfectNum {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            int n,sum=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number:");
            n=sc.nextInt();
            for(int i=1; i<n;i++){
                if(n%i==0){
                    sum=sum+i;
                    System.out.println(sum);
                }
            }
            if(sum==n){
                System.out.println("enter no is perfect ");
            }
            else
                System.out.println("Enter no is not perfect");

        }

    }

