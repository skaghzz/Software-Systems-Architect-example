
abstract public class Report {
	public String getReport(boolean isHTML,PuzzleBuilder puzzlebuilder){
		String value;
		value = getHeader(isHTML,puzzlebuilder.getName());
		value += getBody(isHTML,puzzlebuilder.getPuzzleWord(),puzzlebuilder);
		value += getTail(isHTML,puzzlebuilder.getPoint());
		return value;
	}
	
	private String getHeader(boolean isHTML,String name){
		if (isHTML) {
			return "<H1> Report on Puzzle <EM> " + name + "</EM></H1>\n";
		} else {
			return  "Report on Puzzle " + name + "\n";
		}
	}
	abstract String getBody(boolean isHTML,PuzzleWord[] words, PuzzleBuilder puzzlebuilder);
	
	private String getTail(boolean isHTML, int totalPoint){
		if (isHTML) {
			return "<HR> Total Point: <B>" + totalPoint + "</B><P>\n";
		} else {
			return "Total Point: " + totalPoint + "\n";
		}
	};
}
