package oop.encap.practice;

public class Student {

    private String name;
    private String studentId;
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()){
            System.out.println("유효하지 않은 이름입니다.");
            return;
//            name == null은 객체자체가 생성되었는지 를 확인하는 것이고, name.isEmpty()은 문자열이 비었는지를 확인하는 것이다.
        }
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if(studentId ==null || studentId.isEmpty()){
            System.out.println("유효하지 않은 학번입니다.");
            return;
        }
        this.studentId = studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
