package StringOperation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //        String str =sc.nextLine();
//        //String str ="teeter";
//        for (char i : str.toCharArray()){
//            if (str.indexOf(i) == str.lastIndexOf(i))
//                System.out.println("First Non Repeating Character is : "+i);
//               //break;
//        }


      // Using HashMap

        System.out.println("Please Enter the input String");
        String str = sc.nextLine();
        char ch = firstNonRepeatingCharacter(str);
        System.out.println("The First Non Repeating Character is :"+ ch);
    }

    private static Character firstNonRepeatingCharacter(String str1){

        HashMap<Character,Integer> characterHashTable = new LinkedHashMap<>();
        int length = str1.length();
        Character ch;
        for (int i = 0; i<length; i++){
            ch = str1.charAt(i);
            if (characterHashTable.containsKey(ch)){
                characterHashTable.put(ch, characterHashTable.get(ch)+1);
            }else {
                characterHashTable.put(ch,1);
            }
        }
        for (Map.Entry<Character,Integer> entry : characterHashTable.entrySet()){
            if (entry.getValue() == 1) return entry.getKey();
        }
        return null;
    }
}
