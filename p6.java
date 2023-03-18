import java.util.Scanner;
public class p6 {
    public static void main(String[] args) {
        System.out.println("Enter all the Subjects");
        Scanner sc = new Scanner(System.in);
        System.out.println("English");
        int a = sc.nextInt();
        System.out.println("Hindi");
        int b = sc.nextInt();
        System.out.println("Science");
        int c = sc.nextInt();
        System.out.println("Meth");
        int d = sc.nextInt();
        System.out.println("S.Science");
        int e = sc.nextInt();

        int sum = a+b+c+d+e;
        System.out.println("Enter the total marks: ");
        System.out.println(sum);

        int Percentage = sum/5;
        System.out.println("The total Percentage: ");
        System.out.print(Percentage);
        System.out.println("%");
    }
}
