import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class NgramString {


	    public static void main(String args[]) {

	        String value = "IEBS BPEKTM PTW HZ GXMHQV LXS T XKSUTTJ PHUGL TPL BAML UDPM OR XLB EXWIPX TXSBNS SR FI PMKI NVWXIPK JSO EKMMXR UJZA AXP SC IAM MMFM BXGY ESPRIBWGW PMGB LUSKIPIXL YSK BWFL PDSFITF JNX FWHQ HF FLIPT PMKI EIGDXLK GSKRXZGIW EXQA TTI QLKXUXRM WU PFAXP KOTXV IMXKTP HF BETBG PPBGA EPP HDP FIZPNAX SG BWB PHAPI FI PIL RHB IEX SYEPI VKMXR IQTZXS AJ TXEXZ MLTB LBKE GRLXEIG";

	        Scanner keyboard = new Scanner(System.in);
	        System.out.println("Enter value of N");
	        int n = keyboard.nextInt();
	        NgramIterator(value, n);
	        keyboard.close();

	    } //main
	    
	    public static void NgramIterator(String value, Integer n) {
	    	
	    	String newString= value.replaceAll("\\s+","");
	        System.out.println("New Value is: " + newString);
	        HashMap<String, NgramInfo> map = new HashMap<>();

	        for (int i =0 ; i<newString.length() - (n-1) ;i++) {
	        	String newKey = newString.substring(i, i+n); 
	            if (map.containsKey(newKey)) {
	            	NgramInfo info = map.get(newKey);
	            	info.count = info.count + 1;
	            	info.latestPosition = i ;
	            	//map.put(newKey, new NgramInfo(map.get(newKey) + 1)) ;
	            	map.put(newKey, info);
	            	
	            } else {
	            
	                //map.put(newKey, 1);
	            	map.put(newKey,  new NgramInfo(i, i, 1));
	            }
	        }
	        Set<String> keys = map.keySet();
	        
	        for (String key : keys) {
	        	NgramInfo info = map.get(key);
	        	int distance = info.latestPosition - info.firstPosition;
	        	String factors = factor(distance);
	        	if(info.count > 1) {
	        		System.out.print(key);
	        		System.out.println("  " + map.get(key) +  " factors : " + factors);
	        	}
	        }
	    } //iterator
	    
	    public static String factor(int distance) {
	    	StringBuilder sb = new StringBuilder();
	    	for(int i = 1; i <= distance; i++) {
				if(distance%i == 0) {
					sb.append(i + " , ");
				}
			}
	    	return sb.toString();
	    }
	}//class

class NgramInfo {
	
	public int latestPosition;
	public int firstPosition;
	public int count;
	
	public NgramInfo(int latestPosition, int firstPosition, int count) {
		super();
		this.latestPosition = latestPosition;
		this.firstPosition = firstPosition;
		this.count = count;
	}
	
	public String toString() {
		
		String result = "position: " + latestPosition +  " distance: " + (latestPosition - firstPosition) + " count: " + count;
		return result;
	}
	
	
	
}

