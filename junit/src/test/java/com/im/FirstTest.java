package com.im;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {
    First obj;

    @Test
    void should_ReturnMainString_When_MainStringEmpty(){

        // given
        String mainString = null;
        String subString = "read";
        String replacementString = "writ";

        // when
        String result = obj.replaceSubString(mainString, subString, replacementString);

        // then
        assertEquals(mainString, obj.replaceSubString(mainString, subString, replacementString));

    }


}
