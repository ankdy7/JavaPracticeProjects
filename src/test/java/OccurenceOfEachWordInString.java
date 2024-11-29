
import java.util.HashMap;
import java.util.LinkedHashMap;

public class OccurenceOfEachWordInString{
    public static void main(String args[]){

        String s="i am am in PS PS PS for three years year only only";
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
        int count;
        String [] ar = s.split("\\s+");
        for(String words : ar){
            count=0;
            for(int i=0;i<ar.length;i++){
                if(words.equalsIgnoreCase(ar[i])){
                    count++;
                }
            }
            hm.put(words, count);
        }

//            for (String name: hm.keySet()) {
//            String key = name.toString();
//            String value = hm.get(name).toString();
//            System.out.println(key + " " + value);
//
//
//        }

        hm.forEach((key, value) -> System.out.println(key + " " + value));

    }
}

