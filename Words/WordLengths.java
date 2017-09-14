
import javax.activation.FileDataSource;

public class WordLengths {

	public void countWordLengths(String message, int[] counts) {
		for(int i=0;i<message.length();i++) {
			int lenght = 0;
			while(i!=message.length()  && Character.isAlphabetic(message.charAt(i))  ) {
				lenght++;
				i++;
			}
			if(i==message.length()) {
				if(lenght>counts.length) counts[counts.length-1]++;
				else counts[lenght]++;
				break;
			}
			if(message.charAt(i)=='-' || message.charAt(i) == '\'') {
				if(i+1<message.length()) {
					if(Character.isAlphabetic(message.charAt(i+1))) {
						lenght++;
						i++;
						while(Character.isAlphabetic(message.charAt(i)) && i!=message.length()) {
							lenght++;
							i++;
						}
					}
				}
			}
			
			if(lenght==0) {
				 continue;
			}
			
			if(lenght>counts.length) counts[counts.length-1]++;
			else counts[lenght]++;
			
		}
	}
	
}
