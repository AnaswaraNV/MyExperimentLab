
public class NgramTester {


	public static void main(String[] args) {

		String str = "abcabcabc";
		NgramIterator obj = new NgramIterator(3, str);
		String result= null;
		
		obj.pos = 0 , 3;
		result = obj.next();
		
		
		System.out.println(result);
	}

}

