import java.util.regex.Matcher;
import java.util.regex.Pattern;

class regex {
    public static void main(String[] args) {
        String texto = "Meu e-mail é josehocett841@gmail.com";
        Pattern pattern = Pattern.compile("\\w+@\\w+.\\w+");
        Matcher matcher = pattern.matcher(texto);

        if (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}