import java.util.Scanner;

public class sumOfOdd {
    
    public static int sumOfOdd (int num) {
        
        int i, sum = 0;
        for(i = 1; i <= num; i++){
            if(i % 2 != 0){
                sum = sum + i;
            }    
             
        }
        return sum;
        
    }
    public static void main(String[] args) {
        
        int number, oddSum = 0;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        oddSum = sumOfOdd(number);

        System.out.println(oddSum);

    }
}
