package Obsever;

/**
 * Created by admin on 2017/11/30.
 */



/**
 * 这是一个类
 *
 * @author 张宾
 * @create 2017-11-02 13:51
 * @desc 斌斌
 **/
public class StatisticsDisplay  implements  Observer, DisplayElement {
    private int temperature; // 温度
    private int humidity; // 湿度
    private Subject weatherData = null;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver ( this );
    }


    public void display() {
        System.out.println("Statistics: " + temperature + "F degrees and " + humidity + "% humidity");
    }


    public void update(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

}
