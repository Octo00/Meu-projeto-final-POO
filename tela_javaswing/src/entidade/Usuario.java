package entidade;

public class Usuario {

    private String nome;
    private String cpf;
    private String idade;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void imprimeAtributos() {
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(cpf);

    }

}
