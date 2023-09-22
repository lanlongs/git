/**
 * 假定你是张三，你有2个朋友，一个是中国朋友，名字叫王小强，
 * 一个是美国朋友，名字叫约翰，中国朋友喜欢打打太极，
 * 美国朋友喜欢打打橄榄球，要求输出，你作为主人，
 * 招待两位朋友吃饭和打太极或打橄榄球。
 *
 *  面向对象程序分析+多态步骤(1.要有继承结构 2.要有方法重写 3. 父类引用子类对象)
 *     1.类:
 *       朋友类:  Friend
 *       中国朋友 ChineseFriend
 *       美国朋友 AmericanFriend
 *       主人类 Master
 *
 *     2.属性
 *          朋友类:  姓名 name  国籍 nationality
 *  *       中国朋友
 *  *       美国朋友
 *  *       主人类  姓名 name
 *
 *      3.行为:
 *              朋友类:  吃  eat()
 *  *  *       中国朋友  打打太极 shadowBoxing()
 *  *  *       美国朋友  打打橄榄球 hitFootball()
 *  *  *       主人类  招待 serving()
 */
public class HomeWork2 {

    public static void main(String[] args) {
        //1.先来主人
        Master master=new Master("张三");
        //2.来一个朋友
        Friend friend=new ChineseFriend("王小强","中国");
        //3.招待朋友
        master.serving(friend);

        //4.更换朋友
        friend=new AmericanFriend("约翰","美国");
        //5.继续招待
        master.serving(friend);
    }
}

/**
 * 朋友
 */
abstract class Friend {
    private String name; //姓名
    private String nationality;  //国籍

    public Friend() {
    }

    public Friend(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    /**
     * 吃
     */
    public abstract void eat(String food);
}

/**
 * 中国朋友
 */
class ChineseFriend extends Friend {
    public ChineseFriend() {
    }

    public ChineseFriend(String name, String nationality) {
        super(name, nationality);
    }

    @Override
    public void eat(String food) {
        System.out.println("中国朋友吃"+food);
    }

    /**
     * 打太极
     */
    public void shadowBoxing() {

        System.out.println("打打太极");
    }
}

/**
 * 美国朋友
 */
class AmericanFriend extends Friend {
    public AmericanFriend() {
    }

    public AmericanFriend(String name, String nationality) {
        super(name, nationality);
    }

    @Override
    public void eat(String food) {
        System.out.println("美国朋友吃"+food);
    }

    /**
     * 打橄榄球
     */
    public void hitFootball() {
        System.out.println("打橄榄球");
    }
}

/**
 * 主人类
 */
class Master {
    private String name;  //姓名

    public Master() {
    }

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 招待朋友
     */
    public void serving(Friend friend) {
        //给个提示: 张三招待王小强：
        System.out.println(getName()+"招待"+friend.getName()+":");
        //判断朋友 是否是中国朋友
        //instanceof 判断某个对象是否属于某个类
        //语法:  对象名(变量名) instanceof 类名
        if(friend instanceof ChineseFriend) {

            //把friend转为中国朋友
            ChineseFriend chinese= (ChineseFriend) friend; //父-->子 向下转型
            //子-->父  向上转型
            chinese.eat("四川菜");
            chinese.shadowBoxing();
        }else if(friend instanceof AmericanFriend) {
            AmericanFriend american= (AmericanFriend) friend;
            american.eat("披萨");
            american.hitFootball();
        }
    }
}
