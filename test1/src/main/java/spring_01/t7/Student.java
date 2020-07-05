package spring_01.t7;

public class Student {
    private String name;
    private int age;
    private School school_7;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school_7.getName() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public School getSchool_7() {
        return school_7;
    }

    public void setSchool_7(School school_7) {
        this.school_7 = school_7;
    }
}
