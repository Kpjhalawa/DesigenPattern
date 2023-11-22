package SingletonDesign.forSingleThread;

public class DatabseConnection {
    private static DatabseConnection databseConnection = null;
    private DatabseConnection(){}
    public static DatabseConnection getInstance(){
        if(databseConnection == null){
            databseConnection = new DatabseConnection();
        }
        return databseConnection;
    }
}
