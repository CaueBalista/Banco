
import java.util.Scanner;

public class Banco {
    
    public static Conta contas[] = new Conta[10];
    public static int count=0;
    
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
        
        for(int i=0;i<10;i++){
         
            if(contas[i].getDonoConta().equals(nome) &&
                    contas[i].getSenhaConta().equals(senha)){
            
                System.out.println("Usuário existe");
            }
        }
        
        
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
        
        
       
        
        
        do{
        System.out.println("Bem vindo ao Banco do Cauê");
        System.out.println("Oque gostaria de fazer?");
        System.out.println("0 -> Sair");
        System.out.println("1 -> Abrir conta");
        System.out.println("2 -> Encerrar Conta");
        System.out.println("3 -> Sacar");
        System.out.println("4 -> Depositar");
        System.out.println("5 ->Informações da conta");
        op=teclado.nextInt();
        teclado.nextLine();
        
        
        if(op == 1 && count < 10){
         
            System.out.println("Informe seu nome, por favor.");
            nome=teclado.nextLine();
            do{
                System.out.println("Qual tipo de conta deseja abrir?");
                System.out.println("1 -> Corrente");
                System.out.println("2 -> Poupança");
                opConta=teclado.nextInt();
            }while(opConta < 1 || opConta>2);
            
            if(opConta==1){
                
                //Conta c = new Conta();
                contas[count].setNumConta(count);
                contas[count].setTipoConta("Corrente");
                contas[count].setDonoConta(nome);
                contas[count].setStatusConta(true);
                contas[count].setSaldoConta(50);
                contas[count].status();
            }
            
            else if(opConta==2){
                
                //Conta c = new Conta();
                contas[count].setNumConta(count);
                contas[count].setTipoConta("Poupança");
                contas[count].setDonoConta(nome);
                contas[count].setStatusConta(true);
                contas[count].setSaldoConta(150);
                contas[count].status();
                
            }    
            count++;
        }
        
        else if(op==2){
            
            System.out.println("Qual conta deseja encerrar?");
            numConta= teclado.nextInt();
            if(contas[numConta].getSaldoConta() == 0){
                System.out.println("Conta Encerrada");
                contas[numConta].setStatusConta(false);
            }
            else System.out.println("Impossivel encerrar a conta");
            
        }
        
        else if(op==3){
            System.out.println("De qual conta deseja sacar?");
            numConta= teclado.nextInt();
            System.out.println("Quanto deseja sacar?");
            valor=teclado.nextFloat();
            contas[numConta].sacar(valor);
        }
        
        else if(op ==4){
            System.out.println("De qual conta deseja depositar?");
            numConta= teclado.nextInt();
            System.out.println("Quanto deseja depositar?");
            valor=teclado.nextFloat();
            contas[numConta].depositar(valor);
        }
        
        else if(op==5){
            System.out.println("De qual conta deseja ver status?");
            numConta= teclado.nextInt();
            contas[numConta].status();
        }
        
        else if(op==0) break;
        
        }while(op !=0);
        
    }
}
