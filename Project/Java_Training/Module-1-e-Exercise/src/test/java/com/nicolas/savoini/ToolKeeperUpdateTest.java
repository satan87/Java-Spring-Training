package com.nicolas.savoini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static com.nicolas.savoini.ToolKeeperInitialization.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ToolKeeperUpdateTest {

    private ToolKeeper keeper = new ToolKeeper();


    @BeforeEach
    void before() {

        keeper = getKeeper();
    }

    @Test
    void testAddTool() {

        ToolKeeper keeper = getKeeper();
        // Person
        Person p = new Person("Nick");
        keeper.addTool(new Tool(p, "Generator"));

        assertEquals(5, keeper.getNumberOfTools());
   }

    @Test
    void testRemoveTool() {

        keeper.removeTool(getHammer());

        assertEquals(3, keeper.getNumberOfTools());
    }

    @Test
    void testBorrowTool() {

        keeper.borrowTool(getChainsaw(), getJack());

        assertEquals(8, keeper.getRents().size());
        assertEquals(2, keeper.listAvailableTools(LocalDate.now().plusDays(1)).size());
        assertEquals(2, keeper.listNotAvailableTools(LocalDate.now().plusDays(1)).size());
    }

    @Test
    void testReturnTool() {

        keeper.returnTool(getHammer());

        assertEquals(7, keeper.getRents().size());
        assertEquals(4, keeper.listAvailableTools(LocalDate.now().plusDays(1)).size());
        assertEquals(0, keeper.listNotAvailableTools(LocalDate.now().plusDays(1)).size());
    }

}
