import java.util.Scanner;
// n 3 op 2.5
class Question3{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the value of n : ");
        double n = sc.nextDouble();
        double a=1;
        double sum=0.0;
        
        for( double i=1.0; i <= n; i++){
            a=a*i;
            sum= sum + i/a; 

        }
        System.out.println(sum);
    }
}