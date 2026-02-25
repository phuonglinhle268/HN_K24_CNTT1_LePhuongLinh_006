import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Nhập các phần tử (0, 1, 2): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int tmp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = tmp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int tmp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = tmp;
                high--;
            }
        }
        System.out.print("Mảng sau khi sắp xếp: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
