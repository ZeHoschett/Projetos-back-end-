import java.time.LocalTime;
import java.time.Duration;

 class CalculoTempo {
    public static void main(String[] args) {

        LocalTime horarioInicio = LocalTime.of(14, 30, 0);
        LocalTime horarioTermino = LocalTime.of(16, 45, 0);

        Duration duracao = Duration.between(horarioInicio, horarioTermino);
        long horas = duracao.toHours();


        int minutos = duracao.toMinutesPart();
        System.out.println("Duração: " + horas + " Hora(s) e " + minutos + " Minutos.");
    }
}