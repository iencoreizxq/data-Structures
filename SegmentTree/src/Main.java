public class Main{

    public static void main(String[] args) {
        Integer[] nums = {-2, 0, 3, -5, 2, -1};
        SegmentTree<Integer> segmentTree = new SegmentTree<>(nums, new Merger<Integer>() {
            @Override
            public Integer merge(Integer a, Integer b) {
                return a + b;
            }
        }); //可以写成喇嘛塔表达式 (a,b) -> a + b
//        System.out.println(segmentTree);
        System.out.println(segmentTree.query(0, 2));;
        System.out.println(segmentTree.query(1, 4));;
        System.out.println(segmentTree.query(2, 5));;

    }
}
