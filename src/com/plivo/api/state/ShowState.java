package com.plivo.api.state;

import com.plivo.api.data.Machine;

import java.util.Map;

/**
 * Created by 127.0.0.1.ma on 11/08/17.
 */
public class ShowState {

    private static void traverseStates(String currState, Machine stateMachine) {
        String newCurrState = stateMachine.getTransitions().get(currState);
        if (newCurrState == null) {
            System.out.println(currState);
            return;
        }
        System.out.print(currState + " <= ");
        traverseStates(newCurrState, stateMachine);
    }

    public static void Current(Machine stateMachine) {
        if (stateMachine.getCurrentState() == null) {
            System.out.println("No Valid Current State");
        } else {
            System.out.println("Current State: " + stateMachine.getCurrentState());
            System.out.print("Path till current state: ");
            traverseStates(stateMachine.getCurrentState(), stateMachine);
        }
    }

    public static void All(Machine stateMachine) {
        System.out.println("all States");
        stateMachine.getAllStates().forEach(System.out::println);

        System.out.println("all Links");
        for (Map.Entry entry : stateMachine.getLinks().entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}
