import java.util.Scanner;

public class student {
    public static void main(String[] args) {

        int n;
        int i;
        int a;
        int j;

        for (i=0;i<50;i++) {
            System.out.println("Enter 1 for adding student name\n2 for searching name\n3 to exit");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            if(n==1)
            {
                System.out.println("Enter number of students to add ");
                Scanner sc = new Scanner(System.in);
                a = sc.nextInt();

                String[]  arr = new String[20];
                System.out.println("Enter Student name to add");
                Scanner s1=new Scanner(System.in);
                for (j=1; j<= a; j++) {
                    arr[a] = s1.nextLine();
                }
            }


        }
    }
}
