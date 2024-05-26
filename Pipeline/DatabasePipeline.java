package Pipeline;

public class DatabasePipeline extends DataPipeline{

    @Override
    protected boolean connect(String URL) {
        boolean connect = false;
        System.out.println("Connecting database....");
        connect = true;
        return connect;
    }

    @Override
    protected boolean transformData() {
        boolean transform = false;
        System.out.println("Transforming...");
        transform = true;
        return transform;
    }

    @Override
    protected boolean storeData() {
        boolean store = false;
        System.out.println("Storing...");
        store = true;
        return store;
    }
    
}
