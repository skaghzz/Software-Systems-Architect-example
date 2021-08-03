
public class PuzzleWord {
	private String value;
	private int x;//좌표x
	private int y;//좌표y
	private int dir;//가로 세로 방향
	
	public PuzzleWord(String value,int x,int y,int dir) {
		this.value = value;
		this.x = x;
		this.y = y;
		this.dir = dir;
	}

	public String getValue() {
		return value;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getDir() {
		return dir;
	}

}