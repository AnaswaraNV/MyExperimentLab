import java.util.HashMap;

public class IntegerArrayCount {
    public static void main(String[] args) {
       
        int value;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        System.out.println("Enter a String :");
        int[] line  = { 1,2,3,6,1,3,7,21,49, 147,1 , 2 , 29 , 58 , 1 , 2 , 71 , 142, 1 , 5 , 31 , 155,1 , 2 , 3 , 6 , 9 , 18 , 27 , 54 , 81 , 162, 1 , 2 , 4 , 1 , 2 , 4 , 31 , 62 , 124 , 
                1 , 5 , 25 , 125,1 , 2 , 3 , 4 , 6 , 7 , 9 , 12 , 14 , 18 , 21 , 28 , 36 , 42 , 63 , 84 , 126 , 252 , 
                1 , 2 , 5 , 10 , 13 , 26 , 65 , 130 , 1 , 2 , 3 , 4 , 6 , 8 , 12 , 16 , 24 , 32 , 48 , 64 , 96 , 192 , 
                1 , 2 , 3 , 4 , 5 , 6 , 9 , 10 , 12 , 15 , 18 , 20 , 30 , 36 , 45 , 60 , 90 , 180 
                	,1 , 2 , 3 , 5 , 6 , 9 , 10 , 15 , 18 , 30 , 45 , 90 , 1 , 2 , 3 , 5 , 6 , 9 , 10 , 15 , 18 , 27 , 30 , 45 , 54 , 90 , 135 , 270
,1 , 2 , 3 , 5 , 6 , 7 , 10 , 14 , 15 , 21 , 30 , 35 , 42 , 70 , 105 , 210 ,1 , 2 , 3 , 4 , 6 , 9 , 12 , 18 , 36 
,1 , 3 , 5 , 9 , 15 , 25 , 45 , 75 , 225 , 
1 , 2 , 3 , 4 , 5 , 6 , 9 , 10 , 12 , 15 , 18 , 20 , 30 , 36 , 45 , 60 , 90 , 180 , 
1 , 2 , 3 , 6 , 9 , 18 , 
1 , 3 , 9 , 13 , 39 , 117, 
1 , 2 , 5 , 10 , 25 , 50 , 125 , 250,
1 , 2 , 3 , 4 , 5 , 6 , 10 , 12 , 15 , 20 , 30 , 60 ,
1 , 3 , 5 , 7 , 15 , 21 , 35 , 105 , 
1 , 2 , 3 , 4 , 6 , 11 , 12 , 22 , 33 , 44 , 66 , 132 ,
1 , 3 , 5 , 15 , 17 , 51 , 85 , 255 ,
1 , 2 , 5 , 10 , 13 , 26 , 65 , 130 , 
1 , 2 , 5 , 10 , 13 , 26 , 65 , 130 ,
1 , 2 , 3 , 5 , 6 , 9 , 10 , 15 , 18 , 30 , 45 , 90 ,
1 , 3 , 5 , 7 , 15 , 21 , 35 , 105 , 
1 , 2 , 3 , 4 , 5 , 6 , 9 , 10 , 12 , 15 , 18 , 20 , 30 , 36 , 45 , 60 , 90 , 180 , 
1 , 2 , 3 , 5 , 6 , 9 , 10 , 15 , 18 , 30 , 45 , 90 , 
1 , 2 , 3 , 5 , 6 , 9 , 10 , 15 , 18 , 30 , 45 , 90 };

        
        System.out.println(line.length);
        for (int i=0; i<line.length; i++){
        	
        	
            if(map.containsKey(line[i])){
                value = map.get(line[i]);
                value ++;
                map.put(line[i],value);
            }else{
                map.put(line[i],1);
            }
        }
       // for ( Character key : map.keySet()){
         //   System.out.println("Character : '"+key+"' Count :"+map.get(key));
       // }
        
        for (int i=0; i< line.length;i++) {
        	System.out.println(" Count :"+map.get(line[i]) + " "+line[i]+" Position: " + i);
        }
    }
}