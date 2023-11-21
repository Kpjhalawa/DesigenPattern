package SingletonDesign.EagerLoading.DoubleCheckLooking;

import javax.xml.datatype.DatatypeConstants;

public class DatabaseConnection {
    private static DatabaseConnection databaseconnection = null;
     private DatabaseConnection(){}
    public static DatabaseConnection getInstance(){
         if(databaseconnection == null){
             synchronized (DatabaseConnection.class){
                 if(databaseconnection == null){
                     databaseconnection = new DatabaseConnection();
                 }
             }
         }
         return databaseconnection;
    }
}
/*
when two thread goes in this method then they chek lock
and taking lock
second check after taking lock ....

pros:-
1. Resource Efficiency
2. Creating a new object is inefficient

cons:-
1. Difficulty in testing a singleton class
 */