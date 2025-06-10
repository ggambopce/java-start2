package javaStart2Class;

public class Class2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름: " + students[0].name + ", 나이: " + students[0].age + ", 성적:" + students[0].grade);
        System.out.println("이름: " + students[1].name + ", 나이: " + students[1].age + ", 성적:" + students[1].grade);


    }
}

/** 배열 도입
 * `Student` 클래스를 사용한 변수들도 `Student` 타입이기 때문에 학생도 배열을 사용해서 하나의 데이터 구조로 묶어서 관리할 수 있다.
 * 자바에서 변수의 대입(`=` )은 모두 변수에 들어있는 값을 복사해서 전달하는 것이다.
 * 이 경우 오른쪽 변수인`student1` , `student2` 에는 참조값이 들어있다.
 * 그래서 이 값을 복사해서 왼쪽에 있는 배열에 전달한다. 따라서 기존`student1` , `student2` 에 들어있던 참조값은 당연히 그대로 유지된다.
 */
