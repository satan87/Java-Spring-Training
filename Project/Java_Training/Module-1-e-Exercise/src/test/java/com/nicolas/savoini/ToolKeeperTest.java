package com.nicolas.savoini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ToolKeeperTest {

    private ToolKeeper keeper = new ToolKeeper();

    @BeforeEach
    void before() {

        keeper.getTools().clear();
        keeper.getRents().clear();
    }

    @Test
    void testListAvailableTool() {

        

    }


}
