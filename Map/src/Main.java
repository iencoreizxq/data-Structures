import java.util.ArrayList;

public class Main {

    private static double testMap(Map<String, Integer> map, String filename) {
        Long startTime = System.nanoTime();
        System.out.println(filename);
        ArrayList<String> words = new ArrayList<>();
        if (FileOperation.readFile(filename, words)) {
            System.out.println("total words" + words.size());
            for (String word : words) {
                if (map.contains(word)) {
                    map.set(word, map.get(word) + 1);
                } else {
                    map.add(word, 1);
                }
            }
            System.out.println("total different words " + map.getSize());
            System.out.println("Frequency of PRIDE " + map.get("pride"));

        }
        Long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }
    public static void main(String[] args) {

        String filename = "Map/pride-and-prejudice.txt";
        BSTMap<String, Integer> bstMap = new BSTMap<>();
        double time1 = testMap(bstMap, filename);
        System.out.println("BST Map" + time1 + "s");

        System.out.println();

        LinkedListMap<String, Integer> linkedListMap = new LinkedListMap<>();
        double time2 = testMap(linkedListMap, filename);
        System.out.println("linkedListMap" + time2 + "s");

    }
}
