package EOF;

public class stack {

    int array[] = new int[10];
    int size = 0;

    void push(int p) {
        if (size == array.length) {
            System.out.println("Array is full");
        } else {
            array[size] = p;
            size++;
        }
    }

    void pop() {
        if (size > -1){
            size--;

            System.out.println("Pop : " + array[size]);
            array[size] = 0;
        } else {
            System.out.println("Array is empty");
        }

    }

    void peek() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);

        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
    }