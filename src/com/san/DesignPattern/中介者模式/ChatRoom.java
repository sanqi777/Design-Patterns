package com.san.DesignPattern.中介者模式;

import java.util.Date;

/**
 * 中介类
 */

/**
 * 中介者模式
 * 是用来降低多个对象和类之间的通信复杂性。
 * 这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。中介者模式属于行为型模式。
 *
 * 注意：
 *       不应当在职责混乱的时候使用。
 */
public class ChatRoom {
    public static void showMessage(User user,String message){
        System.out.println(new Date().toString() + " [" + user.getName() +"] : " + message);
    }
}
