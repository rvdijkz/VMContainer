package rvdijkz.nl;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Speler {
    private String name;

    private int points;

    public Speler(String string, int i) {
        this.name = string;
        this.points = i;
    }

    public static void printSpeler(List<Speler> spelers, Predicate<Speler> tester) {
        for (Speler speler : spelers) {
            if (tester.test(speler)) {
                System.out.println("bingoooo");
            }
        }
    }

    public static void addSpeler(List<Speler> spelers, Consumer<Speler> applicable) {
        for (Speler speler : spelers) {
            applicable.accept(speler);
        }
    }

    public static void printSpeler2(List<Speler> spelers, Predicate<Speler> tester, Consumer<Speler> applicable) {
        for (Speler speler : spelers) {
            if (tester.test(speler)) {
                applicable.accept(speler);
            }
        }
    }

    public static int operate(int a, int b, IMathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the points
     */
    public int getPoints() {
        return points;
    }

    /**
     * @param points the points to set
     */
    public void setPoints(int points) {
        this.points = points;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Speler [name=" + name + ", points=" + points + "]";
    }

}
