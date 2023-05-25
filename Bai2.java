import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua day: ");
        int n = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();

        System.out.println("Nhap day so nguyen:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            stack.push(number);
        }

        System.out.print("Nhap so phan tu muon lay tu Stack: ");
        int m = scanner.nextInt();

        System.out.println("Các phần tử trong Stack:");
        for (int i = 0; i < m; i++) {
            if (stack.isEmpty()) {
                System.out.println("Stack da het phan tu.");
                break;
            }
            int element = stack.pop();
            System.out.println(element);
        }
    }
}
