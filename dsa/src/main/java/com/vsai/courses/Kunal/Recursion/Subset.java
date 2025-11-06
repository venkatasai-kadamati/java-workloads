package DSA.Courses.Kunal.Recursion;

import java.util.ArrayList;
import java.util.List;

// take | not-take pattern for pncombination
// the idea is to either pick the character and process it else leave it.
public class Subset {
    public static void main(String[] args) {
        List<String> arrLst = new ArrayList<>();
        subseq("", "abc", arrLst);
        System.out.println("the list of subsets are: " + arrLst);
    }

    static void subseq(String p, String up, List<String> arrLst){
        if(up.isEmpty()){
            arrLst.add(p);
            return;
        }

        char ch = up.charAt(0);
        // left take
        subseq(p + ch, up.substring(1), arrLst);
        // right not-take
        subseq(p , up.substring(1), arrLst);
    }
}
