/**
 * 有一盏台灯，是需要装灯泡的，只有装上灯泡，一拉开关灯才会亮。
 *
 * 市场上有两种灯泡：一种是红灯泡，一种是绿灯泡，
 * 请用面向接口程序设计实现开灯灯亮的操作。
 *
 * 步骤:
 *   1.接口:  灯泡   发光
 *   2.实现类: 红灯泡 绿灯泡
 *   3.台灯  :  装灯泡，开灯
 *   4.测试
 *
 */
public class TestBuble {

    public static void main(String[] args) {
        //1.买一个台灯
        Lamp lamp=new Lamp();
        //2.买一个红灯泡
        Buble buble=new RedBuble();
        //3.装灯泡
        lamp.setBuble(buble);
        //4.开灯
        lamp.on();

        //5.换一个灯泡
        buble=new GreenBuble();
        lamp.setBuble(buble);
        lamp.on();
    }
}

/**
 * 灯泡
 */
interface Buble {
    void light();
}
/**
 * 红灯泡
 */
class RedBuble implements Buble {

    @Override
    public void light() {
        System.out.println("发红光");
    }
}

/**
 * 绿灯泡
 */
class GreenBuble implements Buble {

    @Override
    public void light() {
        System.out.println("发绿光");
    }
}

/**
 * 台灯
 */
class Lamp {
    private Buble buble;  //灯泡

    //装灯泡
    public void setBuble(Buble buble) {
        this.buble = buble;
    }

    //开灯
    public void on() {
        buble.light();
    }
}