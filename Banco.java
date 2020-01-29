
import java.util.Scanner;

public class Banco {
    
    public static Conta contas[] = new Conta[10];
    public static int count=0;
    public static int contaAtual;
    public static int aux;
    
    public static void iniciaVetor(){
         for(int i=0;i<10;i++){
            contas[i]=new Conta();
        }
    }
    
    public static void verificaUsuario(String nome, String senha, String tipo){
        
        int saldo;
        if(tipo == "Poupança")saldo = 150;
        else saldo = 50;
        
        
        for(int i=0;i<10;i++){
            if(contas[i].getDonoConta().equals(nome)){
                System.out.println("Usuario já cadastrado");
                break;
            }}
           
        for(int i=0;i<10;i++){
            if(contas[i].getDonoConta().equals("*")){
                contas[i].setDonoConta(nome);
                contas[i].setSenhaConta(senha);
                contas[i].setNumConta(i);
                contas[i].setTipoConta(tipo);
                contas[i].setStatusConta(true);
                contas[i].setSaldoConta(saldo);
                contas[i].status();
                break;
                
            }
        }        
        
    }
    
    public static void verificaEntrada(String nome, String senha){
        aux=0;
        for(int i=0;i<10;i++){
         
            if(contas[i].getDonoConta().equals(nome) &&
                    contas[i].getSenhaConta().equals(senha)){
                contaAtual=i;
                System.out.println("Usuário existe");
                aux=1;
            }
        }  
    }
    
    public static void saque(float valor){
        contas[contaAtual].sacar(valor);
        contas[contaAtual].status();
    }
    
    public static void deposito(float valor){
        contas[contaAtual].depositar(valor);
        contas[contaAtual].status();
    }
    
    public static void main(String[] args) {
        
        TelaInicio telainicio = new TelaInicio();
        TelaEntrar telaentrar = new TelaEntrar(); 
        Scanner teclado = new Scanner(System.in);
        
        int op,opConta,count=0,numConta;
        float valor;
        String nome;
        iniciaVetor();
        telainicio.setVisible(true);       
    }
    
}
