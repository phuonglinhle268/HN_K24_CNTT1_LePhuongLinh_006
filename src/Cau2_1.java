import java.util.Scanner;

public class Cau2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int candidate = arr[0], count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == candidate){
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }
        System.out.println("Phần tử là đa số: " + candidate);
    }
}
