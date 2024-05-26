package Pipeline;

public class CloudPipeline extends DataPipeline{
    @Override
    public boolean connect(String url){
        boolean connect = false;
        System.out.println("Connecting cloud....");
        connect = true;
        return connect;
    }
    @Override
    public boolean transformData(){
        boolean transform = false;
        System.out.println("Transforming Data....");
        transform = true;
        return transform;
    }
    @Override
    public boolean storeData(){
        boolean store = false;
        System.out.println("Storing Data....");
        store = true;
        return store;
    }
}
