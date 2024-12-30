public class ForLoopChar {
    public static void main(String[] args) {
        String sentence = "helllo guys what is your name and where are you from ?";
        System.out.println(sentence.length());
        for (int i = 0; i <sentence.length(); i++) {
            System.out.println(sentence.charAt(i));
        }
    }
}