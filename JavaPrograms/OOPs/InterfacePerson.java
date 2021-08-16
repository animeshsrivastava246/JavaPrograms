package OOPs;

public class InterfacePerson extends InterfaceEditor implements InterfaceStudent , InterfaceYoutuber{
    public static void main(String[] args) {
        InterfacePerson per = new InterfacePerson();
        per.study();
        per.EditVideo();
        per.uploadVid();
    }
    @Override//Just a type of comment
    public void study() {
        System.out.println("Person is studying!");
    }
    //@Override
    public void makeVid(){
        System.out.println("Person is making good video!");
    }
}