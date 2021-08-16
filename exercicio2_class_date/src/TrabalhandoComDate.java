import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//Retornar data de nascimentop em mili segundos

public class TrabalhandoComDate {
    public static void main(String[] args) throws ParseException {
        /*Long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis); //retorna data de hoje em mili segundos

        Date novaData = new Date(currentTimeMillis);
        System.out.println(novaData);  //converte mili swgundos em data (ex: Mon Aug 16 16:41:56 BRT 2021)
*/
       SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse("25/05/2018");
        Long timeInMillis = data.getTime();
        System.out.println(timeInMillis);  //return data que informei = 698986800000

        Date objetoDate = new Date(timeInMillis);
        System.out.println(objetoDate);



    }

}
