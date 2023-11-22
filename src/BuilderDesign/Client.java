package BuilderDesign;

import BuilderDesign.Exceptions.InvalidArgumentException;

public class Client {
    public static void main(String[] args) throws InvalidArgumentException {
  // we create student object
        Student student = Student.CreateBuilder()
                .setAge(25)
                .setEmail("jajajaj@gmail.com")
                .setGender(Gender.MALE)
                .setName("KP")
                .setPsp(100.00)
                .setMobileNO("1234567899")
                .setUniversity("Scaler")
                .build();
    }
}
