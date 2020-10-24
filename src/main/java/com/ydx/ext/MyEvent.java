package com.ydx.ext;

import org.springframework.stereotype.Component;

/**
 * @ClassName MyEvent
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/10/24 21:44
 * @Version 1.0
 **/
@Component
public class MyEvent {

    private String myEvent;

    public MyEvent() {
        System.out.println("MyEvent无参构造");
    }

    public MyEvent(String myEvent) {
        this.myEvent = myEvent;
        System.out.println("MyEvent有参构造");
    }

    public String getMyEvent() {
        return myEvent;
    }

    public void setMyEvent(String myEvent) {
        this.myEvent = myEvent;
    }

    @Override
    public String toString() {
        return "MyEvent{" +
                "myEvent='" + myEvent + '\'' +
                '}';
    }
}
