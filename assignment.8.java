public class SplitSentence {
    public static void main(String[] args) {

        String sentence = "Java is a programming language";

        // Split sentence into words
        String[] words = sentence.split(" ");

        // Display each word
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }

        // Rebuild sentence in a new format
        String newSentence = "";

        for (String word : words) {
            newSentence = newSentence + word.toUpperCase() + "-";
        }

        System.out.println("New format: " + newSentence);
    }
}
