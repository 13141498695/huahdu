package Obsever;

/**
 * Created by admin on 2017/11/30.
 */
import java.util.ArrayList;

/**
 * 这是一个类
 *
 * @author 张宾
 * @create 2017-11-02 13:51
 * @desc 斌斌
 **/
public class WeatherData implements  Subject {

    private ArrayList observers = null; // 观察者列表

    private int temperature=1; // 温度
    private int humidity=2; // 湿度
    private int pressure=3; // 气压

    public WeatherData() {
        observers = new ArrayList();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }


    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    /**
     * 更新通知所有的观察者
     */

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
