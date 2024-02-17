package singletonPattern.assignment;


public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {

    private FileBasedConfigurationManagerImpl() {
    }

    private static volatile FileBasedConfigurationManagerImpl INSTANCE;

    public static FileBasedConfigurationManager getInstance() {
        // TODO Auto-generated method stub
        if(INSTANCE == null)
            synchronized (FileBasedConfigurationManagerImpl.class){
            if(INSTANCE == null) {
                INSTANCE = new FileBasedConfigurationManagerImpl();
                return INSTANCE;
            }
            }
        return INSTANCE;
    }

    public static void resetInstance() {
        // TODO Auto-generated method stub
        INSTANCE = null;
    }

    @Override
    public String getConfiguration(String key) {
        // TODO Auto-generated method stub
        if(key != null)
            return properties.getProperty(key);
        throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        // TODO Auto-generated method stub
        if(key != null && type != null) {
            String value = properties.getProperty(key);
            if(value != null)
                return convert(value, type);
        }
        return  null;
    }

    @Override
    public void setConfiguration(String key, String value) {
        // TODO Auto-generated method stub
        if(key != null && value != null)
            properties.setProperty(key, value);
//        throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        // TODO Auto-generated method stub
        if(key != null && value != null)
            properties.setProperty(key, (String) value);
        else removeConfiguration(key);
//        throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
    }

    @Override
    public void removeConfiguration(String key) {
        // TODO Auto-generated method stub
        if(key != null)
            properties.remove(key);
//        throw new UnsupportedOperationException("Unimplemented method 'removeConfiguration'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        properties.clear();
//        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

}