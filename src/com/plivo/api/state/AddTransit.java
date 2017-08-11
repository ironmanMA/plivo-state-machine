package com.plivo.api.state;

import com.plivo.api.data.Machine;

/**
 * Created by 127.0.0.1.ma on 11/08/17.
 */
public class AddTransit {
    public static void Do(String action, Machine stateMachine){
        String[] states = action.split(" ");
        /*
            check if both states exist;
         */
        if (!stateMachine.getAllStates().contains(states[1])) {
            System.out.println(states[1] + ", doest exist, can't link");
            return;
        } else {
            if (!stateMachine.getAllStates().contains(states[2])) {
                System.out.println(states[2] + ", doest exist, can't link");
                return;
            }
        }
        /*
            check if lining same states
         */
        if (states[1].equals(states[2])){
            System.out.println("Same states won't be linked");
        }

        stateMachine.getLinks().put(states[1] + states[2], "active");
    }
}
