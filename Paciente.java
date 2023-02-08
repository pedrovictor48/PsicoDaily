public class Paciente extends Usuario{
    Diario diario_paciente;
    int id_psico;

    public Paciente(int id, String name, String password, int cpf, int id_psico){
        super(id, name, password, cpf);
        this.id_psico = id_psico;
        diario_paciente = new Diario(id);
    }

}