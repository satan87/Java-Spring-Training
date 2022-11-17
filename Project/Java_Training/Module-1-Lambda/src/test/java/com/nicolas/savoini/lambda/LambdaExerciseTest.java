package com.nicolas.savoini.lambda;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LambdaExerciseTest {


    /**
     * MAP
     */
    @Test
    void list_all_name_ordered() {

        List<String>  = new LambdaExercise().

        assertEquals(List.of("Bob", "Coline", "Chris", "Elaine", "Jane", "Jane", "John", "Marc", "Mary", "Mike", "Nicholas", "Rachel", "Rachel", "Rahul", "Sarah"),
                ...);
    }

    @Test
    void list_all_distinct_name_ordered() {

        List<String>  = new LambdaExercise().

        assertEquals(List.of("Bob", "Coline", "Chris", "Elaine", "Jane", "John", "Marc", "Mary", "Mike", "Nicholas", "Rachel", "Rahul", "Sarah"),
                ...);
    }

    @Test
    void list_all_department_name_with_persons_uppercase_ordered() {


        List<String>  = new LambdaExercise().

        assertEquals(List.of("ACCOUNTING", "HR", "IT", "MARKETING", "SALES"), ...);

    }

    /**
     * FILTER
     */
    @Test
    void list_departement_names_with_only_one_employee() {

        List<String>  = new LambdaExercise().

        assertEquals(List.of("HR"), ...);
    }

    @Test
    void list_sales_person_name_with_less_than_four_letter() {

        List<String>  = new LambdaExercise().

        assertEquals(Collections.emptyList(), ...);
    }



    /**
     * REDUCE
     */
    @Test
    void count_number_of_letter_for_all_employee_name() {

        int  = new LambdaExercise().

        assertEquals(73, ...);
    }


}
