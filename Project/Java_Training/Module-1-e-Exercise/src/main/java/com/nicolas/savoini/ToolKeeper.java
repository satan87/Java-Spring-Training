package com.nicolas.savoini;

import lombok.Getter;

import java.time.LocalDate;
import java.util.*;

@Getter
public class ToolKeeper {

    List<Tool> tools = new ArrayList<>();

    List<Renting> rents = new ArrayList<>();

    public int getNumberOfTools() {

        return -1;
    }

    public List<Tool> listAvailableTools(LocalDate date) {

        return new ArrayList<>();
    }

    public List<Tool> listNotAvailableTools(LocalDate date) {

        return new ArrayList<>();
    }

    public void addTool(Tool tool) {

    }

    public void removeTool(Tool tool) {

    }

    public void borrowTool(Tool tool, Person borrower) {

    }

    public void returnTool(Tool tool) {

    }

    public List<Tool> toolsNeverRented() {

        return null;
    }

    public List<Tool> toolsMostRented(int top) {

        return new ArrayList<>();
    }

    public Person topBorrower() {

        return new Person("A");
    }

}
