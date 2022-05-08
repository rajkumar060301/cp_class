package graph;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 02-May-22
 */

import java.util.HashMap;

public class GraphClass {
    HashMap<Integer, HashMap<Integer, Integer>> map;
    // permutation and combination
    //
    // v1v2v
    //b2v1
    // in graph store of edeges v * v
    // Graph solve problem method
    // 1. matrix
    // 2. addEdegegency


    public GraphClass(int total_V) {
        // HashMap<v1 nbrs to v1, HH<v1 ka nbr,Wt>>
        HashMap<Integer, HashMap<Integer, Integer>> map;
        map = new HashMap<>();

        for (int V = 0; V < total_V; V++) {
            map.put(V, new HashMap<>());
        }
    }

    public void addEdge(int V1, int V2, int wt) {
        HashMap<Integer, Integer> V1_nbr = map.get(V1);
        V1_nbr.put(V1, wt);
        HashMap<Integer, Integer> V2_nbr = map.get(V2);
        V2_nbr.put(V2, wt);
    }

    public boolean isNbr(int V1, int V2) {
        return map.get(V1).containsKey(V2);
    }

    public void removeEdge(int V1, int V2) {
        HashMap<Integer, Integer> v1_nbr = map.get(V1);
        v1_nbr.remove(V1);
        HashMap<Integer, Integer> v2_nbr = map.get(V2);
        v2_nbr.remove(V2);


    }

    public int noOfEdge() {
        int ans = 0;
        for (int v : map.keySet()) {
            int v_nbr = map.get(v).size();
            ans = ans + v_nbr;
        }
        return ans / 2;
    }
//    public boolean hashPath( int src, int dest){
//
//
//    }


}
