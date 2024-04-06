package org.fogl.automat;

import org.fogl.constants.DEAStates;
import org.fogl.constants.DEATransitions;

public class DEAAutomat {

    public static boolean DEA(String input) {

        char state = DEAStates.STATE_START;

        char transitions = DEATransitions.INPUT_A;

        for (char c : input.toCharArray()) {

            switch (state) {

                case DEAStates.STATE_S -> {
                    switch (c) {
                        case DEATransitions.INPUT_A -> state = DEAStates.STATE_A;
                        case DEATransitions.INPUT_B -> state = DEAStates.STATE_C;
                        default -> state = DEAStates.STATE_INVALID;
                    }
                }
                case DEAStates.STATE_A -> {
                    switch (c) {
                        case DEATransitions.INPUT_B -> state = DEAStates.STATE_B;
                        case DEATransitions.INPUT_D -> state = DEAStates.STATE_A;
                        default -> state = DEAStates.STATE_INVALID;
                    }
                }
                case DEAStates.STATE_B -> {
                    switch (c) {
                        default -> state = DEAStates.STATE_INVALID;
                    }
                }
                case DEAStates.STATE_C -> {
                    switch (c) {
                        case DEATransitions.INPUT_C -> state = DEAStates.STATE_C;
                        default -> state = DEAStates.STATE_INVALID;
                    }
                }
            }
        }
        System.out.println("fertig");
        return state == DEAStates.STATE_END1 || state == DEAStates.STATE_END2;
    }
}
