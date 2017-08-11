package com.plivo.api.state;

import java.util.Map;

import static com.plivo.api.Main.stateMachine;

/**
 * Created by 127.0.0.1.ma on 11/08/17.
 */
public class ShowState {

    private static void traverseStates(String currState){
        String newCurrState=stateMachine.getTransitions().get(currState);
        if (newCurrState==null){
            return;
        }
        System.out.println(currState);
    }

    public static void Current() {
        System.out.println("all States");
        traverseStates(stateMachine.getCurrentState());
    }

    public static void All() {
        System.out.println("all States");
        stateMachine.getAllStates().forEach(System.out::println);

        System.out.println("all Links");
        for (Map.Entry entry : stateMachine.getLinks().entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}
