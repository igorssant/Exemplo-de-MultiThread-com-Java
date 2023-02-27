import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MexendoComHora{
	public static LocalDate pegarDataDeHoje(){
		return LocalDate.now();
	}
	
	public static LocalDate dataAnoNovo(){
		return LocalDate.of(2024, Month.JANUARY, 1);
	}
	
	public static void main(String[] args){
		LocalDate hoje = pegarDataDeHoje(),
			anoNovo = dataAnoNovo();
		Month mes = anoNovo.getMonth();
		Period ateAnoNovo = Period.between(hoje, anoNovo);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyy"),
			formatadorDeHoras = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
		LocalDateTime agora = LocalDateTime.now();
		int ano = anoNovo.getYear(), 
			dia = anoNovo.getDayOfMonth();
		
		System.out.println(hoje + "\n" + anoNovo);
		System.out.println(dia + " / " + mes + " / " + ano);
		System.out.println("Até ano novo: " + ateAnoNovo + "\nTraduzindo: faltam " + ateAnoNovo.getMonths() + " meses e " + ateAnoNovo.getDays() + " dias até o ano novo!!!");
		System.out.println(hoje.format(formatador));
		System.out.println(agora.format(formatadorDeHoras));
		System.out.println("Hora da faculdade: " + LocalTime.of(7, 30));
	}
}
