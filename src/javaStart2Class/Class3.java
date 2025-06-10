package javaStart2Class;

public class Class3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // 배열 선언
        Student[] students = new Student[]{student1, student2};
        // Student[] students = {student1, student2};

        // for문 적용 배열 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i].name + ", 나이: " + students[i].age + ", 성적:" + students[i].grade);
        }

        // 향상된 for문
        for (Student s : students) {
            System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적:" + s.grade);
        }
    }
}

/** 배열 도입 - 리팩토링
 * 배열을 사용한 덕분에 출력에서 다음과 같이 for문을 도입할 수 있게 되었다.
 * 우리가 직접 정의한 `Student` 타입도 일반적인 변수와 동일하게 배열을 생성할 때 포함할 수 있다.
 * 생성과 선언을 동시에 하는 경우 다음과 같이 더 최적화 할 수 있다.
 * students[i].name` , `students[i].age` 처럼 `students[i]` 를 자주 접근하는 것이 번거롭다면 반복해서 사용하는 객체를 `Students s` 와 같은 변수에 담아두고 사용해도 된다.
 * 이런 경우에는 다음과 같이 향상된 for문을 사용하는 것이 가장 깔끔하다.
 */