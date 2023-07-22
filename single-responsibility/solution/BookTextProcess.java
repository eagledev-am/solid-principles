package solution;

public class BookTextProcess {
    public String replaceWord(String word , String replacedWord , Book book){
        return book.getText().replaceAll(word , replacedWord);
    }
    public boolean isInText(String word , Book book){
        return book.getText().contains(word);
    }
}
