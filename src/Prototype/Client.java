package Prototype;

public class Client {
    public static void main(String[] args) {
     StudentReagistry studentReagistry = new StudentReagistry();
     fillRegistry(studentReagistry);

     Student kp = studentReagistry.get("Sept2022BeginnerBatch").clone();
     kp.setAge(25);
     kp.setName("Krishnapal");
     kp.setPsp(100);

     Student Krishnapal = StudentReagistry.get("sept2022IntellegentBatch").clone();
     Krishnapal.setPsp(100);
     Krishnapal.setName("Krishnapal");
     Krishnapal.setAge(25);
        System.out.println("DEBUG POINT");
    }
    public static void fillRegistry(StudentReagistry studentReagistry){
        // we use list or what we want//
        // List<String> Batches  = getStudentBatches();

        Student sept2022Batch = new Student();
        sept2022Batch.setBatch("Sept2022BeginnerBatch");
        sept2022Batch.setAverageBatchPsp(90);
        StudentReagistry.reagistory("Sept2022BeginnerBatch",sept2022Batch);


        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setAverageBatchPsp(99);
        intelligentStudent.setBatch("sept2022IntellegentBatch");
        intelligentStudent.setIQ(190);

        StudentReagistry.reagistory("sept2022IntellegentBatch",intelligentStudent);
    }
}
