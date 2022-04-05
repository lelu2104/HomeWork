package HW6;

public class Person {
    public static String name;
    public static int age;
    public static boolean sex; //true - girl, false -man

    Person(String name, int age, boolean sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static String getName() {
        if (sex = true){
            return ("Mrs" + name);
        } else
        return ("Mr" + name);
    }

    public static void setName(String name) {
        Person.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Person.age = age;
    }

    public static boolean isSex() {
        return sex;
    }

    public static void setSex(boolean sex) {
        Person.sex = sex;
    }
}
