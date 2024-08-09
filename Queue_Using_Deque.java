import java.util.*;

public class Queue_Using_Deque {
    static class Queue {
        Deque<Integer> deque = new LinkedList<>();
        //push
        public void push(int data) {
            deque.addLast(data);
        }

        //pop
        public int pop() {
            return deque.removeFirst();
        }

        //peek
        public int peek() {
            return deque.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();

        q.push(1);
        q.push(2);
        q.push(3);

        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
    }
}
