import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        /*-------------------- I used only while loop------------------------------

        int a,b;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter bottom number : ");
        a = input.nextInt();

        System.out.print("Please enter top number : ");
        b = input.nextInt();

        int i = 1;
        int total = 1;

        while (i<=b){
            total *= a;
            i++;
        }
        System.out.print("Result of this exponential numbers  : " + total);*/



        /*-------------------- I used only for loop------------------------------*/

        int a,b,total = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter bottom(a) number : ");
        a = input.nextInt();

        System.out.print("Please enter top(b) number : ");
        b = input.nextInt();

        for(int i=1 ; i<=b ; i++){
            total *= a;
        }
        System.out.println("Result of this exponential numbers = " + total);
    }
}
