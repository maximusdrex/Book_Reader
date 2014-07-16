import java.io.*;
import java.util.ArrayList;
import acm.program.*;
import acm.util.*;

/**
 * Reads a Book and gets word count and much more useful information.
 * @author Maxwell
 * 
 */
public class GetWords {
	private BufferedReader GetAllWords;
	private int[] NumOfAllWords;
	private String[] ListOfAllWords;
	private ArrayList<String> ListOfWords = new ArrayList<String>();
	private String TheFileName;
	public GetWords(String FileName) {
		TheFileName = FileName;
	}
	private ArrayList<String> wordsOfTheList(String FileName) {
		try {
			GetAllWords = new BufferedReader(new FileReader(FileName));
			String TheLine;
			while ((TheLine = GetAllWords.readLine()) != null) {
				String[] Word = ReadWord(TheLine);
				if(ListOfWords.indexOf(Word) == -1) {
					ListOfWords.add(Word);
				}
			}
		} catch (IOException ex) {

		}
		return ListOfWords;
	}
	private String[] readWords(String Line) {
		Line = Line.toLowerCase();
		String[] WordsInLine;
		while(Line != null) {
			String NextWord = readNextWord(Line);
			Line. -= NextWord;
		}
	}
	private String readNextWord(String Line) {
		
	}
}
