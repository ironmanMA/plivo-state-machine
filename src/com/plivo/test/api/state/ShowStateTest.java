package com.plivo.test.api.state;


import com.plivo.api.data.Machine;
import com.plivo.api.state.ShowState;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by 127.0.0.1.ma on 11/08/17.
 */
public class ShowStateTest extends TestCase {
    public static Machine stateMachine = new Machine(new HashMap<>(), new ArrayList<>(), new HashMap<>());

    public void setUp() throws Exception {
        stateMachine.getAllStates().add("s1");
        stateMachine.getAllStates().add("s2");
        stateMachine.getLinks().put("s1s2", "active");
        super.setUp();

    }

    public void tearDown() throws Exception {
        stateMachine = new Machine(new HashMap<>(), new ArrayList<>(), new HashMap<>());
        super.setUp();

    }

    public void testCurrent() throws Exception {
        ShowState.Current(stateMachine);
        assertTrue("This will succeed.", true);
    }

    public void testAll() throws Exception {
        ShowState.All(stateMachine);
        assertTrue("This will succeed.", true);
    }

}