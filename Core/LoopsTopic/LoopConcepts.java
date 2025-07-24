package Core.LoopsTopic;

/*
  We have 4 types of loops
  1. While loop
  2. Do while loop
  3. For loop
  4. For each loop
 */

// Loops = automating repetitive statements

/*
  While loop syntax:
  while(cond){
  }
 */

/*
  Do While loop syntax:
  do{
  }While(cond)
 */


@SuppressWarnings("ALL")
public class LoopConcepts {
    public static void main(String[] args) {
        int n = 0;

/*
        // while loop is pre-check based so first condition is checked then ran
        while (n != 0) {
            System.out.println("runs in while block");
        }

        // do while loop is post-check based so first execution is done then we check
        do {
            System.out.println("runs in do while block");
        } while (n != 0);
*/

        // Finding the power of an value
        int base = 3;
        int power = 3;
        int finalVal = 1;
        while (power > 0) {
            finalVal = finalVal * base;
            power--;
        }
        System.out.println(finalVal);
    }
}
