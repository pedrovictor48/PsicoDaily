import java.util.ArrayList;

public class Psicologo extends Usuario{
    int crp;
    ArrayList<Integer> pacientes = new ArrayList<Integer>();

    public Psicologo(int id, String name, String password, int cpf, int crp){
        super(id, name, password, cpf);
        this.crp = crp;
    }
}
