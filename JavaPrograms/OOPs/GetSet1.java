package OOPs;

public class GetSet1 {
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age>=18)
            System.out.println("You can't be our student!");
        else
            this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
