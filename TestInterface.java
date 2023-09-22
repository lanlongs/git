/**
 * 测试接口
 */
public class TestInterface {
}

interface MyInterface extends D,E{ //多继承
    //静态常量
    public final static int AGE=1;
    //抽象方法
    public abstract void hello();

    public static final int a=2;

    int b=1;
}

interface D {}
interface E {}

class A extends B {  //单一继承特性

}
class B {

}
class C {}
