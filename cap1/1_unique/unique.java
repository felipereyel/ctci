// ASCII or unicode?
// bitArray(int)
// boolean flags instead of HashMap
// O(1) space
// O(n)
// if not other structures:
//     compare everything: o(n2)
//     sort and check neighboors: O(nlogn)

import java.util.*;

public class unique {
    
    public static void main(String[] args) {
        HashMap<Character,Integer> charMap = new HashMap<Character, Integer>();
        String toCheck = new String("aaaa");
        boolean uniqueFlag = true;
        
        for(char caracter: toCheck.toCharArray()){
            if(charMap.containsKey(caracter)){
                charMap.put(caracter, charMap.get(caracter)+1);
            } else {
                charMap.put(caracter, 1);
            }
            
        }
        
        for(char key: charMap.keySet()){
            if(charMap.get(key) > 1){
                uniqueFlag = false;
                break;
            }
        }   
        
        System.out.println(uniqueFlag);
    }
} //O(n)
