package level1.lesson7.test.q16;

public class Example16 {
    public static void main(String[] args) {
        String s = "Met";
        int i = s.indexOf('D');
        System.out.println(i);
        for (i = 4; i < 9; i += 3) {
            s += " 2018"; //s = s +" 2018";
        }
        System.out.println(s);
    }

}
