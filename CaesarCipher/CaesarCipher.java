

public class CaesarCipher {
	
	private static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String shiftedAlphabet;
	
	public CaesarCipher(int key) {
		key%=26;
		shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0, key);
	}
	
	public String encrypt(String message) {
		StringBuilder sb = new StringBuilder(message);
		
		for(int i=0;i<sb.length();i++) {
			char curr = sb.charAt(i);
			if(!Character.isLetter(curr)) continue;
			boolean isLowerCase = false;
			if(Character.isLowerCase(curr)) {
				isLowerCase = true;
				curr = Character.toUpperCase(curr);
			}
			int index = alphabet.indexOf(curr);
			
			if(!isLowerCase) sb.setCharAt(i, shiftedAlphabet.charAt(index));
			else {
				sb.setCharAt(i, Character.toLowerCase(shiftedAlphabet.charAt(index)));
			}
			
		}
		
		return sb.toString();
			
	}
	
	public String decrypt(String encryptedMessage) {
		StringBuilder sb = new StringBuilder(encryptedMessage);
		
		for(int i=0;i<sb.length();i++) {
			char curr = sb.charAt(i);
			if(!Character.isLetter(curr)) continue;
			boolean isLowerCase = false;
			if(Character.isLowerCase(curr)) {
				isLowerCase = true;
				curr = Character.toUpperCase(curr);
			}
			int index = shiftedAlphabet.indexOf(curr);
			
			if(!isLowerCase) sb.setCharAt(i, alphabet.charAt(index));
			else {
				sb.setCharAt(i, Character.toLowerCase(alphabet.charAt(index)));
			}
			
		}
		
		return sb.toString();
	}

}
