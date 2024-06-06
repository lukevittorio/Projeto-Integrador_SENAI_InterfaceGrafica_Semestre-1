package lk.projetointegrador;
public class Dep {
    private String nome;
    private int serv, func;
    
    public Dep(){
        // default
    }
    
    public Dep(String n, int s, int f){
        this.nome = n;
        this.serv = s;
        this.func = f;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getServ() {
        return serv;
    }

    public void setServ(int serv) {
        this.serv = serv;
    }

    public int getFunc() {
        return func;
    }

    public void setFunc(int func) {
        this.func = func;
    }

    public String status(){
        return "Departamento Cadastrado\nNome do Departamento: "+this.nome+"\nCód. Serviço: "+this.serv+"\nCód. Funcionário: "+this.func;
    }
}