package com.ydx.gittest;

/**
 * @ClassName GitEmergeTest
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/9/15 14:08
 * @Version 1.0
 **/
public class GitEmergeTest {

    public void gitEmergeTest(){

        System.out.println("需要修改的代码---（修改代码）");

        // 需求增加
        System.out.println("增加需求代码写了1");
        System.out.println("增加需求代码写了2");
        System.out.println("增加需求代码写了3");
        // 不变的代码
        for (int i = 1;i<=10;i++) {
            System.out.println(i);
        }

    }

}
