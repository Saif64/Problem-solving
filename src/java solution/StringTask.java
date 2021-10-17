import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word = reader.next();
        word = word.toLowerCase();
        word = word.replaceAll("[aeiouy]", "");

        StringBuilder builder = new StringBuilder(word);
        for(int i=0; i<builder.length(); i+=2)
        {
            builder.insert(i, '.');
        }
        System.out.println(builder);
    }
}
