

public class CaesarCipher2 {
	
	private CaesarCipher caesarCipher1;
	private CaesarCipher caesarCipher2;
	
	public CaesarCipher2(int key1, int key2) {
		caesarCipher1 = new CaesarCipher(key1);
		caesarCipher2 = new CaesarCipher(key2);
	}
	
	public String encrypt(String message) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		for(int i=0;i<message.length();i++) {
			if(i%2==0) sb1.append(message.charAt(i));
			else sb2.append(message.charAt(i));
		}
		
		sb1 = new StringBuilder(caesarCipher1.encrypt(sb1.toString()));
		sb2 = new StringBuilder(caesarCipher2.encrypt(sb2.toString()));
		
		StringBuilder encryptedMessage = new StringBuilder();
		
		for(int i=0;i<message.length();i++) {
			if(i%2==0) encryptedMessage.append(sb1.charAt(i/2));
			else encryptedMessage.append(sb2.charAt(i/2));
		}
		
		return encryptedMessage.toString();
	}
	
	public String decrypt(String encryptedMessage) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		for(int i=0;i<encryptedMessage.length();i++) {
			if(i%2==0) sb1.append(encryptedMessage.charAt(i));
			else sb2.append(encryptedMessage.charAt(i));
		}
		
		sb1 = new StringBuilder(caesarCipher1.decrypt(sb1.toString()));
		sb2 = new StringBuilder(caesarCipher2.decrypt(sb2.toString()));
		
		StringBuilder decryptedMessage = new StringBuilder();
		
		for(int i=0;i<encryptedMessage.length();i++) {
			if(i%2==0) decryptedMessage.append(sb1.charAt(i/2));
			else decryptedMessage.append(sb2.charAt(i/2));
		}
		
		return decryptedMessage.toString();
	}

}
