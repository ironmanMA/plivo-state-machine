package com.plivo.api;

import com.plivo.api.data.Machine;
import com.plivo.api.state.AddState;
import com.plivo.api.state.AddTransit;
import com.plivo.api.state.ShowState;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static Machine stateMachine = new Machine(new HashMap<>(), new ArrayList<>(), new HashMap<>());
    private static Scanner sc = new Scanner(System.in);

    private static String getActionData() {
        return sc.nextLine().toLowerCase().trim();
    }

    private static String getActionDataName(String actionData) {
        return actionData.split(" ")[0];
    }

    public static void main(String[] args) {


        System.out.println("Enter your action");

        // write your code here
        while (true) {
            String actionData = getActionData();
            switch (getActionDataName(actionData)) {
                case "add_s":
                    AddState.Do(actionData);
                    break;
                case "add_t":
                    AddTransit.Do(actionData);
                    break;
                case "move":
                    AddTransit.Do(actionData);
                    break;
                case "show":
                    ShowState.Current();
                    break;
                case "show_all":
                    ShowState.All();
                    break;
                case "exit":
                    System.out.println("Closing State Machine, Bye!");
                    sc.close();
                    break;
                default:
                    break;
            }
        }
    }
}
