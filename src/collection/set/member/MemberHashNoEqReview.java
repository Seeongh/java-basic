package collection.set.member;

import java.util.Objects;

public class MemberHashNoEqReview {
    private String id;
    public MemberHashNoEqReview(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "MeberNoHashNoEqReview{" +
                "id='" + id + '\'' +
                '}';
    }
}
