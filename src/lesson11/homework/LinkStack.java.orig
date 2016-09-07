package lesson11.homework;

/**
 * Created by Admin on 24.08.2016.
 */
public class LinkStack implements Stack {
    Node nd;
    boolean isEmpty = true;
    private int size = 0;


    @Override
    public boolean push(int element) {
        if(size == 0){
            nd = new Node(element);
            size +=1;
        }else {
            Node last = new Node(nd.value);
            //last = nd;
            nd = new Node(element);
            nd.next = last;
            size +=1;
        }
        isEmpty = false;
        return true;
    }
//    public Integer pop() {
//        if (!isEmpty()) {
//            Integer element = take();
//            if (tail.next != null) {
//                tail = tail.next;
//            } else {
//                tail = null;
//            }
//            size--;
//            return element;
//        }
//        return null;
//    }

    @Override
    public Integer pop() {
        int n;
        if(size == 0){
            isEmpty = true;
            return  null;

        } else {
            n = nd.value;
//            nd.value = nd.next.value;
            nd = nd.next;
            size -=1;
            return n;
        }

    }

    @Override
    public Integer take() {
        //int n;
        if(size !=0){
            //n = nd.value;
            return nd.value;
        } else {
            return null;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return isEmpty;
    }

    public String toString(){
//        while (nd.next != null){
//            System.out.printf("Element: %d \n\r", nd.value);
//        }
        if(nd.next != null){
            toString();
        } else {
            System.out.printf("Element: %d \n\r", nd.value);
        }
        System.out.printf("Element: %d \n\r", nd.value);

        return null;
    }
}
