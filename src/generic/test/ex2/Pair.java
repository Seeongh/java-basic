package generic.test.ex2;

public class Pair<F,S> {

    private F first ;
    private S Second ;


    public void setFirst(F first) {
        this.first = first;
    }

    public void setSecond(S second) {
        Second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return Second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", Second=" + Second +
                '}';
    }
}
