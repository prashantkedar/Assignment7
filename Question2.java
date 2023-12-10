import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x in degree: ");
        double x = scanner.nextDouble();
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        double rad = (3.14 / 180) * x;
      //  System.out.println(rad);
        double sum = 1.0;
        long a = 1;
        int b = -1;

        for (int i = 1; i<=n; i++){
            a= a*i;
            if (i%2 ==0){
                sum = sum+b*((Math.pow(rad,i))/a);
                b= b*-1;
            }

        }

        System.out.printf("%.2f",sum);
    
        

    }
}