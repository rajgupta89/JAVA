import java.util.*;
import java.util.Map.Entry;

class majority_elements {
    public int majority(int input1, int[] input2) {
        Map<Integer, Integer> list = new HashMap<>();
        for (int i = 0; i < input1; i++) {
            if (list.containsKey(input2[i]))
                list.put(input2[i], list.get(input2[i]) + 1);
            else
                list.put(input2[i], 1);
        }
        // int count = 0;
        int result=0;
        for (Entry<Integer, Integer> ent : list.entrySet()) {
            if (ent.getValue() > input1 / 2) {
                result= ent.getKey();
                // count = 1;
                break;
            } else {
                // count = 0;
                result=-1;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int[] input2 = new int[input1];
        for (int i = 0; i < input1; i++) {
            input2[i] = in.nextInt();
        }
        majority_elements obj=new majority_elements();
        System.out.println(obj.majority(input1,input2)); 
    }
}