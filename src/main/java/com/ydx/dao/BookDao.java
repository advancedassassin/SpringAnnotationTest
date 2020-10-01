package com.ydx.dao;

import org.springframework.stereotype.Repository;

/**
 * @ClassName BookDap
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/8/30 13:36
 * @Version 1.0
 **/
// 名字默认是类名小写
@Repository
public class BookDao {

    private String lable = "1";

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    @Override
    public String toString() {
        return "BookDao{" +
                "lable='" + lable + '\'' +
                '}';
    }
}
