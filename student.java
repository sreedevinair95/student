import java.sql.SQLOutput;
import java.util.Scanner;

public class student {
    public static void main(String[] args) {

        int n, i, a, j, k, c;
        String b;

        for (i = 1; i <= 3; i++) {
            System.out.println("Enter 1 for adding student name\n2 for searching name\n3 to exit");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            if(n==1){
                System.out.println("Enter number of students to add ");
                Scanner sc = new Scanner(System.in);
                a = sc.nextInt();

                String[] arr = new String[20];
                System.out.println("Enter Student name to add");
                Scanner s1 = new Scanner(System.in);
                for (j = 0; j <a; j++) {
                    arr[j] = s1.nextLine();
                }
            }

            if (n == 2) {
                System.out.println("Enter name to search");
                Scanner s2 = new Scanner(System.in);
                b = s2.nextLine();
            }

            if (n == 3) {
                System.out.println("bye bye");
                break;
            }
        }
    }
}

