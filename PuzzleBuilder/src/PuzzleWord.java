
public class PuzzleWord {
	private String value;
	private int x;//��ǥx
	private int y;//��ǥy
	private int dir;//���� ���� ����
	
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