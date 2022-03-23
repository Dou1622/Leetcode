/**
 * @author DouDou
 * @create 22-Mar-2022 4:52 PM
 **/
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] cot = new int[26];
        for(char ch: s.toCharArray()){
            cot[ch-'a']++;
        }
        for(char ch: t.toCharArray()){
            if(cot[ch-'a']>0){
                cot[ch-'a']--;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "rat";
        String t = "cat";
        ValidAnagram va = new ValidAnagram();
        System.out.println(va.isAnagram(s,t));
    }
}
