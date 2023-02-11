package JavaPractice.DataStructuresAndAlgorithms.Queue.AdjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    ArrayList<LinkedList<Node>> aList;


    Graph() {

        aList = new ArrayList<>();
    }

    public void addNode(Node node) {

        LinkedList<Node> currList = new LinkedList<>();
        currList.add(node);
        aList.add(currList);

    }

    public void addEdge(int src, int dest) {
        LinkedList<Node> currList = aList.get(src);
        Node destNode = aList.get(dest).get(0);
        currList.add(destNode);
    }

    public boolean checkEdge(int src, int dest) {
        LinkedList<Node> currList = aList.get(src);
        Node destNode = aList.get(dest).get(0);

        for (Node node : currList) {
            if (node == destNode) {
                return true;
            }
        }
        return false;
    }

    public void print() {

        for (LinkedList<Node> currentList : aList) {
            for (Node node : currentList) {
                System.out.print(node.data + " ->");
            }
            System.out.println();
        }

    }
}
