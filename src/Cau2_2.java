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



//
//2.2.tính các ptu ngoại trừ chính nó
//cho mảng số nguyên A gồm n phần tử
//hãy tạo ra một mảng B sao cho mỗi phần tử B[i] bằng tích tất cả các phần tử trong mảng A, ngoại trừ A[i]
//yêu cầu cốt lõi (bẫy thuật toán): tuyệt đối không sử dụng phép chia (/)
//dùng tư duy nhân dồn từ trái qua phải và phải qua trái



//2.1.tìm phần tử đa số
//cho một mảng số nguyên arr có kích thước n
// một phần tử được gọi là đa số nếu nó xuất hiện nhiều hơn n/2 lần trong mảng
//tìm và in ra phần tử đa số đó
// giả định: luôn luôn tồn tại một phần tử đa số trong mảng được cho


//3.phân loại màu sắc - dutch national flag algorithm
// cho 1 mảng số nguyên arr chỉ chứa 3 giá trị: 0,1,2 (đại diện cho 3 màu: đỏ, trắng, xanh
// sắp xếp lại mảng này theo thứ tự tăng dần sao cho các số cùng màu đứng cạnh nhau
//không sử dụng các thuật toán sắp xếp thông thường (như bubble sort lồng 2 vòng for)
//yêu cầu: giải quyết bài toán chỉ bằng 1 vòng lặp duy nhất (One pass - O(N)) và
// tráo đổi trực tiếp (in-place) trên mảng hiện tại
// sử dụng kĩ thuật 3 con trỏ (trái - giữa - phải)