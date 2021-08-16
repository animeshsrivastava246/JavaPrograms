package OOPs;

public class SingleTonMain {
    public static void main(String[] args) {
        SingleTonAppConfig obj1 = SingleTonAppConfig.getInstance();
        SingleTonAppConfig obj2 = SingleTonAppConfig.getInstance();
        SingleTonAppConfig obj3 = SingleTonAppConfig.getInstance();
        System.out.println((obj1==obj2)+"  "+(obj2==obj3)+"  "+(obj1==obj3));
    }
}