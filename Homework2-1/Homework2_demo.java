import java.util.Comparator;
import java.util.PriorityQueue;

// demo for data structure, comparator and comparable
public class Homework2_demo {

    public static void main(String[] args) {

        // comparator and comparable
        // find the second min number
        int[] arrayCR = {2, 3, -1 , 4, 222, -445, 1, 2, 3, 5, 6,8, 45};
        MyInteger[] arrayCB = new MyInteger[5];
        arrayCB[0] = new MyInteger(2);
        arrayCB[1] = new MyInteger(3);
        arrayCB[2] = new MyInteger(-1);
        arrayCB[3] = new MyInteger(4);
        arrayCB[4] = new MyInteger(222);


        System.out.println("The second min number(CR): " + secondMinNumberCR(arrayCR));
        System.out.println("The second min number(Cb): " + secondMinNumberCB(arrayCB));



    }

    // comparator
    public static Integer secondMinNumberCB(MyInteger[] array) {
        // sanity check
        if (array.length < 2 ) {
            return null;
        }
        PriorityQueue<MyInteger> minPQ = new PriorityQueue<MyInteger>(2);
        minPQ.offer(array[0]);
        minPQ.offer(array[1]);
        for (int i = 2; i < array.length; i++) {
            Integer tmp = minPQ.peek().get();
            if (array[i].get() > tmp) {
                minPQ.poll();
                minPQ.offer(array[i]);
            }
        }
        return minPQ.peek().get();
    }

    public static Integer secondMinNumberCR(int[] array) {
        // sanity check
        if (array.length < 2 ) {
            return null;
        }
        PriorityQueue<Integer> minPQ = new PriorityQueue<>(2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1.equals(o2)) {
                    return 0;
                }
                return o1 < o2 ? -1 : 1;
            }
        });
        minPQ.offer(array[0]);
        minPQ.offer(array[1]);
        for (int i = 2; i < array.length; i++) {
            int tmp = minPQ.peek();
            if (array[i] > tmp) {
                minPQ.poll();
                minPQ.offer(array[i]);
            }
        }
        return minPQ.peek();
    }
    // comparable
    public static class MyInteger implements Comparable<MyInteger> {

        private Integer value;
        public MyInteger (Integer value) {
            this.value = value;
        }
        private Integer get() {
            return value;
        }
        private void set(Integer value) {
           this.value = value;
        }
        @Override
        public int compareTo(MyInteger o) {
            if (this.value.equals(o.get())) {
                return 0;
            }
            return this.value < o.get() ? -1 : 1;
        }
    }
}
