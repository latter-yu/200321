//打开fn键盘：fn + esc

class Student {
    //main1
    //封装：private(私人的) 降低代码复杂程度
    private String name;
    public int age;
    private int age1;
    //类的实现者

    //private/ public 这两个关键字表示 "访问权限控制" .
    //被 public 修饰的成员变量或者成员方法, 可以直接被类的调用者使用.
    //被 private 修饰的成员变量或者成员方法, 不能被类的调用者使用.

    //idea 提供封装的以下两个方法
    //快捷键：alt + insert --> 选中 getter and setter
    //getName 即为 getter 方法, 表示获取这个成员的值.
    //setName 即为 setter 方法, 表示设置这个成员的值
    public void setName(String userName) {
        name = userName;
    }
    public String getName() {
        return name;
    }
    //封装性：
    //当成员变量被设置为私有的（private）
    //则需要提供一系列的get和set方法来初始化成员变量
    public void setAge1(int age1) {
        this.age1 = age1;
        //当set方法的形参名字和类中的成员属性的名字一样的时候
        //若不使用this，相当于自赋值
        //this：
        //1.表示当前对象的引用
        //2.在静态方法（例如static修饰的方法）内，不能使用this
        //3.this通过逗号可以访问普通成员变量（方法），也可以在构造方法内，调用另外一个构造方法（line61）
        //4.只能在构造方法内使用
    }
    public int getAge1() {
        return age1;
    }
}

class Test {
    //main2
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //构造：
    // 1.方法名称必须与类名称相同
    //2.构造方法没有返回值类型声明
    //3.每一个类中一定至少存在一个构造方法（没有明确定义，则系统自动生成一个无参构造）
    //注意事项：
    //如果类中没有提供任何的构造函数，那么编译器会默认生成一个不带有参数的构造函数
    //若类中定义了构造方法，则默认的无参构造将不再生成.
    //构造方法支持重载. 规则和普通方法的重载一致.

    //idea生成构造方法快捷键：
    //alt + insert --> 选择Constructor
    //只有构造方法调用完成之后，对象才能产生
    /*Test() {
        //默认产生的构造方法，没有返回值
        //调用不带参数的构造函数 如果程序没有提供会调用不带参数的构造函数
        System.out.println("test");//test
    }*/
    Test() {
        this("K",18);
        //调用带有两个参数的构造方法
        //必须放在第一行
        this.getName();
    }

    Test(String name, int score) {
        this.name = name;
        this.score = score;
        System.out.println("TEST");//TEST
    }

}

public class T200321 {
    public static void main(String[] args) {
        //Test test = new Test();//()内不带参数
        Test test0 = new Test();
        Test test1 = new Test("K", 18);
        System.out.println(test0.getName());//K
    }

    public static void main1(String[] args) {
        Student student = new Student();
        student.age = 18;
        student.setName("k");
        //类的调用者
        System.out.println(student.age);//18
        System.out.println(student.getName());//K

        student.setAge1(18);
        System.out.println(student.getAge1());//18
    }
}
