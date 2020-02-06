package nested;

public class Relations {
    String name;
    Human human;

    public Relations(String name) {
        this(name, null);
    }

    public Relations(String name, Human human) {
        this.name = name;
        this.human = human;
    }
}