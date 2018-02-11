import java.util.HashMap;
import java.util.Scanner;

public class letterCount {
    public static void main(String[] args) {
        String line;
        int value;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        System.out.println("Enter a String :");
        line = "YSS DSFV FJLIKMSWP YSWEKF KR YSS NSENH HLBESG DI XPSE SE VSZNVVH GJID LFV JRNX BTHY XUG LJLFK";
        System.out.println(line.length());
        for (int i=0; i<line.length(); i++){
            if(map.containsKey(line.charAt(i))){
                value = map.get(line.charAt(i));
                value ++;
                map.put(line.charAt(i),value);
            }else{
                map.put(line.charAt(i),1);
            }
        }
       // for ( Character key : map.keySet()){
         //   System.out.println("Character : '"+key+"' Count :"+map.get(key));
       // }
        
        for (int i=0; i< line.length();i++) {
        	System.out.println(" Count :"+map.get(line.charAt(i)) + " "+line.charAt(i)+" Position: " + i);
        }
    }
}