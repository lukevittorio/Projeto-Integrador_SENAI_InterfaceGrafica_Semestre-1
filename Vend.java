package lk.projetointegrador;
public class Vend {
    private int cliente, serv;
    private String descri, valores;
    
    public Vend(){
        // default
    }
    
    public Vend(int c, int s, String d, String v){
        this.cliente = c;
        this.serv = s;
        this.descri = d;
        this.valores = v;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getServ() {
        return serv;
    }

    public void setServ(int serv) {
        this.serv = serv;
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
        return "Venda Cadastrada\nCód. Cliente: "+this.cliente+"\nCód. Serviço: "+this.serv+"\nDescrição: "+this.descri+"\nValor: "+this.valores;
    }
}