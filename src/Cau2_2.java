import java.util.Scanner;

public class Cau2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử cho mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        int newSize = 0;

        for (int i=0; i<n; i++){
            if (arr[i] >= 0){
                arr[newSize] = arr[i];
                newSize++;
            }
        }
    }
}
