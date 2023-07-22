package problem;

import javax.xml.namespace.QName;

// this class violate SRP
// class has two jobs to deal with ( print , replace word in text )
public class Book {
    private String name;
    private String text;
    private String author;

    // constructor , setter and getter

    public String replaceWord(String word , String replacedWord){
        return text.replaceAll(word , replacedWord);
    }

    public boolean isInText(String word){
        return text.contains(word);
    }

    public void printText(){
        System.out.println("print text");
    }

}
