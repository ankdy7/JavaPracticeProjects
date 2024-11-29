import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class RemoveDuplicateCharactersFromString {
    public static void main(String args[]) {
        String s = "mississippi";

        LinkedHashSet<Character> arr = new LinkedHashSet<>();
        for(int i =0;i<s.length();i++){
            arr.add(s.charAt(i));
        }

        Iterator<Character> itr=arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

