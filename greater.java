import java.util.Scanner;

public class greater {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b)
        {
            System.out.println("Numbers are equal");
        }
        else if(a > b)
        {
            System.out.println("A is greater than b");
        }
        else
        {
            System.out.println("B is greater than A");
        }
    }
}

