package Pipeline;

public class DataProcessing {
    public static void main(String[] args) {
        DataPipeline databasePipeline = new DatabasePipeline();
        DataPipeline cloudPipeline = new CloudPipeline();
        databasePipeline.connect("Database url");
        cloudPipeline.connect("Cloud url");
    }
}