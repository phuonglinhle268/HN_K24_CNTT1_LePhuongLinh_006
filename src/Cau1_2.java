import java.util.Scanner;

public class Cau1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi kí tự: ");
        String s = scanner.nextLine();
        s = s.trim();

        String result = "";
        boolean lastIsPlace = false;

        for (int i=0;  i <s.length(); i++){
            char c = s.charAt(i);

            if (c == ' '){
                if (!lastIsPlace){
                    result += " ";
                }
                lastIsPlace = true;
            } else {
                result += c;
                lastIsPlace = false;
            }
        }
        System.out.println(result);
    }
}

// chuẩn hóa chuỗi họ tên
//nhập 1 chuỗi tên người dùng nhập lộn xộn(nhiều khoảng trắng, viết hoa/thường tùy tiện)
// hãy chuẩn hóa lại theo quy tắc Title case (viết hoa chữ cái đầu mỗi từ, các chữ cái sau viết thường, mỗi từ cách nhau
// đúng 1 khoảng trắng