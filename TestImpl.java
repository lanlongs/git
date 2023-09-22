/**
 * 接口方法实现
 */
public class TestImpl {
    public static void main(String[] args) {
        //采用的是接口多态
        //接口数据类型 接口名=new 实现类类名();
        MyInterface2 myInterface2=new Impl(); //接口引用实现类对象
        myInterface2.p();
    }

}

interface MyInterface2 {
    void p();
}

/**
 * 如果一个类实现了一个接口，那么这个类叫实现类。
 */
class Impl implements MyInterface2 {

    @Override
    public void p() {
        System.out.println("这是一个类去实现了接口中的抽象方法......");
    }
}
