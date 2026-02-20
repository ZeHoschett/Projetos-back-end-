import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class FusoHorario {
    public static void main(String[] args) {
        // Correção de "Asis" para "Asia"
        ZonedDateTime horarioTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horarioFormatado = horarioTokyo.format(formatter);

        System.out.println("Horário atual em Tóquio: " + horarioFormatado);
    }
}