package BuilderDesign;

import BuilderDesign.Exceptions.InvalidArgumentException;

public class Student {
    private String name;
    private String email;
    private String university;
    private String mobileNO;
    private int age;
    private double psp;
    private Gender gender;

    private Student(Builder builder){
        this.name = builder.getName();
        this.email = builder.getEmail();
        this.university = builder.getUniversity();
        this.mobileNO = builder.getMobileNO();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.gender = builder.getGender();
    }
    public static Builder CreateBuilder(){
        return new Builder();
    }
 static class Builder{
  private String name;
  private String email;
  private String university;
  private String mobileNO;
  private int age;
  private double psp;
  private Gender gender;

   public String getName() {
    return name;
   }

   public Builder setName(String name) {
    this.name = name;
    return this;
   }

   public String getEmail() {
    return email;
   }

   public Builder setEmail(String email) {
    this.email = email;
    return this;
   }

   public String getUniversity() {
    return university;
   }

   public Builder setUniversity(String university) {
    this.university = university;
   return this;
   }

   public String getMobileNO() {
    return mobileNO;
   }

   public Builder setMobileNO(String mobileNO) {
    this.mobileNO = mobileNO;
    return this;
   }

   public int getAge() {
    return age;
   }

   public Builder setAge(int age) {
    this.age = age;
    return this;
   }

   public double getPsp() {
    return psp;
   }

   public Builder setPsp(double psp) {
    this.psp = psp;

   return this;
   }

   public Gender getGender() {
    return gender;
   }

   public Builder setGender(Gender gender) {
    this.gender = gender;

   return this;
   }
   private boolean Validate() {
    if (this.mobileNO.length() != 10 || (this.age < 18 && this.age > 50)) {
     return false;
    }
    return true;
   }
   public Student build() throws InvalidArgumentException{
    // start validation
    if(!Validate()){
     throw new InvalidArgumentException();
    }
    // end validation
    return new Student(this);
   }
  }
}
