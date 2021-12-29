package Logic;

public class HckerrankAnagram {
    static int makeAnagram(String a, String b){
        int min_deletion = 0;

        int [] a_frequency = new int[26];
        int [] b_frequency = new int[26];

        for (int i = 0; i < a.length(); i++){
            char current_char = a.charAt(i);
            int char_to_int = (int) current_char;
            int position = char_to_int - (int) 'a';
            a_frequency[position]++;
        }

        for (int i = 0; i < b.length(); i++){
            char current_char = b.charAt(i);
            int char_to_int = (int) current_char;
            int position = char_to_int - (int) 'a';
            b_frequency[position]++;
        }

        for (int i = 0 ; i< 26; i++){
            int difference = Math.abs(a_frequency[i] - b_frequency[i]);
            min_deletion += difference;
        }
        return min_deletion;
    }
}
