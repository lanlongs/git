/**
 * 我是一只红色的鸟，今年2岁。
 * 我是一条5斤重的鱼，今年3岁。
 *
 * 面向对象程序设计：
 *    1.分析类:
 *        动物 : Animal
 *        鸟   : Bird
 *        鱼   : Fish
 *
 *    2.分析属性:
 *        动物:   年龄 age
 *  *      鸟 :   颜色 color
 *  *      鱼 ：  重量 weight
 *
 *    3.分析行为:
 *         动物: 自白 show()
 *
 *    4.优化
 *
 */
public class HomeWork1 {
    public static void main(String[] args) {

        //1.产生鸟
        Bird bird=new Bird(2,"红色");
        //2.产生鱼
        Fish fish=new Fish(3,5);
        //3.输出自白
        bird.show();
        fish.show();
    }
}
/**
 * 动物类
 */
class Animal {
    //属性
    private int age; //年龄

    //构造方法
    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 自白
     */
    public void show() {
        System.out.println("今年"+age+"岁");
    }
}
/**
 * 鸟类
 */
class Bird extends Animal {
    private String color;  //颜色

    public Bird() {
    }

    public Bird(int age, String color) {
        //调用父类的带age参数构造方法
        super(age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void show() {
        System.out.print("我是一只"+color+"鸟,");
        super.show();//调用父类的show方法
    }
}
/**
 * 鱼
 */
class Fish extends Animal {
    private int weight; //重量

    public Fish() {
    }

    public Fish(int age, int weight) {
        super(age);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void show() {
        System.out.print("我是一只"+weight+"斤重的鱼,");
        super.show();
    }


}


