import java.util.Scanner;

public class greaterOf2 {
    
    public static int greater(int a, int b) {
        int greater = 0;

        if (a > b) {
            System.out.println("A is greater");
            }else{
                System.out.println("B is greater");
            }
        return greater;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
         int greater = greater(a, b);
        System.out.println(greater);
    }
}
