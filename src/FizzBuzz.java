/**
 * Created by Cwolf on 3/9/17.
 */
public class FizzBuzz {
    public void doIt(int start, int end){
        String fizz = "Fizz";
        String buzz = "Buzz";

        for (int x = start; x <= end; x++){
            if ((x % 3) == 0 && (x % 5) == 0) {
                System.out.println(fizz + buzz);
                continue;
            } else if ((x % 3) == 0){
                System.out.println(fizz);
                continue;
            } else if ((x % 5) == 0){
                System.out.println(buzz);
                continue;
            }
            System.out.println(x);
        }
    }
}
