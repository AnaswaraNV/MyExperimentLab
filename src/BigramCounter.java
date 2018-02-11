
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.StringTokenizer;

import javax.swing.JTextArea;


public class BigramCounter implements Counter {
	Hashtable<String, Integer> myTable = new Hashtable<String,Integer>();

	@SuppressWarnings("deprecation")
	public void count(String str) {
		//reset the counting table
		myTable.clear();
		
		//Get rid of all non-alpha characters (except spaces)
		String alphaString = str.replaceAll("[^a-zA-Z ]", "");
		
		//Split the text into words
		StringTokenizer st = new StringTokenizer(alphaString);
		
		//for each word
		while(st.hasMoreTokens()){
			String currentWord = st.nextToken().toUpperCase();
			String currentBigram;
			
			for(int i = 0; i < currentWord.length(); i+=2){
				//if there are at least 2 characters in the current word
				if(currentWord.length() >= (i+2)){
					//separate 2-letter bigram
					currentBigram = currentWord.substring(i, i+2);
				}
				else{ //only 1 character left in current word
					//separate 1-letter bigram
					currentBigram = currentWord.substring(i);
				}
				//If bigram has been seen, add 1 to value
				if(myTable.containsKey(currentBigram)){
					Integer prevValue = myTable.get(currentBigram);
					myTable.put(currentBigram, prevValue + 1);
				}
				//else create new bigram entry in table
				else{
					myTable.put(currentBigram, new Integer(1));
				}
			}
		}
	}

	public void prt(JTextArea ta) {
		int totalSum = 0;
		ta.setText("Bigram\tFrequency\n");

		//Grab all of the bigram and put them in a list
		ArrayList<String> keys = new ArrayList<String>(myTable.keySet());
		//Sort the list of bigrams
		Collections.sort(keys);
		
		//Go through list of keys
		for(String curBigram : keys){
			totalSum += myTable.get(curBigram); //Update total count
			//Print bigram and count value
			ta.append(curBigram + "\t" + (Integer)myTable.get(curBigram) + "\n");
		}
		ta.append("\nTotal = " + totalSum);

	}

}