package lesson7;

public class Test7 {
    public static void main(String[] args) {
//        testGraph();
//        testDfs();

        testFindPath();


//        testBfs();
    }

    private static void testFindPath() {
        Graph city = new Graph(10);
        city.addVertex("Москва");
        city.addVertex("Тула");
        city.addVertex("Рязань");
        city.addVertex("Калуга");
        city.addVertex("Липецк");
        city.addVertex("Тамбов");
        city.addVertex("Орел");
        city.addVertex("Саратов");
        city.addVertex("Курск");
        city.addVertex("Воронеж");
        city.addEdges("Москва", "Тула", "Рязань", "Калуга");
        city.addEdges("Тула","Москва", "Липецк");
        city.addEdges("Рязань","Москва", "Тамбов");
        city.addEdges("Калуга", "Москва","Орел");
        city.addEdges("Тамбов","Рязань", "Саратов");
        city.addEdges("Орел", "Калуга","Курск");
        city.addEdges("Липецк", "Тула", "Воронеж");
        city.addEdges("Саратов", "Тамбов", "Воронеж");
        city.addEdges("Курск", "Орел","Воронеж");
        city.addEdges("Воронеж","Липецк", "Саратов", "Курск");
        city.findPath("Москва","Воронеж");
    }

    private static void testBfs() {
        Graph graph = new Graph(8);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addVertex("H");

        graph.addEdges("A", "B", "C", "D");
        graph.addEdge("B", "E");
        graph.addEdge("E", "H");
        graph.addEdge("C", "F");
        graph.addEdge("D", "G");

        graph.bfs("A");
    }

    private static void testDfs() {
        Graph graph = new Graph(7);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");

        graph.addEdges("A", "B", "C", "D");
        graph.addEdge("B", "E");
        graph.addEdge("D", "F");
        graph.addEdge("F", "G");

        graph.dfs("A");
        //A B E C D F G
    }

    private static void testGraph() {
        Graph graph = new Graph(4);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdges("A", "B", "C");
        graph.addEdges("B", "A", "C", "D");
        graph.addEdges("C", "A", "B", "D");
        graph.addEdges("D", "B", "C");

        graph.display();
    }
}
