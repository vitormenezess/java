package exemplopoo;
    public class Caneta {
        String modelo;
        String cor;
        float ponta;
        int carga;
        boolean tampada;
        void status(){
            System.out.println("Uma caneta "+this.cor);
            System.out.println("Qual o modelo? "+this.modelo);
            System.out.println("Ponta" +this.ponta);
            System.out.println("Carga: "+this.carga);
            System.out.println("Esta tampada? "+this.tampada);
        }
        
        void rabiscar(){
            if(tampada){
                System.out.println("Erro! Não posso rabiscar");
            }else{
                System.out.println("Estou rabiscando!");
            }
            
        }
        void tampar(){
            this.tampada = true;
            
        }
        void destampar(){
            this.tampada = false;
            
        }
    
}
