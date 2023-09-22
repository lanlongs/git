/**
 * 有一个u盘，它可以插入电脑使用，现在请模拟插入u盘输出数据这个场景。
 */
public class TestInterface2 {

    public static void main(String[] args) {

        //1.接口多态
        USB usb=new UDiskImpl();
        //2.调用接口中的方法
        usb.service();

    }
}

/**
 * USB   1.设计接口
 */
interface USB {
    /**
     * 服务
     */
    void service();
}

/**
 *  2.设计接口实现类
 */
class UDiskImpl implements USB {

    @Override
    public void service() {
        System.out.println("usb接口开始工作.......");
    }
}


