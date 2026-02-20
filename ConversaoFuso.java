import java.time.ZonedDateTime; // Corrected spelling
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

class conversao {
    public static void main(String[] args) {
        // Corrected class names: ZonedDateTime
        ZonedDateTime horarioSistema = ZonedDateTime.now();
        ZonedDateTime horarioSydney = horarioSistema.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        // Corrected Pattern method: .ofPattern()
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Horário atual no sistema: " + horarioSistema.format(formatter));
        System.out.println("Horário atual em Sydney: " + horarioSydney.format(formatter));
    }
}