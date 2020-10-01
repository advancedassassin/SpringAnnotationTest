package com.ydx.bean;

/**
 * @ClassName Color
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/9/3 14:22
 * @Version 1.0
 **/
public class Color {

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Color{" +
                "car=" + car +
                '}';
    }
}
