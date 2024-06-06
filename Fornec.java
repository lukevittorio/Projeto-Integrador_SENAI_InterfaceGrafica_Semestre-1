package lk.projetointegrador;
public class Fornec {
    private String nome, ramo, endereco, cnpj;
    
    public Fornec(){
        // default
    }
    
    public Fornec(String n, String cn, String r, String e){
        this.nome = n;
        this.cnpj = cn;
        this.endereco = e;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        return "Fornecedor Cadastrado\nNome: "+this.nome+"\nCNPJ: "+this.cnpj+"\nEndereço: "+this.endereco;
    }
}