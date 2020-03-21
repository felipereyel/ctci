// case sensitive comparison?
// whitespace?
// best solution: create hashmap or count array and add or sub for each array, then check id f map is zeroed

import java.util.*;

public class permutation {
    
    public static boolean checkForPermutation(String first, String second){
        int firstLength = first.length();
        int secondLength = second.length();
        
        if(firstLength != secondLength) return false;
        
        char[] firstCharArray = first.toCharArray();
        char[] secondCharArray = second.toCharArray();
        
        Arrays.sort(firstCharArray);
        Arrays.sort(secondCharArray);
        
        for(int i = 0; i < firstLength; i++){
            if(firstCharArray[i] != secondCharArray[i]){
                return false;
            }            
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        String first = new String("aaaaaa");
        String second = new String("ovomeu");
        boolean check = checkForPermutation(first, second);
        System.out.println(check);
        
    }
} //O(nlogn)
