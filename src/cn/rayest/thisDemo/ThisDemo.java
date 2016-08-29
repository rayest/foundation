package cn.rayest.thisDemo;

/**
 * Created by Rayest on 2016/8/29 0029.
 */
public class ThisDemo {
    public static void main(String[] args) {
        User user = new User("pay", 20);
        System.out.println(user.toString());
    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

     public void setName(String name){
         name = name;
     }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        age = age;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
