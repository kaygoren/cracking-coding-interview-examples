import java.util.Arrays;

public class CheckPermutation {

    private static boolean isPermutation(String s1, String s2){

        int len1 = s1.length();
        int len2 = s2.length();
        if(len1 != len2)
            return false;

        // use builtin sort(quick sort) function of array
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for (int i = 0; i < len1; i++) {
            if(c1[i] != c2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String str1 = "kenanaygoren";
        String str2 = "aygorenkenan";
        boolean result = CheckPermutation.isPermutation(str1, str2);
        if(result)
            System.out.println("strings are permutation of each other.");
        else
            System.out.println("strings are NOT permutation of each other.");
    }
}
