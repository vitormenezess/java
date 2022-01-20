package metodos;

public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampa;
    
    //Metodo construtor

    public Caneta(String modelo, float ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        tampar();
    }


    

    

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampa() {
        return tampa;
    }

    public void setTampa(boolean tampa) {
        this.tampa = tampa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    public void status(){
        System.out.println("Modelo:"+this.modelo);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Cor: "+this.getCor());
        System.out.println("Tampada: "+this.isTampa());
    }
    
    public void tampar(){
        this.tampa = true;
    }
    
    public void destampar(){
        tampa = false;
    }
        
}
