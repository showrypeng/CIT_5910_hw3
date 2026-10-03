import java.util.Scanner;

public class PositiveIntegerTest {
    public static void main(String[] args){

        // test isPerfect()
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()){
            int inputnum = s.nextInt();
            if (inputnum >0){
                PositiveInteger a = new PositiveInteger(inputnum);
                System.out.println(a.isPerfect());
            }
            else {
                System.out.println("Please enter a positive integer!");
            }
        }
    }
}
