public class Conta {

    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private String senhaConta;
    private float saldoConta;
    private boolean statusConta;
    
    public Conta(){
        
        this.setStatusConta(false);
        this.setSaldoConta(0);
        this.setDonoConta("*");
    }

    public String getSenhaConta() {
        return senhaConta;
    }

    public void setSenhaConta(String senhaConta) {
        this.senhaConta = senhaConta;
    }

    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDonoConta() {
        return donoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public boolean isStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }
    
    public void status(){
     
        System.out.println("Infos da conta:");
        System.out.println("Proprietário: " + this.donoConta);
        System.out.println("Numero e tipo: " + this.numConta + " " + this.tipoConta);
        System.out.println("Saldo: " + this.saldoConta);
        if(this.statusConta) System.out.println("Conta Aberta");
        else System.out.println("Conta Encerrada");
    }
    
    public void sacar(float valor){
     
        if(this.getSaldoConta()-valor >=0){
             
                this.setSaldoConta(this.getSaldoConta()- valor);
                System.out.println("Saque efetuado com sucesso");
            }
            
            else System.out.println("Saldo insuficiente");
    }
    
    public void depositar(float valor){
        
        this.setSaldoConta(this.getSaldoConta() + valor);
    }
}
