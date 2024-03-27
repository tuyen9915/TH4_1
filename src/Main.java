import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*int size;
        int mang [];

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println(" Nhập kích thước mảng = ");
            size = sc.nextInt();
             if (size > 20)
                 System.out.println("Nhập mảng nhỏ hơn 20");
        } while (size>20);

        mang = new int[size];
        int j = 0;
        while (j < mang.length){
            System.out.println("Phần thử thứ "+(j + 1) +":");
            mang[j] = sc.nextInt();
        } */
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Nhập số a = ");
        a = sc.nextInt();
        System.out.print("Nhập số b = ");
        b = sc.nextInt();

        int tinh = test(a,b);
        System.out.println("Số lớn hơn giữa " + a + " và " + b + " là: "+ tinh);
    }
    private static int test( int a, int b){
        int max;
        if ( a < b)
            max = b;
        else
            max = a;
        return max;
    }
}