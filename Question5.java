import java.util.Scanner;
class Question5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the value of n : ");
        int n = sc.nextInt();
        double sum=0.0;

        for ( int i = 1 ; i <= n ; i++){
            sum = sum + 1/(Math.pow(i,2));

        }

        System.out.printf("sum %.5f ", sum);
    }
}