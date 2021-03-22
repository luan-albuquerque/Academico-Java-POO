package App.Model.Dao;
import java.util.Scanner;
import App.Model.Bean.ClienteFisico;

public class ClienteFisicoDao {
    
Integer contL=1;

String [][] Mfis = new String[20][20];


public void TabelaClienteFis(String nome,String sn,String E,String t,String rg, String cpf,String sx,String nas){          

    Mfis[0][0] = "ID";
    Mfis[0][1] = "Nome";
    Mfis[0][2] = "Sobrenome";
    Mfis[0][3] = "E-mail "; 
    Mfis[0][4] = "Telefone";
    Mfis[0][5] = "RG";
    Mfis[0][6] = "CPF";
    Mfis[0][7] = "Sexo";
    Mfis[0][8] = "Nascimento";

    Integer contC=0;
    Mfis[contL][contC] = String.valueOf(contL); //COLUNA 0
    contC++; 
    Mfis[contL][contC] =  nome;//COLUNA 1
    contC++; 
    Mfis[contL][contC] =  sn;//COLUNA 2
    contC++;
    Mfis[contL][contC] =  E;//COLUNA 3
    contC++;
    Mfis[contL][contC] =  t;//COLUNA  4
    contC++;
    Mfis[contL][contC] =  rg;//COLUNA 5
    contC++;
    Mfis[contL][contC] =  cpf;//COLUNA 6
    contC++;
    Mfis[contL][contC] =  sx;//COLUNA 7
    contC++;
    Mfis[contL][contC] =  nas;//COLUNA 8
   
    contL++;

}

public void CadastroClienteFis(){

    ClienteFisico clif = new ClienteFisico();
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o Nome");
    clif.Nome  = sc.next();
    System.out.println("Digite o Sobrenome");
    clif.Sobrenome = sc.next();
    System.out.println("Digite o E-Mail");
    clif.Email = sc.next();
    System.out.println("Digite o Telefone");
    clif.Telefone = sc.next();
    System.out.println("Digite o N° do RG");
    clif.rg = sc.next();
    System.out.println("Digite o CPF");
    clif.cpf = sc.next();
    System.out.println("Digite o Sexo");
    clif.sexo = sc.next();
    System.out.println("Digite a data de nascimento");
    clif.dtnas = sc.next();

    this.TabelaClienteFis(clif.Nome, clif.Sobrenome, clif.Email, clif.Telefone, clif.rg, clif.cpf, clif.sexo, clif.dtnas);
}

public void ListarClientesFis(){

    for(int l=0;l <= 8;l++){

       for(int C=0;C <= 8;C++){
    System.out.printf("|"+Mfis[l][C]);
    }
    System.out.println();
    }

   
}

public String forneceDadosCliente(Integer num){
 
         return Mfis[num][1];//Nome do cliente
    

}




}