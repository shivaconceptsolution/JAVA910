/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanceconcept;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author SHIVA
 */
public class MapExample {
    public static void main(String[] args) {
       // HashMap<String,Integer> hm = new HashMap<String,Integer>();
      //  LinkedHashMap<String,Integer> hm = new LinkedHashMap<String,Integer>();
      //  TreeMap<String,Integer> hm = new TreeMap<String,Integer>();
        Hashtable<String,Integer> hm = new Hashtable<String,Integer>();
        hm.put("rno", 1001);
        hm.put("fees", 5000);
        hm.put("marks", 800);
        
        Set<Map.Entry<String,Integer>> sm = hm.entrySet();
        for(Map.Entry<String,Integer> me:sm)
        {
            System.out.println(me.getKey()+" "+me.getValue());
        }
        
        
    }
    
}
