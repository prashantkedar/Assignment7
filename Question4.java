import java.util.Scanner;
class Question4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the value of a : ");
        int a= sc.nextInt();
        System.out.print(" Enter the value of n : ");
        int n = sc.nextInt();
        double sum=0.0;

        for (int i = 1 ; i <= n ; i++){
            sum = sum + i/Math.pow(a,i);

        }
        System.out.printf("sum %.4f: ", sum);

    }
}