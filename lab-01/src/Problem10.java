public class Problem10 {
    public static void main(String[] args) {
        double p = 312032486;
        double sec = 31536000;
        System.out.println(Math.round(p+sec/7.0-sec/13.0+sec/45.0));
        System.out.println(Math.round(p+2*sec/7.0-2*sec/13.0+2*sec/45.0));
        System.out.println(Math.round(p+3*sec/7.0-3*sec/13.0+3*sec/45.0));
        System.out.println(Math.round(p+4*sec/7.0-4*sec/13.0+4*sec/45.0));
        System.out.println(Math.round(p+5*sec/7.0-5*sec/13.0+5*sec/45.0));

    }
}
