package App.Model.Dao;

import java.util.Scanner;


import App.Model.Bean.ClienteJuridico;

public class ClienteJuridicoDao {
Integer contL=1;
String [][] Mjur = new String[20][20];    

public void TabelaClienteJur(String nome,String sn,String E,String t,String nf, String rs,String cj){          
    Mjur[0][0] = "ID";
    Mjur[0][1] = "Nome";
    Mjur[0][2] = "Sobrenome";
    Mjur[0][3] = "E-mail "; 
    Mjur[0][4] = "Telefone";
    Mjur[0][5] = "Nome Fantasia";
    Mjur[0][6] = "Razão Social";
    Mjur[0][7] = "CNPJ";     

   // Mjur [Linhas] e [Colunas]
  Integer contC=0;
  Mjur[contL][contC] = String.valueOf(contL); //COLUNA 0
  contC++; 
  Mjur[contL][contC] =  nome;//COLUNA 1
  contC++; 
  Mjur[contL][contC] =  sn;//COLUNA 2
  contC++;
  Mjur[contL][contC] =  E;//COLUNA 3
  contC++;
  Mjur[contL][contC] =  t;//COLUNA  4
  contC++;
  Mjur[contL][contC] =  nf;//COLUNA 5
  contC++;
  Mjur[contL][contC] =  rs;//COLUNA 6
  contC++;
  Mjur[contL][contC] =  cj;//COLUNA 7

  contL++;
    
} 

       
   public void CadastroClienteJur(){
    ClienteJuridico clij = new ClienteJuridico();
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o Nome");
    clij.Nome = sc.next();
    System.out.println("Digite o Sobrenome");
    clij.Sobrenome = sc.next();
    System.out.println("Digite o E-Mail");
    clij.Email = sc.next();
    System.out.println("Digite o Telefone");
    clij.Telefone = sc.next();
    System.out.println("Digite o Nome Fantasia");
    clij.Nomefantasia = sc.next();
    System.out.println("Digite a Razão Social");
    clij.Razaosocial = sc.next();
    System.out.println("Digite o CNPJ");
    clij.Cnpj = sc.next();

    this.TabelaClienteJur(clij.Nome, clij.Sobrenome, clij.Email, clij.Telefone, clij.Nomefantasia, clij.Razaosocial, clij.Cnpj); 
    System.out.println("Cadastrado com sucesso");
    
   }


public void ListarClientesJur(){

    for(int l=0;l <= 7;l++){

       for(int C=0;C <= 7;C++){
    System.out.printf("|"+Mjur[l][C]);
    }
    System.out.println();
    }

   
}

public String forneceDadosClienteJur(Integer num){
 
   return Mjur[num][6];//razao social


}

}

