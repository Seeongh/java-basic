package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static java.lang.Class.forName;

/**
 * ㅋ
 */
public class ClassMetaMain
{
    public static void main(String[] args) throws Exception {
        //class 조회
        Class clazz = String.class; //1.클래스에서 조회
        //Class clazz1 = new String().getClass(); //2. 인스턴스에서 조회
        //Class clazz2 = class.forName("java.lang.String"); //3. 문자열로 조회
        
        //모든 필드 출력
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field.getType() + " " + field.getName());
        }


        //메서드 출력
        Method[] methods = clazz.getDeclaredMethods() ;
        for (Method method : methods) {
            System.out.println("method = " + method);
        }
        //상위 클래스
        System.out.println(clazz.getSuperclass().getName());

        Class[] interfaces = clazz.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("interface = " + i.getName());

        }

    }
}