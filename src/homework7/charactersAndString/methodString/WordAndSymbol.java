package homework7.charactersAndString.methodString;

public class WordAndSymbol {
    public int findSymbolOccurance(String string, char symbol) {
        int result = 0;
        char[] arr = string.toCharArray();

        for (char tmpChar : arr) {
            if (tmpChar == symbol) {
                result++;
            }
        }
        return result;
    }

    public int findWordPosition(String string, String target) {
        return string.indexOf(target);
    }

    public String stringReverse(String string) {
        StringBuilder result = new StringBuilder(string).reverse();

        return result.toString();
    }

    public boolean isPalindrome(String string) {
        return string.equals(new StringBuilder(string).reverse().toString());
    }
}
