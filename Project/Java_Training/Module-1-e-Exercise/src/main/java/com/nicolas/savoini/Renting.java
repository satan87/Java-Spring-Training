package com.nicolas.savoini;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Optional;

@AllArgsConstructor
@Getter
@Setter
public class Renting {

    private Tool tool;
    private Person borrower;
    private LocalDate borrowed;
    private Optional<LocalDate> returned;
}
