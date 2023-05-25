import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua day: ");
        int n = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        System.out.println("Nhap day so nguyen:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            queue.add(number);
        }

        System.out.print("Nhap so phan tu muon lay tu Queue: ");
        int m = scanner.nextInt();

        System.out.println(cac phan tu trong Queue:");
        for (int i = 0; i < m; i++) {
            if (queue.isEmpty()) {
                System.out.println("Queue da het phan tu.");
                break;
            }
            int element = queue.poll();
            System.out.println(element);
        }
    }
}
