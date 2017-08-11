package com.plivo.api.data;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by 127.0.0.1.ma on 11/08/17.
 */
public class Machine {
    HashMap<String,String> links;
    ArrayList<String> allStates;
    HashMap<String,String> transitions;
    String currentState;

    public Machine(HashMap<String, String> links, ArrayList<String> allStates, HashMap<String, String> transitions) {
        this.links = links;
        this.allStates = allStates;
        this.transitions = transitions;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    public HashMap<String, String> getTransitions() {
        return transitions;
    }

    public void setTransitions(HashMap<String, String> transitions) {
        this.transitions = transitions;
    }

    public HashMap<String, String> getLinks() {
        return links;
    }

    public void setLinks(HashMap<String, String> links) {
        this.links = links;
    }

    public ArrayList<String> getAllStates() {
        return allStates;
    }

    public void setAllStates(ArrayList<String> allStates) {
        this.allStates = allStates;
    }
}
