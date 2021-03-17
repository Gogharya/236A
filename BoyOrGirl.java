import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class BoyOrGirl{
     public static void main(String[] args) {
        Scanner zico = new Scanner(System.in);
        String s = zico.nextLine();
        Set<Character> characterSet = new HashSet<>();
        for(int i=0 ; i<s.length();i++){
            characterSet.add(s.charAt(i));
        }
        if(characterSet.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else {
            System.out.println("IGNORE HIM!");
        }        
    }
}