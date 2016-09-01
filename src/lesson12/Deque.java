package lesson12;

/**
 * Created by Admin on 01.09.2016.
 */
public interface Deque {
        boolean pushFirst(int elem);
        boolean pushLast(int elem);

        Integer popFirst();
        Integer popLast();

        Integer takeFirst();
        Integer takeLast();

        int size();

        boolean isEmpty();
}
