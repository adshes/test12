import java.util.Scanner;
public class test12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String ct = in.nextLine();

        System.out.println(ct.replace(" ", ""));
    }

}