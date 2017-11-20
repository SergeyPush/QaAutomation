public class StringOperations {


    public static void main(String[] args) {

        String hw = "Hello world";

        System.out.println("Hello world".charAt(4));

        System.out.println("Hello".concat(" world"));

        System.out.println("Hello world".endsWith("ld"));

        System.out.println(hw.equals("Hello world"));

        System.out.println(hw.equalsIgnoreCase("hElLo WoRlD"));

        System.out.println("Hello world".indexOf("l"));

        System.out.println("Hello world".indexOf("wor"));

        System.out.println("Hello world".lastIndexOf("l"));

        System.out.println("Hello world".lastIndexOf("lo"));

        System.out.println(hw.length());

        System.out.println("Hello world".replace("l", "X"));

        String [] split = "World wide web".split(" ");

        for (String s:split){
            System.out.println(s);
        }

        System.out.println("Hello world".startsWith("Hell"));

        System.out.println("Get substring".substring(3));

        System.out.println("Get substring".substring(2,7));

        char [] str = "Char to array".toCharArray();

        for (char h:str){
            System.out.print(h+" ");
        }
        System.out.println();


        System.out.println("TO LOWER CASE".toLowerCase());

        System.out.println("to upper case".toUpperCase());

        System.out.println("     Trim     ".trim());




    }

}
