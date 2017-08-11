package com.plivo.api.state;

import com.plivo.api.data.Machine;


/**
 * Created by 127.0.0.1.ma on 11/08/17.
 */
public class AddState {
    public static void Do(String action, Machine stateMachine){
        /*
            check if state already exists
         */
        String[] states = action.split(" ");
        if (!stateMachine.getAllStates().contains(states[1])){
            stateMachine.getAllStates().add(states[1]);
        }
    }
}
