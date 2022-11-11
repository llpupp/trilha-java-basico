import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Entre com o num:   ");
        num = scan.nextInt();
        if (num % 3 != 0 && num % 5 != 0) {
            System.out.println(num);
        }else{
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else {
            if (num % 3 == 0) {
                System.out.println("Fizz");
            }else{
                if (num % 5 == 0) {
                    System.out.println("Buzz");
                }

                }
            }
        }
    }
}