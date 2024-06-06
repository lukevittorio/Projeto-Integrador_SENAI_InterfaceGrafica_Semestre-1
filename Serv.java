package lk.projetointegrador;
public class Serv {
    private String nome, descri;
    
    public Serv(){
        // default
    }
    
    public Serv(String n, String d){
        this.nome = n;
        this.descri = d;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }
    
    public String status(){
        return "Serviço Cadastrado\nNome do Serviço: "+this.nome+"\nDescrição: "+this.descri;
    }
}