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
public class Main {
    public static void main(String[] args) {
        WeatherData  a=new WeatherData  ();
        a.setMeasurements ( 1,12,1 );
        a.setMeasurements ( 1,23,22 );

        StatisticsDisplay as=new StatisticsDisplay ( a );
        as.update ( 3,4,3 );
        as.update ( 3,4,3 );
        as.update ( 3,4,3 );
        as.update ( 3,4,3 );
    }
}
