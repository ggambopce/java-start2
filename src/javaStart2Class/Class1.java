package javaStart2Class;

public class Class1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름: " + student1.name + ", 나이: " + student1.age + ", 성적:" + student1.grade);
        System.out.println("이름: " + student2.name + ", 나이: " + student2.age + ", 성적:" + student2.grade);



    }
}

/**
 * 클래스에 정의한 변수들을 멤버 변수, 또는 필드라 한다.
 * 멤버 변수(Member Variable): 이 변수들은 특정 클래스에 소속된 멤버이기 때문에 이렇게 부른다.
 * 필드(Field): 데이터 항목을 가리키는 전통적인 용어이다. 데이터베이스, 엑셀 등에서 데이터 각각의 항목을 필드라 한다.
 * 클래스는 관례상 대문자로 시작하고 낙타 표기법을 사용한다.
 * 클래스를 사용하면 `int` , `String` 과 같은 타입을 직접 만들 수 있다.
 * 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요하다. 이 설계도가 바로 클래스이다.
 * 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라 한다.
 */

/** 객체 생성
 * Student` 타입을 받을 수 있는 변수를 선언한다.
 * `Student` 는 `Student` 타입의 객체(인스턴스)를 받을 수 있다.
 * 객체를 사용하려면 먼저 설계도인 클래스를 기반으로 객체(인스턴스)를 생성해야 한다.
 * new Student()` : `new` 는 새로 생성한다는 뜻이다. `new Student()` 는 `Student` 클래스 정보를 기반으로 새로운 객체를 생성하라는 뜻이다.
 * 이렇게 하면 메모리에 실제 `Student` 객체(인스턴스)를 생성한다.
 * 객체를 생성하면 자바는 메모리 어딘가에 있는 이 객체에 접근할 수 있는 참조값(주소)을 반환한다.
 */

/** 객체 사용
 * 클래스를 통해 생성한 객체를 사용하려면 먼저 메모리에 존재하는 객체에 접근해야 한다. 객체에 접근하려면 `.` (점,dot)을 사용하면 된다.
 * 객체가 가지고 있는 멤버 변수(`name` , `age` , `grade` )에 값을 대입하려면 먼저 객체에 접근해야 한다.
 */