package lk.projetointegrador;
public class Cli {
    private String nome, ramo, endereco, cnpj;
    
    public Cli(){
        // default
    }
    
    public Cli(String n, String cn, String r, String e){
        this.nome = n;
        this.cnpj = cn;
        this.ramo = r;
        this.endereco = e;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public String status(){
        return "Cliente Cadastrado\nNome: "+this.nome+"\nCNPJ: "+this.cnpj+"\nRamo: "+this.ramo+"\nEndereço: "+this.endereco;
    }
}