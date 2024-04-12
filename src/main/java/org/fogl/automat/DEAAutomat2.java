package org.fogl.automat;

import org.fogl.constants.DEAStates;
import org.fogl.constants.DEAStates2;
import org.fogl.constants.DEATransitions;
import org.fogl.constants.DEATransitions2;

public class DEAAutomat2 {

    public static boolean DEA(String input) {

        char state = DEAStates2.STATE_START;

        for (char c : input.toCharArray()) {

            switch (state) {

                case DEAStates2.STATE_S -> {
                    switch (c) {
                        case DEATransitions2.INPUT_1 -> state = DEAStates2.STATE_A;
                        case DEATransitions2.INPUT_3 -> state = DEAStates2.STATE_A;
                        case DEATransitions2.INPUT_5 -> state = DEAStates2.STATE_A;
                        case DEATransitions2.INPUT_7 -> state = DEAStates2.STATE_A;
                        case DEATransitions2.INPUT_9 -> state = DEAStates2.STATE_A;

                        case DEATransitions2.INPUT_0 -> state = DEAStates2.STATE_B;
                        case DEATransitions2.INPUT_2 -> state = DEAStates2.STATE_B;
                        case DEATransitions2.INPUT_4 -> state = DEAStates2.STATE_B;
                        case DEATransitions2.INPUT_6 -> state = DEAStates2.STATE_B;
                        case DEATransitions2.INPUT_8 -> state = DEAStates2.STATE_B;

                        default -> state = DEAStates2.STATE_INVALID;
                    }
                }
                case DEAStates2.STATE_A -> {
                    switch (c) {
                        case DEATransitions2.INPUT_1 -> state = DEAStates2.STATE_S;
                        case DEATransitions2.INPUT_3 -> state = DEAStates2.STATE_S;
                        case DEATransitions2.INPUT_5 -> state = DEAStates2.STATE_S;
                        case DEATransitions2.INPUT_7 -> state = DEAStates2.STATE_S;
                        case DEATransitions2.INPUT_9 -> state = DEAStates2.STATE_S;

                        case DEATransitions2.INPUT_0 -> state = DEAStates2.STATE_B;
                        case DEATransitions2.INPUT_2 -> state = DEAStates2.STATE_B;
                        case DEATransitions2.INPUT_4 -> state = DEAStates2.STATE_B;
                        case DEATransitions2.INPUT_6 -> state = DEAStates2.STATE_B;
                        case DEATransitions2.INPUT_8 -> state = DEAStates2.STATE_B;

                        default -> state = DEAStates2.STATE_INVALID;
                    }
                }
                case DEAStates2.STATE_B -> {
                    switch (c) {
                        case DEATransitions2.INPUT_1 -> state = DEAStates2.STATE_S;
                        case DEATransitions2.INPUT_3 -> state = DEAStates2.STATE_S;
                        case DEATransitions2.INPUT_5 -> state = DEAStates2.STATE_S;
                        case DEATransitions2.INPUT_7 -> state = DEAStates2.STATE_S;
                        case DEATransitions2.INPUT_9 -> state = DEAStates2.STATE_S;

                        case DEATransitions2.INPUT_0 -> state = DEAStates2.STATE_B;
                        case DEATransitions2.INPUT_2 -> state = DEAStates2.STATE_B;
                        case DEATransitions2.INPUT_4 -> state = DEAStates2.STATE_B;
                        case DEATransitions2.INPUT_6 -> state = DEAStates2.STATE_B;
                        case DEATransitions2.INPUT_8 -> state = DEAStates2.STATE_B;

                        default -> state = DEAStates2.STATE_INVALID;
                    }
                }
            }
        }

        if (state == DEAStates2.STATE_END) {
            System.out.println("Automat hat den Endpunkt erreicht!");
        } else {
            System.out.println("Automat hat den Endpunkt nicht erreicht!");
        }

        return state == DEAStates2.STATE_END;
    }
}
