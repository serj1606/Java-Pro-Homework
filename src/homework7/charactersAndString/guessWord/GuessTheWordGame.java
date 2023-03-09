package homework7.charactersAndString.guessWord;

public class GuessTheWordGame {
    private static final String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
            "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
            "leek", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    private final String computerWord;

    private String guessedSymbols = "###############";

    public GuessTheWordGame() {
        computerWord = words[(int) (Math.random() * words.length)];
    }

    public boolean isGuessed(String playerWord) {
        return playerWord.equals(computerWord);
    }

    public String computerGuessedSymbols(String playerWord) {
        char[] temp = guessedSymbols.toCharArray();

        for (int i = 0; i < computerWord.length() && i < playerWord.length(); i++) {
            if (playerWord.charAt(i) == computerWord.charAt(i)) {
                temp[i] = computerWord.charAt(i);
            }
        }

        guessedSymbols = String.valueOf(temp);
        return guessedSymbols;
    }
}
