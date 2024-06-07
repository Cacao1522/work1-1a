import java.util.List;

import com.atilika.kuromoji.ipadic.Token;
import com.atilika.kuromoji.ipadic.Tokenizer;

public class Main {
	public static void main(String[] args) {
		Tokenizer tokenizer = new Tokenizer();
		String text = "吾輩は猫である。";
		List<Token> tokens = tokenizer.tokenize(text);
		for(Token token: tokens) {
//		System.out.print(token.getSurface()+" ");
//		System.out.print(token.getBaseForm()+" ");
//		System.out.print(token.getConjugationForm()+" ");
		System.out.print(token.getConjugationType()+" ");
//		System.out.print(token.getPosition()+" ");
//		System.out.print(token.getPronunciation()+" ");
//		System.out.print(token.getReading()+" ");
//		System.out.print(token.getPartOfSpeechLevel1()+" ");
//		System.out.print(token.getPartOfSpeechLevel2()+" ");
//		System.out.print(token.getPartOfSpeechLevel3()+" ");
		System.out.print(token.getPartOfSpeechLevel4()+" ");
		}
		System.out.println();
		text = "吾輩は猫である。名前はまだ無い。";
		String[] array = text.split("。");
	}
}
