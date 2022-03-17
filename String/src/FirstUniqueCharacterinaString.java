import java.util.HashMap;
import java.util.Map;


/**
 * @author DouDou
 * @create 16-Mar-2022 5:31 PM
 **/
public class FirstUniqueCharacterinaString {
 //39ms
/*    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            int count = map.getOrDefault(ch,0)+1;
            map.put(ch,count);
        }
        for(int i =0; i<s.length();i++){
            if(map.getOrDefault(s.charAt(i),0)==1)
                return i;
        }
        return -1;
    }*/

//1ms,faster than 100%
public int firstUniqChar(String s) {
    int res = s.length();
    for(char ch = 'a'; ch <='z';ch++){
        int id = s.indexOf(ch);
        if(id!=-1 && id==s.lastIndexOf(ch)){
            res=Math.min(res,id);
        }
    }
    return res==s.length()?-1:res;
}

    public static void main(String[] args) {
        String s = "leetcode";
        FirstUniqueCharacterinaString fucs = new FirstUniqueCharacterinaString();
        System.out.println(fucs.firstUniqChar(s));
    }
}
