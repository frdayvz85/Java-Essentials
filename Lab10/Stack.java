public class Stack {
    int currentSize = 0;
    int maximumSize;
    int[] array;

    Stack(int size) {
        this.maximumSize = size;
        array = new int[this.maximumSize];
    }

    // -push element to the top of the stack
    void push(int num) {
        if (currentSize < maximumSize) {
            array[currentSize] = num;
            currentSize++;
        }
    }

    // -pop element from the top of the stack
    void pop() {
        if (currentSize > 0) {
            array[currentSize - 1] = 0;
            currentSize--;
        } else {
            throw new IllegalArgumentException();
        }
    }

    // -peek the top element of the stack
    int peek() {
        return array[currentSize - 1];
    }

    // -obtain the size of the stack
    int size() {
        return currentSize;
    }

}
