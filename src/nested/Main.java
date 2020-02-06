package nested;

public class Main {
    public static void main(String[] args) {

        Human h1 = new Human("Маша");
        Human h2 = new Human("Петя");
        h2.relations = new Relations("Все сложно", h1);
    }
}
