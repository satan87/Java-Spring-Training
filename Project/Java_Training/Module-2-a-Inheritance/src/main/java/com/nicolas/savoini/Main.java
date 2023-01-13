package com.nicolas.savoini;

import com.nicolas.savoini.inheritance.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.BasicConfigurator;

import java.util.List;

@Slf4j
public class Main {
    public static void main(String[] args) {

        BasicConfigurator.configure();


        /**
         * Collective Sport
         */

        Sport soccer = new CollectiveSport("Soccer", "Goal", 11);

        log.info("Soccer={}", soccer);
        log.info("Soccer is an instance of {} \n", soccer.getClass());

        /**
         * Individual Sport
         */

        Sport tennis = new IndividualSport("Tennis", "Hit the ball");

        log.info("Tennis = " + tennis);
        log.info("Tennis is an instance of {} \n", tennis.getClass());

        /**
         * We can put them both in the same list
         */

        List<Sport> sports = List.of(soccer, tennis);

        log.info("Sports is an instance of {}", sports.getClass());
        log.info("Sports = {} \n", sports);


        /**
         * Abstract Class cannot be instanciated
         */

        // This will not compile
//        Sport natation = new NatationSport("Nat", "Nat");

        Sport swimming = new SwimmingSport("Swim", "Swim");
        Sport synchronizedSwimming = new SynchronizedSwimmingSport("S Nat", "S Nat");

        log.info("SWIM = " + swimming);
        log.info("SWIM is an instance of {} \n", swimming.getClass());
        ((NatationSport)swimming).displayPoolSize();

        log.info("S NAT = " + synchronizedSwimming);
        log.info("S Nat is an instance of {} \n", synchronizedSwimming.getClass());
        ((NatationSport)synchronizedSwimming).displayPoolSize();

        sports = List.of(soccer, tennis, swimming, synchronizedSwimming);
        log.info("Sports = {} \n", sports);


    }
}


/*

                                        SPORT
                /                       |                   \
                Collective           Natation            Individual
                                    /       \
                               Swimming   SynchronizedS


 */