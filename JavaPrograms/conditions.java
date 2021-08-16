public class conditions {
    public static void main(String args[]) {
        int age = 174;
        if(age>=18)
            System.out.println("You are elligible");
        else if(16<=age && age<18)
            System.out.println("You are not elligible to vote");
        else
            System.out.println("You are minor");
        String name = ("NAME".equalsIgnoreCase("namea"))?"Animesh":"None";//ternary operator
        System.out.println(name);
    }
}
