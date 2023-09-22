/**
 * 抽象类测试
 */
public class TestAbstract {
}

abstract class AA {
    public abstract void print();
}
class BB extends AA {

    @Override
    public void print() {
        System.out.println("hello");
    }
}
