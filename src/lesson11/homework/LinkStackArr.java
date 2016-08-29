package lesson11.homework;

/**
 * Created by Admin on 29.08.2016.
 */
public class LinkStackArr implements Stack {
    int [] array = new int[5];
    int lastElement =0;

    @Override
    public boolean push(int element) {
        if(lastElement < 5){
            array[lastElement] = element;
            lastElement +=1;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Integer pop() {
        if(lastElement ==0){
            int value = array[0];
            array[0] = 0;
            return value;
        } else {
            lastElement -=1;
            return array[lastElement];
        }
    }

    @Override
    public Integer take() {
        if(lastElement ==0){
            return array[0];
        } else {
            return array[lastElement - 1];
        }
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
