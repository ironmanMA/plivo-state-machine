package com.plivo.api.state;

import static com.plivo.api.Main.stateMachine;

/**
 * Created by 127.0.0.1.ma on 11/08/17.
 */
public class AddState {
    public static void Do(String action){
        String[] states = action.split(" ");
        stateMachine.getAllStates().add(states[1]);
    }
}
