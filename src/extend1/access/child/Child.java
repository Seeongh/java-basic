package extend1.access.child;

import extend1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1; //부모에 있는거 가져다 씀
        protectedValue = 2; //상속관계 or 같은 패키지
        //defultValue = 3; //다른 패키지라 접근 불가, 컴파일 오류
        //privateValue = 4; //다른 패ㅔ키지라 접근 불가

        publicMehtod();
        protectedMethod();

        printParent();

    }
}
