package com.nicolas.savoini;

import com.nicolas.savoini.example.Player;
import com.nicolas.savoini.example.PostalAddressInterface;
import com.nicolas.savoini.example.Team;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Team a = new Team("a", "London", "manager A");
        Team b = new Team("B", "Manchester", "manager B");

        Player p1 = new Player("Nico", "Las", a, "road Player a");
        Player p2 = new Player("Ahmed", "A", a, "Blvd Player 2");
        Player p3 = new Player("Other", "Player", b, "countryside");

        // Want to print all addresses

//        List<Player> players = List.of(p1, p2, p3);
//
//        Set<String> addresses = new HashSet<>();

//        for (Player player: players) {
//            addresses.add(player.getMailAddress());
//            addresses.add(player.getTeam().getMailAddress());
//        }

        List<PostalAddressInterface> objectThatWeCanSendMail = List.of(a, b, p1, p2, p3);
//
//        for(PostalAddressInterface objectThatCanbeMailed: objectThatWeCanSendMail) {
//            addresses.add(objectThatCanbeMailed.getMailAddress());
//        }

        Set<String> addresses = Stream.of(a, b, p1, p2, p3)
                .map(PostalAddressInterface::getMailAddress)
                .collect(Collectors.toSet());

        System.out.println("We have " + addresses.size() + "\n" +  addresses);

    }
}
