package com.plivo.api.state;

import static com.plivo.api.Main.stateMachine;

/**
 * Created by 127.0.0.1.ma on 11/08/17.
 */
public class Move {
    public static void Do(String action) {
        String[] states = action.split(" ");
        String stateNew = states[1];

        /*
          check if state exists
         */
        if (!stateMachine.getAllStates().contains(stateNew)) {
            System.out.println(stateNew + ", doest exist, can't move");
            return;
        }
        if (!stateMachine.getAllStates().contains(stateLater)) {
            System.out.println(stateLater + ", doest exist, can't move");
            return;
        }
        /*
            check with current state;
         */


        /*
            check if link exists
         */
        if (stateMachine.getLinks().get(stateFormer + stateLater) == null && stateMachine.getLinks().get(stateLater + stateFormer) == null) {
            System.out.println("Path between " + stateLater + ", " + stateLater + ", doest exist, can't move");
            return;
        }

        stateMachine.getTransitions().put(stateLater, stateFormer);
        stateMachine.setCurrentState(stateLater);
    }
}
