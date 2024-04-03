import java.util.*;
import java.util.HashMap.*;

public class Hashing {
    public static void main(String[] args) {

                int[] arr=new int[]{1,2,1,6,2,4,3,4};
                HashMap<Integer,Integer> map=new HashMap<>();
                for(int i:arr)
                {
                    map.put(i,map.getOrDefault(i,0)+1);
                }
                for(Map.Entry<Integer,Integer> e:map.entrySet()) {
                    System.out.println(e.getKey() + "->" + e.getValue());
                }
    }
}
