package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String phrase = String.valueOf(chars);
        System.out.println("Built Phrase: " + phrase);
    }

    public static void main(String[] args) {
        WordsBuilder wordsBuilder = new WordsBuilder();
        wordsBuilder.buildPhrase('H', 'e', 'l', 'l', 'o');
    }
}
