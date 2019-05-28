package lesson3;

public class MainClass {
    public static void main(String[] args) throws Exception {

        Deque<Integer> deque = new DequeImpl<>(8);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(4);
        deque.addFirst(5);
        deque.addLast(1);
        deque.addLast(0);
        deque.popFirst();
        deque.popLast();
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println("----------------------------------------");


        while (!deque.isEmpty()) {
            System.out.println(deque.removeFirst());
        }

        System.out.println("----------------------------------------");
        String str = "HelloWorld";
        str = reverseString(str);
        System.out.println(str);
    }

    public static String reverseString(String str) throws Exception {
        Stack<Character> stack = new StackImpl<>(str.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            stack.push(str.charAt(i));
        }
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }

}
