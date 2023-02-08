import java.util.ArrayList;

public class Psicologo extends Usuario{
    String crp;
    ArrayList<String> pacientes = new ArrayList<String>();

    public Psicologo(String id, String name, String password, String cpf, String crp){
        super(id, name, password, cpf);
        this.crp = crp;
    }
}
