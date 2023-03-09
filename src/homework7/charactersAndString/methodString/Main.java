package homework7.charactersAndString.methodString;

public class Main {
    public static void main(String[] args) {
        WordAndSymbol wordAndSymbol=new WordAndSymbol();

        System.out.println(wordAndSymbol.findSymbolOccurance("winter", 't'));
        System.out.println(wordAndSymbol.findSymbolOccurance("apple", 'p'));
        System.out.println("---------------------");
        System.out.println(wordAndSymbol.findWordPosition("planet", "net"));
        System.out.println(wordAndSymbol.findWordPosition("planet", "es"));
        System.out.println("---------------------");
        System.out.println(wordAndSymbol.stringReverse("right"));
        System.out.println("---------------------");
        System.out.println(wordAndSymbol.isPalindrome("okko"));
        System.out.println(wordAndSymbol.isPalindrome("eva"));
    }

}
