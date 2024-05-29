package Decorator;

public class DataSourceDecorator implements IDataSource {
    private IDataSource wrappee;

    DataSourceDecorator(IDataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();

    }
}