package App.Views;

import java.util.Scanner;

import App.Model.Dao.ClienteFisicoDao;
import App.Model.Dao.ClienteJuridicoDao;
import App.Model.Dao.LocacaoDao;
import App.Model.Dao.VeiculoDao;


public class Index{

    public static void main(String[] args) {
    Integer dias,idV,id,op=1;
    Double diaria;
    String C,descV;
    Scanner sc = new Scanner(System.in);
    
    //Instâncias
    VeiculoDao vdao = new VeiculoDao();
    ClienteJuridicoDao cjdao = new ClienteJuridicoDao();
    ClienteFisicoDao  cfdao = new ClienteFisicoDao();
    LocacaoDao ldao = new LocacaoDao();

    while(op != 0){
    
    System.out.println("Bem Vindo ao Sistema de Locadora de Veiculos");
    System.out.println("Digite :");
    System.out.println("1 - Cadastrar Cliente");
    System.out.println("2 - Listar Clientes");
    System.out.println("3 - Cadastrar Veiculo");
    System.out.println("4 - Listar Veiculos");
    System.out.println("5 - Locação");
    System.out.println("6 - Listar Locação");
    System.out.println("0 - Parar Encerrar o Sistema");
    op = sc.nextInt();
      
     switch(op) {

       case 0:
       System.exit(0); //FIM DO SISTEMA

       break;
         case 1: //CASE DE CADASTRO
        
         System.out.println("Qual tipo de Cliente voce deseja cadastrar?");
        System.out.println("1 - Cliente Juridico");
        System.out.println("2 - Cliente Fisico");
        if(sc.nextInt() == 1 ){
          cjdao.CadastroClienteJur(); 
          System.out.println("Cliente Juridico Cadastrado");
        }else {
          cfdao.CadastroClienteFis(); 
          System.out.println("Cliente Fisico Cadastrado");  
        }
         break;//BREAK CASE 1
         
         case 2:// CASE DE LISTAGEM
         System.out.println("Qual tipo de Cliente voce deseja Listar?");
         System.out.println("1 - Clientes Juridicos");
         System.out.println("2 - Clientes Fisicos");
         if(sc.nextInt() == 1 ){
          System.out.println("Lista de Clientes Juridicos Cadastrados");
          cjdao.ListarClientesJur(); 
         }else {
           System.out.println("Lista de Clientes Fisicos Cadastrado");  
           cfdao.ListarClientesFis();
          }
         break; //BREAK DE CASE 2
        
         case 3:// CASE DE CADASTRO DE VEICULOS
          vdao.CadastroVeiculo();
          System.out.println("Veiculo cadastrado Cadastrado");  
         break;//BREAK CASE 3
         
         case 4: // CASE DE LISTAGEM DE VEICULOS
         System.out.println("Lista de Veiculos Cadastrado");  
           vdao.ListarVeiculo();
         break; // BREAK DE CASE 4
         
         case 5://CADASTRADO DE LOCACAO
           
         System.out.println("Selecione um tipo de Cliente");
         System.out.println("1 - Clientes Juridicos");
         System.out.println("2 - Clientes Fisicos");
         if(sc.nextInt() == 1 ){
          cjdao.ListarClientesJur(); 
          id=sc.nextInt();
          C = cjdao.forneceDadosClienteJur(id);
          }else {
            cfdao.ListarClientesFis();
           System.out.println("Digite o ID do Cliente Fisico");  
           id = sc.nextInt();
          C = cfdao.forneceDadosCliente(id);
          }
            // PEGA A PROXIMA LINHA CLIENTE FISICO OU JURIDICO
           
         
           //EXIBE A LISTA DO CARRO 
           vdao.ListarVeiculo();
           System.out.println("Digite o ID do Veiculo");  
           idV=sc.nextInt();//PEGA A PROXIMA LINHA
           descV = vdao.forneceDescVei(idV);
           diaria = vdao.fornecDiariaVei(idV);  

           System.out.println("Digite a Quantidade de Dias");
           dias=sc.nextInt();

           ldao.TabelaLocacao(id,C,idV,descV, dias, diaria);
          

         break;//BREAK LOCACAO
           
         case 6:
           
            ldao.ListarLocacao();
         break;
                
     }//fim do switch

    }//fim do while

    
   
  

}

}