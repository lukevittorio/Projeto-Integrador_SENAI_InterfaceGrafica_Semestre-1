package lk.projetointegrador;
public class Comp {
    private int conta, fornec;
    private String descri, valores;
    
    public Comp(){
        // default
    }
    
    public Comp(int c, int f, String d, String v){
        this.conta = c;
        this.fornec = f;
        this.descri = d;
        this.valores = v;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getFornec() {
        return fornec;
    }

    public void setFornec(int fornec) {
        this.fornec = fornec;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public String getValores() {
        return valores;
    }

    public void setValores(String valores) {
        this.valores = valores;
    }
    
    public String status(){
        return "Compra Cadastrada\nCód. Conta: "+this.conta+"\nCód. Fornecedor: "+this.fornec+"\nDescrição: "+this.descri+"\nValor: "+this.valores;
    }
}