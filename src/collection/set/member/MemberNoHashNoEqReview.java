package collection.set.member;

/**
 * hashcode와 equalsㄷ 구현안함
 */
public class MemberNoHashNoEqReview {
    private String id;
    public MemberNoHashNoEqReview(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MeberNoHashNoEqReview{" +
                "id='" + id + '\'' +
                '}';
    }
}
