package hashMap;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 02-May-22
 */

import java.util.ArrayList;

public class Hashmap_Class {
    //    public static void main(String[] args) {
//        HashMap<Character,Integer> hashMap = new HashMap<>();
//        hashMap.put('A',85);
//        hashMap.put('B',45);
//        hashMap.put('Y',98);
//        hashMap.put('M',4);
//        hashMap.put('R',36);
//        hashMap.put('N',28);
//        hashMap.put('D',45);
//        System.out.println(hashMap);
//
//    }
// first insert node t.c is o(1)
// last insert node t.c is o(n)
// complexity
// array
// sorting
// revising hashMap
// LinkedList
//
    class Node {
        String Key;
        Integer Val;
        int K;
        int V;
        Node next;
        int size;


        ArrayList<Node> buckets;

        public Node(String k, Integer v) {
        }

        void Hashmap_Class() {

            buckets = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                buckets.add(null);

            }

        }

        void put(String K, Integer V) {
            int bucket_num = hashFN(K);
            Node head = buckets.get(bucket_num);
            Node nn = new Node(K, V);
            nn.next = head;
            buckets.set(bucket_num, nn);
            size++;
            double LF = (1.0 * size) / buckets.size();
            if (LF > 2) {
                //raj !!!!!!
                raj();
            }

        }

        private void raj() {
            ArrayList<Node> old = buckets;
            buckets = new ArrayList<>();
            for (int i = 0; i < buckets.size(); i++) {
                buckets.add(null);
            }
            for (Node head : old
            ) {
                Node temp = head;
                while (temp != null) {
                    if (temp.Key.equals(K)) {
                        temp = temp.next;
                    }


                }

            }
        }

        boolean ContainsKey(String K) {
            int bucket_num = hashFN(K);
            Node temp = buckets.get(bucket_num);
            while ((temp != null)) {
                put(temp.Key, temp.Val);


                temp = temp.next;

            }
            return true;
        }

        private int hashFN(String k) {
            int out = k.hashCode();
            return out % buckets.size();
        }


    }
}
