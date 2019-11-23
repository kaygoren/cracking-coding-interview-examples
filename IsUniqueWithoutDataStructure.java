// Since int type is 4 byte(32bit) , difference of ascii values of characters in string should be in range 32.
// Therefore, we assumed that characters in string are in 'a-z'

public class IsUniqueWithoutDataStructure {

    private boolean isStringUnique(String s){
        int pointer = 0;
        int bit;
        int len = s.length();
        for(int i = 0; i<len; i++){
            bit = s.charAt(i) + 'a';
            if((pointer & (1 << bit)) != 0){
                return false;
            }
            pointer = pointer | (1 << bit);
        }
        return true;
    }

    public static void main(String[] args) {

        IsUniqueWithoutDataStructure isUnique = new IsUniqueWithoutDataStructure();
        boolean result = isUnique.isStringUnique("kaygoren00");
        if(result){
            System.out.println("All characters are unique.");
        }else {
            System.out.println("Some characters are used more than once.");
        }
    }
}
