package level1.lesson8;

public class StringBuilderExample {
    public static void main(String[] args) {
//        String eilute1 = "tekstas";
//
//        eilute1.toUpperCase();
//
//        System.out.println(eilute1);	// tekstas
//
//        StringBuilder sb = new StringBuilder("tekstas");
//        System.out.println(sb);	// tekstas
//        sb.reverse();
//
//        System.out.println(sb);	// satsket

//        StringBuilder sb = new StringBuilder("Labas vakarasva");
//        sb.append("VAKARAS");
//        System.out.println(sb);	// Labas vakarasVAKARAS
//        sb.append('Q');
//        sb.append(9);
//        sb.append(true);
//        System.out.println(sb);	// Labas vakarasVAKARASQ9true
//        sb.append('A').append('B').append('C');
//                System.out.println(sb);	// Labas vakarasVAKARASQ9trueABC

//        int ilgis = sb.length();
//        System.out.println(ilgis);

//        int va = sb.indexOf("va");

   //     int va = sb.indexOf("va", 7);
//        int va = sb.lastIndexOf("a");

//        int va = sb.lastIndexOf("a", 5);

//        String eilute = sb.toString();
//
//        System.out.println(eilute);

//        StringBuilder sb = new StringBuilder("Labas vakaras");
//        String eilute = sb.substring(6);
//        System.out.println(eilute);	// vakaras
//
//        String eilute2 = sb.substring(6, 8);
//        System.out.println(eilute2);

//        StringBuilder sb = new StringBuilder("Labas vakaras");
//        sb.delete(3, 6);
//
//        System.out.println(sb);	// Labvakaras

//        StringBuilder sb = new StringBuilder("Labas vakaras");
//        sb.deleteCharAt(3);
//
//        System.out.println(sb);

//        StringBuilder sb = new StringBuilder("Labas vakaras");
//        sb.insert(6, "rytas");
//
//        System.out.println(sb);

        StringBuilder sb = new StringBuilder("Labas vakaras");
        sb.replace(3, 6, "ai ");

        System.out.println(sb);	// Labai vakaras

    }
}
