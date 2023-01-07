import java.util.Scanner;

public class Arrays {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // marks[0] = 99;
        // marks[1] = 99;
        // marks[2] = 99;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }


        for(int i = 0 ; i < size; i++){
            System.out.println(numbers[i]);
        }
    }
}
