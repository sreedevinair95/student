import java.sql.SQLOutput;
import java.util.Scanner;

public class student {
    public static void main(String[] args) {

        int n, i, a, j, k, c;
        String b;
        String[] d = new String[20];
        String[] arr = new String[20];

        for (i = 1; i <= 50; i++) {
            System.out.println("Enter 1 for adding student name\n2 for searching name\n3 to exit");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            if (n == 1) {
                System.out.println("Enter number of students to add ");
                Scanner sc = new Scanner(System.in);
                a = sc.nextInt();

                System.out.println("Enter Student name to add");
                Scanner s1 = new Scanner(System.in);
                for (j = 0; j < a; j++)
                    arr[j] = s1.nextLine();
            }

            if (n == 2) {
                System.out.println("Enter name to search");
                Scanner s2 = new Scanner(System.in);
                b = s2.nextLine();
                for (j = 0; j < 2; j++) {
                    if (arr[j] == b) {
                        System.out.println("Search Found");
                        break;
                    } else
                        System.out.println("Search not Found");
                    break;
                }
            }
                
            if (n == 3) {
                System.out.println("bye bye");
                break;
            }

        }
    }
}



