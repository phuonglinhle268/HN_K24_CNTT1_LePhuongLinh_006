import java.util.Scanner;

public class Cau1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập họ tên: ");
        String name = sc.nextLine();
        name = name.trim().toLowerCase();

        String[] parts = name.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < parts.length; i++) {
            String p = parts[i];
            char firstChar = Character.toUpperCase(p.charAt(0));
            String rest = p.substring(1);

            sb.append(firstChar).append(rest);

            if (i < parts.length - 1){
                sb.append(" ");
            }
        }
        System.out.println("Tên mới: " + sb.toString());
    }
}
