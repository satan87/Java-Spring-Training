package com.nicolas.savoini;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ToolKeeper {

    List<Tool> tools = new ArrayList<>();

    List<Renting> rents = new ArrayList<>();

    public List<Tool> listAvailableTools() {



        return new ArrayList<>();
    }

    public List<Tool> listNotAvailableTools() {



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

        return new ArrayList<>();
    }

    public List<Tool> toolsMostRented(int top) {

        return new ArrayList<>();
    }

    public List<Person> topBorrower() {

        return new ArrayList<>();
    }

    public List<Tool> topRenter() {

        return new ArrayList<>();
    }

}
