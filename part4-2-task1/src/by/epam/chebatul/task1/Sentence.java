package by.epam.chebatul.task1;

public class Sentence {

	private String sentence;

	public Sentence() {
		super();
		sentence = "";
	}

	public Sentence(String sentence) {
		super();
		this.sentence = sentence;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public void addWord(Word word) {
		sentence += word.getWord();
	}
	
}
