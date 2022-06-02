public class MainStack {
    public static void main(String[] args) {
        Stack s = new Stack(20);
        s.push(50);
        s.push(2);
        s.push(80);
        s.push(5);
        s.push(8);
        s.push(72);
        s.push(85);
        s.pop();
        System.out.println("after popping:");
        System.out.println("peek: " + s.peek());
        System.out.println("size: " + s.size());

    }
}