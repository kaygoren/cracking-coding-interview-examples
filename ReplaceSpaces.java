// Replace space character with %20
public class ReplaceSpaces {

    private static char[] replace(String s){
        int string_len = s.length();
        // String.chars() method returns stream of ints that represent the character codes.
        int space_count =(int) s.chars().filter(ch -> ch == ' ').count();

        int char_len = string_len - space_count + space_count*3;
        char[] chars = new char[char_len];

        int j = 0;
        for (int i = 0; i < string_len; i++) {
            if(s.charAt(i) != ' '){
                chars[j] = s.charAt(i);
                j++;
            }
            else{
                chars[j] = '%';
                chars[j+1] = '2';
                chars[j+2] = '0';
                j += 3;
            }
        }
        return chars;
    }

    public static void main(String[] args) {

        char[] result = ReplaceSpaces.replace("kenan aygoren  ");
        System.out.println(result);
    }
}
