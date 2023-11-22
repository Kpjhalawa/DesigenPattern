package Prototype;

public class Student implements prototype {
    private String name;
    private String batch;
    private double psp;
    private double averageBatchPsp;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public double getAverageBatchPsp() {
        return averageBatchPsp;
    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
 public Student(Student student){
        this.age = student.age;
        this.batch = student.batch;
        this.name = student.name;
        this.psp = student.psp;
        this.averageBatchPsp = student.averageBatchPsp;
 }

    public Student() {
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
