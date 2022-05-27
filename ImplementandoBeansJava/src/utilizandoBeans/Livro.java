package utilizandoBeans;

import java.sql.SQLOutput;

public class Livro {
    private String nome;
    private String codigo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;

    }

    public  void exibir(){
        System.out.println(this. nome + " - " + this.codigo);
    }

}
