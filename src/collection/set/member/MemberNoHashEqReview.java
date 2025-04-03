package collection.set.member;

import java.util.Objects;

public class MemberNoHashEqReview {
    private String id;
    public MemberNoHashEqReview(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberNoHashEqReview that = (MemberNoHashEqReview) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public String toString() {
        return "MeberNoHashNoEqReview{" +
                "id='" + id + '\'' +
                '}';
    }

}
