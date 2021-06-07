package org.example.oop.lambdas;

import org.junit.jupiter.api.Test;

public class LambdasExample1 {

    @Test
    public void addStateListener_atJava7() {
        StateOwner stateOwner = new StateOwner();

        stateOwner.addStateListener(new StateChangeListener() {

            public void onStateChange(int oldState, int newState) {
                // do something with the old and new state.
            }
        });
    }

    @Test
    public void addStateListener_atJava8() {

        StateOwner stateOwner = new StateOwner();

        stateOwner.addStateListener(
                (oldState, newState) -> System.out.println("State changed")
        );

    }

}

interface StateChangeListener {
    public void onStateChange(int oldState, int newState);
}

class StateOwner {

    public void addStateListener(StateChangeListener listener) {
        System.out.println("some code..");
    }

}

