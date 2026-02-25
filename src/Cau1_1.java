import java.util.Scanner;

public class Cau1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi chữ thường: ");
        String s = scanner.nextLine();

        int[] checkName = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            checkName[c]++;
        }

        char result = '_';

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (checkName[c] == 1) {
                result = c;
                break;
            }
        }
        System.out.print("Ký tự đầu tiên: " + result);
    }
}

