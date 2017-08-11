package com.plivo.api.state;

import com.plivo.api.callback.Trigger;
import com.plivo.api.data.Machine;

/**
 * Created by 127.0.0.1.ma on 11/08/17.
 */
public class Move {
    public static void Do(String action, Machine stateMachine){
        String[] states = action.split(" ");
        String stateNew = states[1];
        String stateOld = stateMachine.getCurrentState();

        /*
          check if state exists
         */
        if (!stateMachine.getAllStates().contains(stateNew)) {
            System.out.println(stateNew + ", doest exist, can't move");
            return;
        }
        /*
            check with current state;
         */
        if (stateOld == null) {
            stateMachine.setCurrentState(stateNew);
            System.out.println("Initiated Transition " + stateNew);
        } else {
            if (stateOld.equals(stateNew)) {
                System.out.println("already at State:" + stateNew);
                return;
            } else {
                /*
                    check if link exists
                 */
                if (stateMachine.getLinks().get(stateOld + stateNew) == null &&
                        stateMachine.getLinks().get(stateNew + stateOld) == null) {
                    System.out.println("Path between " + stateNew + ", "
                            + stateOld + ", doest exist, can't move");
                    return;
                }
                stateMachine.getTransitions().put(stateNew, stateOld);
                stateMachine.setCurrentState(stateNew);
            }
        }
        Trigger.Do(stateOld, stateNew);
    }
}
