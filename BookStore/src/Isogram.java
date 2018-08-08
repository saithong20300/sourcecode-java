import java.util.HashSet;
import java.util.Set;

public class Isogram {

	public boolean check(String isoWord) {
		isoWord = isoWord.toLowerCase();
		isoWord = isoWord.replace(" ", "");
		isoWord = isoWord.replace("_", "");
		Set<Character> isoSet = new HashSet<Character>();
		int wordLength = isoWord.length();
		for (int i = 0; i < wordLength; i++) {
			if (!isoSet.add(isoWord.charAt(i))) {
				return false;
			}
		}

		return true;
	}

}
