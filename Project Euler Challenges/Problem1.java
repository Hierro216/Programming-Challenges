import java.util.Scanner;

public class Problem1{
    
    public static int multiplesBelow(int n){
        int sum = 0;
        int i = 3;
        while(i < n){
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
            i ++;
        }    
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int x = 0;
        System.out.println("Enter a number: ");
        x = kb.nextInt();
        System.out.println(Problem1.multiplesBelow(x));
    }
}