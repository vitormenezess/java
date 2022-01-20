package exemplopoo;
    public class Caneta {
        public String modelo;
        public String cor;
        private float ponta;
        protected int carga;
        protected boolean tampada;
        public void status(){
            System.out.println("Uma caneta "+this.cor);
            System.out.println("Qual o modelo? "+this.modelo);
            System.out.println("Ponta" +this.ponta);
            System.out.println("Carga: "+this.carga);
            System.out.println("Esta tampada? "+this.tampada);
        }
        
         public void rabiscar(){
            if(tampada){
                System.out.println("Erro! Não posso rabiscar");
            }else{
                System.out.println("Estou rabiscando!");
            }
            
        }
        protected void tampar(){
            this.tampada = true;
            
        }
        void destampar(){
            this.tampada = false;
            
        }
    
}
