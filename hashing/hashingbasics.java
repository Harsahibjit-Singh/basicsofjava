package hashing;

import java.util.HashMap;
import java.util.Map;

public class hashingbasics {
    public static void main(String args[]){
        HashMap<Integer,Integer> fi = new HashMap<Integer,Integer>();
        int arra[]={1,2,3,4,5};
        for(int i=0;i<arra.length;i++){
            fi.put(i,arra[i]);
        }
        fi.remove(0);
        for(Map.Entry<Integer,Integer> entry : fi.entrySet())
        System.out.println(entry.getKey()+" -> "+entry.getValue());
        System.out.println(fi.containsKey(1));
        System.out.println(fi.containsValue(2)); //try to avoid because of O(n)
        fi.putIfAbsent(5,6);
        fi.putIfAbsent(5, 6);djdb
        fi.putIfAbsent(5, 7);
        fi.putIfAbsent(7, 7);
        for(Map.Entry<Integer,Integer> entry : fi.entrySet())
        System.out.println(entry.getKey()+" -> "+entry.getValue());
    }
}



