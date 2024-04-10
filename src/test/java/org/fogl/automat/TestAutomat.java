package org.fogl.automat;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class TestAutomat {

    private final DEAAutomat deaAutomat = new DEAAutomat();


    @Test
    public void checkAutomatComplete() {

        String testInput = "ab";
        boolean trueIfEndPointReached = DEAAutomat.DEA(testInput);
        Assertions.assertTrue(trueIfEndPointReached);
    }

    @Test
    public void checkAutomatUnfinished() {

        String testInput = "abd";
        boolean falseIfEndpointNotReached = DEAAutomat.DEA(testInput);
        Assertions.assertFalse(falseIfEndpointNotReached);
    }
}
