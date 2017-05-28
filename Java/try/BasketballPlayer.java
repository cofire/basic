/**
 * @Author:      liying
 * @DateTime:    2017-05-28 19:46:51
 * @Description: 篮球运动员继承运动员类
 */

public class BasketballPlayer extends Player{

    private int heigh;

    public BasketballPlayer(String name, int age,int heigh){
        super(name, age);
        this.heigh = heigh;
    }

    public int getHeigh(){
        return heigh;
    }

    public void play(){
        System.out.println("我打篮球！");
    }

    public static void main(String[] args) {
        BasketballPlayer bPlayer = new BasketballPlayer("liying",22,165);
        bPlayer.play();
        System.out.println(bPlayer.getName());
        System.out.println(bPlayer.getAge());
        System.out.println(bPlayer.getHeigh());

        Player bPlayer2 = new Player("liying",22);
        bPlayer2.play();
        System.out.println(bPlayer2.getName());
        System.out.println(bPlayer2.getAge());
    }
}
