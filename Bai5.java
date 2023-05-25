import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();

        double[] arr = new double[n];
        System.out.println("Nhap mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }

        System.out.print("Nhap So thuc A: ");
        double A = scanner.nextDouble();

        Set<Double> uniqueElements = new TreeSet<>(Comparator.reverseOrder());

        for (double num : arr) {
            uniqueElements.add(num);
        }

        System.out.println("Mang co chua so thuc A? " + uniqueElements.contains(A));

        System.out.println("Cac phan tu xuat hien dung mot lan theo thu tu giam dan trong A:");
        for (double num : arr) {
            if (Collections.frequency(Arrays.asList(arr), num) == 1) {
                System.out.println(num);
            }
        }
    }
}
