
public class ShortReport extends Report{
	@Override
	public String getBody(boolean isHTML,PuzzleWord[] words,PuzzleBuilder puzzlebuilder){
		String value = "";
		for (int i = 0; i < puzzlebuilder.getSize(); i++) {
			if (isHTML)
				value += "\tWord: <B>" + words[i].getValue() + "</B>\tPoint: <B> " + puzzlebuilder.getPoint() + "</B>\n";
			else
				value += "\tWord: " + words[i].getValue() + "\tPoint: " + puzzlebuilder.getPoint() + "\n";
		}
		return value;
	}
}
