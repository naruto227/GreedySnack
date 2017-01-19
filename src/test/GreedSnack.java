package test;

/**
 * 贪吃蛇游戏
 * Created by hzq on 17-1-19.
 */
public class GreedSnack {
    public static void main(String[] args) {
        SnakeModel model = new SnakeModel(20,30);
        SnakeControl control = new SnakeControl(model);
        SnakeView view = new SnakeView(model,control);
        //添加一个观察者，让view成为model的观察者
        model.addObserver(view);

        (new Thread(model)).start();
    }
}
