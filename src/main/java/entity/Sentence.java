package entity;

public class Sentence extends Symbol {
    public Sentence(String content) {
        super(content);
    }

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
