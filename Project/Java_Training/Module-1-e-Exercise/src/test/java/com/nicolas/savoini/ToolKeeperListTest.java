package com.nicolas.savoini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static com.nicolas.savoini.ToolKeeperInitialization.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ToolKeeperListTest {

    private ToolKeeper keeper = new ToolKeeper();

    @BeforeEach
    void before() {

        keeper = getKeeper();
    }

    @Test
    void testNumberOfTools() {

        assertEquals(4, keeper.getNumberOfTools());
    }

    @Test
    void testAllAvailableTools1() {

        List<Tool> tools = keeper.listAvailableTools(LocalDate.of(2022, 10, 17));
        assertEquals(getTools1(), tools);
    }

    @Test
    void testAllAvailableTools2() {

        List<Tool> tools = keeper.listAvailableTools(LocalDate.of(2022, 9, 1));
        assertEquals(getTools(), tools);
    }

    @Test
    void testAllNotAvailableTools() {

        List<Tool> tools = keeper.listNotAvailableTools(LocalDate.of(2022, 10, 17));
        assertEquals(List.of(getHammer()), tools);
    }

}
