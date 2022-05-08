package graph;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 05-May-22
 */

public class GraphExample {
    public static void main(String[] args) {
        GraphClass g = new GraphClass(7);
        g.addEdge(25, 35, 65);
        g.addEdge(24, 28, 52);
        g.addEdge(89, 38, 73);
        g.addEdge(35, 67, 35);
        g.addEdge(46, 38, 78);
        g.addEdge(29, 20, 53);
        System.out.println(g);

    }
}
