package Pipeline;

public abstract class DataPipeline {
    public final boolean processData(String url){
        if(connect(url)){
            if(transformData()){
                return storeData();
            }
        }
        return false;
    }
    protected abstract boolean connect(String URL);
    protected abstract boolean transformData();
    protected abstract boolean storeData();
}
