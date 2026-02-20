import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Duration;
import java.time.Period;
import java.time.format.DateTimeFormatter;

 class Principal {
    public static void main(String[] args) {

        LocalDate dataCompra = LocalDate.now();


        LocalDate dataPrimeiraParcela = LocalDate.of(2023, 12, 1);


        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);


        if (dataPrimeiraParcela.isEqual(LocalDate.now())) {
            System.out.println("Hoje seria o dia do vencimento");
        } else {
            System.out.println("Ainda não é o dia do vencimento");
        }

        System.out.println("Data da compra: " + dataCompra);
        System.out.println("Data da primeira parcela: " + dataPrimeiraParcela);
        System.out.println("Data da segunda parcela: " + dataSegundaParcela);


        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data da compra já formatada: " + dataCompra.format(formato));


        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();

        System.out.println("Data conclusão compra formatada: " + dataConclusaoCompra.format(formato));


        ZonedDateTime dataCompraNy = dataConclusaoCompra.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Data de conclusão de compra NY: " + dataCompraNy.format(formato));


        LocalTime inicio = LocalTime.of(8, 0); // Ex: 08:00
        LocalTime fim = LocalTime.of(18, 0);   // Ex: 18:00
        Duration duracao = Duration.between(inicio, fim);
        System.out.println("Duração do expediente: " + duracao.toHours() + " Horas e " + duracao.toMinutesPart() + " Minutos.");


        LocalDate dataPagamento = LocalDate.parse("2024-01-15");
        Period periodo = Period.between(dataCompra, dataPagamento);
        System.out.println("Diferença de tempo: " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias.");
    }
}
