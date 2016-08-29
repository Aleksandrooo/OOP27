package lesson11.homework;

import java.util.function.Consumer;

/**
 * Created by stefan on 22.08.16.
 */
public class Links {

    public static void main(String[] args) {
        LinkStackArr st = new LinkStackArr();
        System.out.println(st.pop());
        System.out.println(st.push(34));
        System.out.println(st.push(23));
        System.out.println(st.push(55));
        System.out.println(st.push(89));
        System.out.println(st.push(9));
        System.out.println(st.push(8));
        System.out.println(st.push(7));
        System.out.println(st.push(2));
        System.out.println(st.take());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());



        System.out.println(st.take());

//        Node n1 = new Node(19);
//        Node n2 = new Node(10);
//        Node n3 = new Node(4);
//        Node n4 = new Node(8);
//        Node n5 = new Node(9);
//
//
//        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//        n4.next = n5;
//        for(int i = 0;i<5;i++){
//
//        }
//
//        System.out.println(n1.value);
//        System.out.println(n2.value);
//        System.out.println(n3.value);
//        System.out.println(n4.value);
//        System.out.println(n5.value);


//        process(n1, System.out::println);
//
//        process(n1, System.out::print);
    }

    public static void process(Node first, Consumer<Node> cons){
        while(first != null){
            cons.accept(first);
            first = first.next;
        }
    }

}
