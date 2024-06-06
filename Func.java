package lk.projetointegrador;
public class Func {
    private String nome, tel, endereco, func;
    
    public Func(){
        // default
    }
    
    public Func(String n, String cn, String r, String e){
        this.nome = n;
        this.tel = cn;
        this.func = r;
        this.endereco = e;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }
    
    public String status(){
        return "Funcionário Cadastrado\nNome: "+this.nome+"\nTelefone: "+this.tel+"\nFunção: "+this.func+"\nEndereço: "+this.endereco;
    }
}