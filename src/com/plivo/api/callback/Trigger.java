package com.plivo.api.callback;

/**
 * Created by 127.0.0.1.ma on 11/08/17.
 */
public class Trigger {
    public static void Do(String stateNow, String stateFuture) {
        if (stateNow == null) {
            System.out.println("Hitting callback from State:" + stateFuture);
        } else {
            System.out.println("Hitting callback from State:" + stateNow + ", To:" + stateFuture);
        }
    }
}
