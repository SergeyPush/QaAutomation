public class MainClass {


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

        System.out.println(hw.split(" "));




    }

}
