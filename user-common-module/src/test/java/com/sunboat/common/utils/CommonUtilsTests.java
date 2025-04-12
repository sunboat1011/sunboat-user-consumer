package com.sunboat.common.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonUtilsTests {

    @Test
    public void testGetMessage() {
        String message = CommonUtils.getMessage();
        assertEquals("This is a common message in 1.0.3-SNAPSHOT", message);
    }
}    