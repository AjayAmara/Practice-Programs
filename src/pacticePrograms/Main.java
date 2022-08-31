package pacticePrograms;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        int ri = 0;
    	
         Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("I",1);
        map.put("v",5);
        map.put("x",10);
        map.put("l",50);
        map.put("c",100);
        map.put("d",500);
        map.put("m",1000);
        
         for (Map.Entry<String,Integer> entry : map.entrySet()) 
         {
             if(entry.getKey().equals(s)){
                 
                // System. out. println(entry.getValue());
                 ri= entry.getValue();
             }
         }
        return ri;
    }
}

public class Main{
    
    public static void main(String[] args){
        
        Solution solu= new Solution();
        
       int rti= solu.romanToInt("c");
       System.out.println(rti);
    }
    
    
    
}
