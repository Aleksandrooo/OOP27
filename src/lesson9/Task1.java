package lesson9;

/**
 * Created by Admin on 15.08.2016.
 */
public class Task1 {


}

class A{
    private  int a;
    public A(int a){
        this.a = a;
    }

}

class B extends A{
    private  int a;
    public B(int a){
        super(a);
    }

    @Override
    public String  toString(){
        return "Hello from B()";
    }

}