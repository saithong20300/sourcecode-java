
public class WorkingWithString {
    private static final int EXPONENT_TWO = 2;
    public static void main(String[] args) {
        String name = "Chalermchat"; int age = 22;
        
        String result = name + " " + age;
        System.out.println(result);
        
        String result2 =String.format("%s %d", name, age);
        System.out.println(result2);
        
        StringBuffer buffer = new StringBuffer();
        buffer.append(name).append(" ").append(age);
        System.out.println(buffer.toString());
        
        StringBuilder builder  = new StringBuilder();
        builder.append(name).append(" ").append(age);
        System.out.println(builder.toString());

        System.out.println(name.concat("  Now"));
        System.out.println(name.substring(0,3));
        System.out.println(name.charAt(0));
        System.out.println(name.startsWith("C"));
        System.out.println(name.endsWith("t"));
        
    }
}



