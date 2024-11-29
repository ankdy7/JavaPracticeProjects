import java.util.LinkedHashMap;

public class OccurenceOfEachCharInString2 {
    public static void main(String args[]){

        String s="abbbcadeeaaaacccbbbbeeee";
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
        LinkedHashMap<Character, Integer> dup = new LinkedHashMap<>();
        int count;
        char [] ar = s.toCharArray();
        for(char ch : ar){
            count=0;
            for(int i=0;i<ar.length;i++){
                if(ch == ar[i]){
                    count++;
                }
            }

            if(count>1){
                dup.put(ch,count);
            }
            hm.put(ch, count);
        }

//        System.out.println(hm);
//
//        for (Character name: hm.keySet()) {
//            String key = name.toString();
//            String value = hm.get(name).toString();
//            System.out.println(key + " " + value);
//        }

        //hm.forEach((key, value) -> System.out.println(key + " " + value));
        dup.forEach((key, value) -> System.out.println(key + " " + value));

    }
}
