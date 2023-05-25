import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tu nhien n: ");
        int n = scanner.nextInt();

        List<Integer> digits = new ArrayList<>();


        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            digits.add(digit);
            temp /= 10;
        }


        boolean isPalindrome = true;
        int size = digits.size();
        for (int i = 0; i < size / 2; i++) {
            if (digits.get(i) != digits.get(size - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(n + " la so thuan nghich");
        } else {
            System.out.println(n + "khong phai la so thuan nghich");
        }
    }
}
