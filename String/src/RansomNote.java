
/**
 * @author DouDou
 * @create 17-Mar-2022 6:12 PM
 **/
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length())
            return false;
        int[] cot = new int[26];
        for(char ch : magazine.toCharArray()) {
            cot[ch-'a']++;
        }
        for(char ch :ransomNote.toCharArray()){
            if (cot[ch-'a']<=0) {
                return false;
            }else {
                cot[ch-'a']--;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        RansomNote rn = new RansomNote();
        System.out.println(rn.canConstruct(ransomNote,magazine));

    }
}
