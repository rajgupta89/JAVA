import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
class freqency_count {
    public String frequency(String input1){
    Map<Character,Integer> li= new HashMap<>();
    for (int i = 0; i < input1.length(); i++) {
        if(li.containsKey(input1.charAt(i)))
          li.put(input1.charAt(i), li.get(input1.charAt(i))+1);
        else
          li.put(input1.charAt(i), 1);
    }
    String result="";
    for(Entry<Character,Integer> ent : li.entrySet()){
        result+= ent.getKey() + ent.getValue().toString();
    }
    return result;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input1=in.next();
        freqency_count obj=new freqency_count();
        System.out.println(obj.frequency(input1)); 
    }
}
