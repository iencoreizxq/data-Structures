import java.util.ArrayList;

public class LinkedListSet<E> implements Set<E> {

    private LinkedList<E> list;

    public LinkedListSet(){
        list = new LinkedList<>();
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(E e) {
        return list.contains(e);
    }

    @Override
    public void add(E e) {
        if (!list.contains(e)) {
            list.addFirst(e);
        }
    }

    @Override
    public void remove(E e) {
        list.removeElement(e);
    }

    public static void main(String[] args) {

        System.out.println("Pride and Prejudice");
        ArrayList<String> words1 = new ArrayList<>();
//        FileOperation.readFile("pride-and-prejudice.txt", words1);
        String word = "qwertyuiopasdfghjklzxcvbnmmlsds";
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            words1.add(String.valueOf(chars[i]));
        }

        System.out.println("Total words:" + words1.size());
        BSTSet<String> set1 = new BSTSet<>();
        for (String s : words1) {
            set1.add(s);
        }
        System.out.println("Total different words:" + set1.getSize());

    }
}
