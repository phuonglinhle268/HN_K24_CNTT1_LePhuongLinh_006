import java.util.Scanner;

public class Cau1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
