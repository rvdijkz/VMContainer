package rvdijkz.nl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainTest {

    public static void main(String[] args) {
        List<Speler> spelers = new ArrayList<Speler>();
        spelers.add(new Speler("speler1", 100));
        spelers.add(new Speler("speler2", 200));
        spelers.add(new Speler("speler3", 300));

        System.out.println("test 1:");
        Speler.printSpeler(spelers, q -> q.getPoints() > 100);

        System.out.println("test 2:");
        Speler.printSpeler(spelers, q -> q.getPoints() > 100 && q.getPoints() < 300);

        System.out.println("test 3:");
        Speler.addSpeler(spelers, q -> System.out.println(q.getName()));

        System.out.println("test 4:");
        Speler.printSpeler2(spelers, q -> q.getPoints() > 100, q -> System.out.println("naam: " + q.getName()));

        System.out.println("test 5:");
        IMathOperation subtraction = (a, b) -> a - b;
        System.out.println("10 - 5 = " + Speler.operate(10, 5, subtraction));

        System.out.println("test 6:");
        System.out.println("10 - 5 = " + Speler.operate(10, 5, (a, b) -> a - b));

        System.out.println("test 7:");
        IGreetingService greetingService = message -> System.out.println("hi: " + message);
        greetingService.sayMessage("JJ");

        System.out.println("test 8:");
        List<Speler> result = spelers.stream().filter(q -> q.getPoints() > 100).collect(Collectors.toList());
        System.out.println(result);

    }
}
