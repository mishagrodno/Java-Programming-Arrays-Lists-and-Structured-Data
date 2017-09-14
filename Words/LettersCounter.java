
public class LettersCounter {
	
	
	
	public int[] Counter(String message) {
		int arr[] = new int[25];
		for(int i=0;i<message.length();i++) {
			char curr = message.charAt(i);
			if(!Character.isAlphabetic(curr)) continue;
			curr = Character.toUpperCase(curr);
			arr[curr-'A']++;
		}
		return arr;
	}
	
	public char mostFrequent(String message) {
		int arr[] = Counter(message);
		int maximum = -1;
		char ch = 'A';
		for(int i=0;i<arr.length;i++) {
			if(maximum<arr[i]) {
				maximum = arr[i];
				ch = (char) ('A' + i);
			}
		}
		return ch;
	}

}
