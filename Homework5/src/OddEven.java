import java.util.Scanner;

public class OddEven {

    //find out if it is odd or even number

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Enter a Number ");
            int num = scanner.nextInt();
            if (num % 2 == 0)
                System.out.println(num + " Even Number ");
            else

                System.out.println(num + " Odd Number ");
        }
        }


