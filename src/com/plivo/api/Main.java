package com.plivo.api;

import com.plivo.api.data.Machine;
import com.plivo.api.state.AddState;
import com.plivo.api.state.AddTransit;
import com.plivo.api.state.Move;
import com.plivo.api.state.ShowState;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    private static String getActionData() {
        return sc.nextLine().toLowerCase().trim();
    }

    private static String getActionDataName(String actionData) {
        return actionData.split(" ")[0];
    }

    public static void main(String[] args) {
        Machine stateMachine = new Machine(new HashMap<>(), new ArrayList<>(), new HashMap<>());
        // write your code here
        while (true) {
            System.out.println("Enter your action");
            System.out.println("add   : adds new state");
            System.out.println("link   : adds new link, b/w states");
            System.out.println("move    : move to new state");
            System.out.println("show    : show current and previous state(s)");
            System.out.println("show_all: show all state(s)");
            System.out.println("exit: exit");
            String actionData = getActionData();
            switch (getActionDataName(actionData)) {
                case "add":
                    AddState.Do(actionData, stateMachine);
                    break;
                case "link":
                    AddTransit.Do(actionData, stateMachine);
                    break;
                case "move":
                    Move.Do(actionData, stateMachine);
                    break;
                case "show":
                    ShowState.Current(stateMachine);
                    break;
                case "show_all":
                    ShowState.All(stateMachine);
                    break;
                case "exit":
                    System.out.println("Closing State Machine, Bye!");
                    sc.close();
                    break;
                default:
                    break;
            }
            System.out.println("");
        }
    }
}
