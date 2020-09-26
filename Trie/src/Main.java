import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1(){
        System.out.println("pride-and-prejudice");
        ArrayList<String> words = new ArrayList<>();
        if (FileOperation.readFile("Trie/src/pride-and-prejudice.txt",words)) {
            Long startTime = System.nanoTime();
            BSTSet<String> set = new BSTSet<>();
            for (String word : words) {
                set.add(word);
            }
            for (String word : words) {
                set.contains(word);
            }
            Long endTime = System.nanoTime();

            double time = (endTime - startTime) / 1000000000.0;
            System.out.println("BSTSet:" + time + "s");
        }
    }
    public static void test2(){
        System.out.println("pride-and-prejudice");
        ArrayList<String> words = new ArrayList<>();
        if (FileOperation.readFile("Trie/src/pride-and-prejudice.txt",words)) {
            Long startTime = System.nanoTime();
            Trie trie = new Trie();
            for (String word : words) {
                trie.add(word);
            }
            for (String word : words) {
                trie.contains(word);
            }
            Long endTime = System.nanoTime();

            double time = (endTime - startTime) / 1000000000.0;
            System.out.println("Trie:" + time + "s");
        }
    }
}
