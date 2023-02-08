import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Diario {
    int id_paciente;
    String data_hora_registro;
    ArrayList<String> respostas = new ArrayList<String>();

    public Diario(int id_paciente){
        this.id_paciente = id_paciente;
    }

    public void registro(){
        LocalDateTime d = LocalDateTime.now();
        DateTimeFormatter d_format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        data_hora_registro = d.format(d_format);
        
        //perguntas e respostas

        
    }
}
