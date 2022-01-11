package contabanco;

public class Conta {
    public long numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    
    public void estadoAtual(){
        System.out.println("=============================");
        System.out.println("conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.isStatus());
    }
    

    public Conta(double saldo , boolean status) {
        this.saldo = saldo;
        this.status = status;
    }
    
    

    public long getNumConta() {
        return numConta;
    }

    public void setNumConta(long numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if ("conta corrente".equals(tipo)){
            this.setSaldo(50);
        }
        else if(tipo == "conta poupança"){
            this.setSaldo(150);
        }
    }
    
    public void fecharConta(){
        if(getSaldo()>0){
            System.out.println("Conta com Dinheiro");
        }else if(getSaldo()<0){
            System.out.println("Com em Débito");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    
    public void depositar(long x){ 
        if (this.isStatus()){
        this.setSaldo(getSaldo()+x);
        }else{
            System.out.println("É preciso abrir uma conta antes");
        }
    }
    
    public void sacar(long x){
        if (this.isStatus()){
            if (this.saldo >= x){
                this.setSaldo(getSaldo()-x);
            }else{
                System.out.println("Saldo Insuficiente!");
            } 
        }else{
            System.out.println("Você precisa abrir uma conta antes!");
        } 
    }
    
    public void pagarMensal(){
        if(this.isStatus() && this.getSaldo()>0){
        if("conta corente".equals(this.getTipo())){
            this.setSaldo(this.getSaldo()+12);            
        }else if(getTipo()== "conta poupança"){
            this.setSaldo(this.getSaldo()+20);
        }
        }
    }
    
}
