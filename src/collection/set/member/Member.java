package collection.set.member;

import java.util.Objects;

public class Member {
    private String id;

    public Member(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id); //id 가 같으면 같은 값이 되게 id로 hashcode를 만들어야함.
        //재정의 하지않으면 참조값이 달라 다른결과가 된다.
    }
}
