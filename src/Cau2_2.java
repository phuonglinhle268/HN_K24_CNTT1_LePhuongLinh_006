import java.util.Scanner;

public class Cau2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();

        int[] A = new int[n];
        System.out.print("Nhập các phần tử: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int[] B = new int[n];
        int left = 1;
        for (int i = 0; i < n; i++) {
            B[i] = left;
            left *= A[i];
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            B[i] *= right;
            right *= A[i];
        }

        System.out.print("Mảng B: ");
        for (int i = 0; i < n; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
