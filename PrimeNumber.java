import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number Number");
        int N = scanner.nextInt();

        for(int i=2;i<=N;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        scanner.close();

    }

    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }

        for(int i=2; i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;

    }

}


