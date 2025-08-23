package DSA.Courses.ApnaCol.Strings;

public class StringBuilderConcept {
    public static void main(String[] args) {
        // Just like string, stringbuilder is another data structure
        // Only difference is that it is mutuable
        StringBuilder sb = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        // remeber: for toString method to work, one should have an object.
        // ex: int a = 10; a.toString() xx fails
        // Integer a = 10; a.toString() .. works
        System.out.println(sb);
        
    }
}
