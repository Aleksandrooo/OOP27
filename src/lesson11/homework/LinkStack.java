package lesson11.homework;

/**
 * Created by Admin on 24.08.2016.
 */
public class LinkStack implements Stack {
    Node n1;


    @Override
    public boolean push(int element) {
        n1.value = element;

        return false;
    }

    @Override
    public Integer pop() {
        return null;
    }

    @Override
    public Integer take() {
        return null;
    }

    @Override
    public int size() {
        int size = 0;
        return size;
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty = false;
        return isEmpty;
    }
}
