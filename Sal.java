package lk.projetointegrador;
public class Sal {
    private int codcont, codfunc;
    private String valores;
    
    public Sal(){
        // default
    }
    
    public Sal(int cc, int cn, String v){
        this.codcont = cc;
        this.codfunc = cn;
        this.valores = v;
    }

    public int getCodcont() {
        return codcont;
    }

    public void setCodcont(int codcont) {
        this.codcont = codcont;
    }

    public int getCodfunc() {
        return codfunc;
    }

    public void setCodfunc(int codfunc) {
        this.codfunc = codfunc;
    }

    public String getValores() {
        return valores;
    }

    public void setValores(String valores) {
        this.valores = valores;
    }
    
    public String status(){
        return "Salário Cadastrado\nCód. Conta: "+this.codcont+"\nCód. Funcionário: "+this.codfunc+"\nValor: "+this.valores;
    }
}