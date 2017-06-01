

public class PuzzleBuilder {
	private final int row = 0;
	private final int col = 1;
	private PuzzleWord[] words;
	private int size;
	private String name;

	public PuzzleBuilder(String _name, int _size) {
		this.name = _name;
		words = new PuzzleWord[_size];
		size = 0;
	}

	public int getSize() {
		return size;
	}
	
	public String getName(){
		return name;
	}
	
	public PuzzleWord[] getPuzzleWord(){
		return words;
	}

	public int addWord(String inputWord, int x, int y, int dir) {
		if(checkDuplication(inputWord, dir))
			return -1;
		if (checkOverlap(inputWord, x, y, dir))
			return -2;
		words[size] = new PuzzleWord(inputWord,x,y,dir);
		size++;
		return 0;
	}

	private boolean checkOverlap(String inputWord, int x, int y, int dir) {
		boolean result = false;
		for (int i = 0; i < size; i++) {
			final boolean checkXStartOverlap = x >= words[i].getX() && x <= words[i].getX() + words[i].getValue().length();
			final boolean checkYStartOverlap = y >= words[i].getY() && y <= words[i].getY() + words[i].getValue().length();
			final boolean checkXEndOverlap = x + inputWord.length() >= words[i].getX() && x + inputWord.length() <= words[i].getX() + words[i].getValue().length();
			final boolean checkYEndOverlap = y + inputWord.length() >= words[i].getY() && y + inputWord.length() <= words[i].getY() + words[i].getValue().length();
			final boolean checkXOnword = words[i].getX() >= x && words[i].getX() <= x + inputWord.length();
			final boolean checkYOnWord = words[i].getY() >= y && words[i].getY() <= y + inputWord.length();
			final boolean checkSameY = words[i].getY() == y;
			final boolean checkSameX = words[i].getX() == x;
			
			if (words[i].getDir() == row) {
				if (dir == row) {
					if (checkSameY && (checkXStartOverlap || checkXEndOverlap)) {
						result = true;
						break;
					}
				} else {
					if (checkXStartOverlap && checkYOnWord) {
						result = true;
						break;
					}
				}
			} else {
				if (dir == col) {
					if (checkXOnword && checkYStartOverlap) {
						result = true;
						break;
					}
				} else {
					if (checkSameX && (checkYStartOverlap || checkYEndOverlap)) {
						result = true;
						break;
					}
				}
			}
		}
		return result;
	}

	private boolean checkDuplication(String inputWord, int dir) {
		boolean result = false;
		for (int i = 0; i < size; i++) {
			if (words[i].getValue().compareTo(inputWord) == 0 && words[i].getDir() == dir){
				result = true;
				break;
			}
		}
		return result;
	}

	public int getWordPosition(int coord, String inputWord, int dir) {
		for (int i = 0; i < size; i++) {
			final boolean isSameWord = words[i].getValue().compareTo(inputWord) == 0;
			final boolean isSameDirection = words[i].getDir() == dir;
			if (isSameWord && isSameDirection) {
				if (coord == 0)
					return words[i].getX();
				else
					return words[i].getY();
			}
		}
		return -1;
	}

	public int getPoint() {
		int totalPoint = 0;
		for (int i = 0; i < size; i++) {
			if (words[i].getDir() == row)
				totalPoint += words[i].getValue().length();
			else
				totalPoint += words[i].getValue().length() * 2;
		}
		return totalPoint;
	}

	public String getShortReport(boolean isHTML) {
		return new ShortReport().getReport(isHTML,this);
	}

	public String getFullReport(boolean isHTML) {
		return new FullReport().getReport(isHTML,this);
	}
}
