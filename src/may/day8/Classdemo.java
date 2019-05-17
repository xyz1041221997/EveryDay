package may.day8;

public class Classdemo {
    private String name;
    private String country;
    private int age;
    static String s = "靜態變量";
    Classdemo(){
        System.out.println("無參數的構造方法----------反射");
        System.out.println(s);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getS() {
        return s;
    }

    public static void setS(String s) {
        Classdemo.s = s;
    }
}
