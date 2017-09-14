
public class WordPlay {
	
	private String Vowels = "AEIOOU";
	
	public String replaceVowels(String phrase, char ch) {
		StringBuilder sb = new StringBuilder(phrase);
		for(int i=0;i<sb.length();i++)
		{
			if(isVowel(sb.charAt(i))){
				sb.setCharAt(i, ch);
			}
		}
		return sb.toString();
	}
	
	public String emphasize(String phrase, char ch) {
		StringBuilder sb = new StringBuilder(phrase);
		for(int i=0;i<sb.length();i++)
		{
			if(sb.charAt(i)==ch) {
				if(i%2==0)
				    sb.setCharAt(i, '*');
				else
					sb.setCharAt(i, '+');
			}
		}
		return sb.toString();
	}

	private boolean isVowel(char ch) {
		char Uch = Character.toUpperCase(ch);
		int idx = Vowels.indexOf(Uch);
		return (idx > 0);
	}

}
