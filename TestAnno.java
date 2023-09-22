/**
 * 匿名类测试
 */
public class TestAnno {

    public static void main(String[] args) {

        //用匿名类实现
        new MyInterface3() {

            @Override
            public void hello() {
                System.out.println("这是用匿名类实现的，哈哈!");
            }
        }.hello();
        //如果有一个父类，父类中有一个抽象方法，用匿名类去实现。
    }
}

interface MyInterface3 {
    void hello();
}
