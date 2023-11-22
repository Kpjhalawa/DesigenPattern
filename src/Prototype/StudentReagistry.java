package Prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentReagistry {
    static Map<String,Student> studentMap = new HashMap<>();
  public static void reagistory(String key, Student student){
        studentMap.put(key, student);
    }
    public static Student get(String key){
        if(studentMap.containsKey(key)){
            return studentMap.get(key);
        }
        return null;
    }
}
