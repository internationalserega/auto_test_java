import java.util.Scanner;

public class Start2 {

    public  static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // System.in- метод для принятия значения из консоли
        int number = scanner.nextInt(); // ожидаем что вели число число
   //   number = scanner.nextLine(); // ожидаем что вели число строку

        System.out.println(number);
    }
}
