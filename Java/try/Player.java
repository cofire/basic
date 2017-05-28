/**
 * @Author:      liying
 * @DateTime:    2017-05-28 19:40:28
 * @Description: 运动员类
 */

public class Player{
    private String name;
    private  int age;

    public Player(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void play(){
        System.out.println("我是运动员，我爱运动！");
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}