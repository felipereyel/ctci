// sequences of spaces are replaced just for one '%20' or the same quantity
// end spaces need to be replaced
// 

import java.util.*;

public class urlify {
    
    public static void main(String[] args) {
        String url = new String("Mr John Smith      ");
        char[] urlarray = url.toCharArray();
        int trueLength = 13;
        int numSpaces = 0;
        
        for(int i = 0; i < trueLength; i++){
            if(urlarray[i] == ' ') numSpaces++;
        }
        
        int index = trueLength + 3*numSpaces;
        for(int i = trueLength - 1; i >= 0; i--){
            if(urlarray[i] == ' '){
                urlarray[index - 1] = '0';
                urlarray[index - 2] = '2';
                urlarray[index - 3] = '%';
                index -= 3;
            } else {
                urlarray[index - 1] = urlarray[i];
                index--;
            }
        }
        
        System.out.println(urlarray.toString()z);
    }
}
