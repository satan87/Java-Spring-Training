package com.nicolas.savoini;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        String a = """
                
                An organization decided to form a group that is willing to share tools.
                
                The group has a file with the list of tool.
                The file has two files 
                - One with the list of tools and owner name
                - One for the renting with the name of the tool, the borrower name, date borrowed, date returned
                
                If the tool is not yet return, then then return Date will be an empty optional
                
                We need functions to:
                
                - Count number of tools
                - List the tool
                    - available at specific date
                    - not available at specific date
                    * Both list should be ordered by Tool name
                - Add a tool
                - Remove a tool
                
                - Rent a tool
                - Return a tool
                
                - List tools never rented
                - List the top three tools most rented (at least once)
                - List person who borrow the most - If equals sort by first name - if no borrower returns null
                
                Some rules to Simplify
                - There is only one occurence of a Tool (same name)
                - Rent are done at night, so the tool is available the same day
                """;


    }
}