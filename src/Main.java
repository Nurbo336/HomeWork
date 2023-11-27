import exception.NegativeNumberException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите положительное число");
        while (true){
            int num = sc.nextInt();

            try {
                if(num <= 0) {
                    throw new NegativeNumberException("Вы не ввели положительную число,повторите попытку");
                }
                System.out.println("Вы ввели положительную число");
                break;
            } catch (NegativeNumberException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}