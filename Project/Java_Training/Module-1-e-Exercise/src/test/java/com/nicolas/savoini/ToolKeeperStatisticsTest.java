package com.nicolas.savoini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static com.nicolas.savoini.ToolKeeperInitialization.getJoe;
import static com.nicolas.savoini.ToolKeeperInitialization.getKeeper;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ToolKeeperStatisticsTest {

    private ToolKeeper keeper = new ToolKeeper();

    @BeforeEach
    void before() {

        keeper = getKeeper();
    }

    @Test
    void testToolsNeverRented() {

        assertEquals(0, keeper.toolsNeverRented().size());
    }


    @Test
    void testToolsMostRented1() {

        assertEquals(Collections.emptyList(), keeper.toolsMostRented(-1));
        assertEquals(Collections.emptyList(), keeper.toolsMostRented(0));
        assertEquals(1, keeper.toolsMostRented(1).size());
        assertEquals(2, keeper.toolsMostRented(2).size());
        assertEquals(4, keeper.toolsMostRented(6).size());
    }

    @Test
    void testTopBorrower() {

        assertNull(new ToolKeeper().topBorrower());
        assertEquals(getJoe(), keeper.topBorrower());

    }

}
