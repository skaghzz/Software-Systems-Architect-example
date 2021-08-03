
public class FullReport extends Report{
	@Override
	public String getBody(boolean isHTML,PuzzleWord[] words, PuzzleBuilder puzzlebuilder){
		String value = "";
		for (int i = 0; i < puzzlebuilder.getSize(); i++) {
			if (isHTML)
				value += "\tWord: <B>" + words[i].getValue() + "\tPosition: [" + words[i].getX() + ", " + words[i].getY() + "]" + "\tDir: " + words[i].getDir()
						+ " </B> Point: <B> " + puzzlebuilder.getPoint() + "</B>\n";
			else
				value += "\tWord: " + words[i].getValue() + "\tPosition: [" + words[i].getX() + ", " + words[i].getY() + "]" + "\tDir: " + words[i].getDir()
						+ " Point: " + puzzlebuilder.getPoint() + "\n";
		}
		return value;
	}
}
