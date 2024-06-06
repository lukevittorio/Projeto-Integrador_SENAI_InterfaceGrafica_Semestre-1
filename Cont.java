package lk.projetointegrador;
public class Cont {
    private String descri, valores;
    
    public Cont(){
        // default
    }
    
    public Cont(String d, String v){
        this.descri = d;
        this.valores = v;
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
        return "Conta Cadastrada\nDescrição: "+this.descri+"\nValor: "+this.valores;
    }
}