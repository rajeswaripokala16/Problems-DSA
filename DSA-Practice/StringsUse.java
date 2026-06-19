public class StringsUse {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str.charAt(0));
        System.out.println(str.length());
        System.out.println(str.substring(1));
        System.out.println(str.substring(1, 4));
        System.out.println(str.contains("el"));
        System.out.println(str.indexOf("ll"));
        System.out.println(str.indexOf("lo"));
        System.out.println(str.indexOf("z"));
        System.out.println(str.equals("Hello"));
        System.out.println(str.equalsIgnoreCase("Hello"));
        String s = "hello";
        String t = "hello";
        System.out.println(s == t);
    }
}
