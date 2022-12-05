import java.util.*;
public class KotakPermen {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner x = new Scanner(System.in);
        int input = x.nextInt();

        if(input % 2 == 0 && input % 5 == 0){
            System.out.println("kotak permen");
        }else if (input % 2 == 0){
            System.out.println("kotak");
        }else if (input % 5 == 0){
            System.out.println("permen");
        }else{
            System.out.println(input);
            //bukan plagiasi
        }

    }
}
