package OOPs;

public class SingleTonAppConfig{
    private SingleTonAppConfig(){
    }
    private static SingleTonAppConfig ob = null;
    public static SingleTonAppConfig getInstance() {
        if(ob==null)
            ob = new SingleTonAppConfig();
        return ob;
    }
}