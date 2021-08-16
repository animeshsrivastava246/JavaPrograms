public class Strings {
    public static void main(String[] args) {{
            //String pool area is a subset of Heap area
            String a = new String("Animesh");//Heap area & String pool area
            String b = "Anni";//String pool area
            String c = "Anni";//String pool area
            String d = "Animesh";//String pool area
            String e = new String("Animesh");//Heap area & String pool area
            System.out.println(a+"   "+b+"   "+c+"   "+d+"   "+e);
            System.out.println(a==d);
            System.out.println(a==e);
            System.out.println(b==c);
            System.out.println(a.equals(d));
            System.out.println(a.equals(e));
        }
        {
            String t="",x="Annu",s="Animesh";//Garbage Value
            s="Anni   ";
            System.out.println(s.charAt(3));
            System.out.println(s.indexOf('n'));
            System.out.println(s.lastIndexOf('n'));
            System.out.println(s.substring(0, 2));
            System.out.println(s.substring(1));
            System.out.println(s.length());
            System.out.println(s.trim().length());
            System.out.println(s.contains("nn"));
            System.out.println(s.replaceAll("n", "k"));
            System.out.println(s.replaceAll("nn", "k"));
            System.out.println(t.isEmpty());
            System.out.println(x.concat(s));
            System.out.println("abc".concat(s));
            System.out.println("abc".concat("def"));
            System.out.println(x.concat("def"));
            System.out.println(x+s);
            System.out.println(x.toLowerCase());
            System.out.println(x.toUpperCase());
        }
        {
            String s="Animesh is a good    boy . He is     also very kind , honest and nice person . ";
            String sp[]=s.split("[ .,?]+");
            System.out.println(sp.length);
            for(String item:sp)
                System.out.print(item+" ");
            System.out.println("\n");
            char ch[]=sp[0].toCharArray();
            for(char item:ch)
                System.out.print(item+" ");
        }
    }
}