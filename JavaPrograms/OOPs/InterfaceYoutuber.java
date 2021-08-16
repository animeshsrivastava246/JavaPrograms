package OOPs;

public abstract interface InterfaceYoutuber {
    abstract void makeVid();
    default void uploadVid(){
        System.out.println("Uploading Video...");
    }
}
