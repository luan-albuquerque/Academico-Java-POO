package App.Model.Dao;

import java.util.Scanner;

import App.Model.Bean.Veiculo;

public class VeiculoDao {
Integer contL=1;

Scanner sc = new Scanner(System.in);
public String [][] Mvei = new String[20][20];
Veiculo vei = new Veiculo();

public void TabelaVeiculos(String m,String mo,String ano,String cor,String dia){
    
     Mvei[0][0] = "ID";
     Mvei[0][1] = "Marca";
     Mvei[0][2] = "Modelo";
     Mvei[0][3] = "Ano"; 
     Mvei[0][4] = "Cor";
     Mvei[0][5] = "Diaria";

    Integer contC=0;
     Mvei[contL][contC] = String.valueOf(contL); //COLUNA 0
    contC++; 
     Mvei[contL][contC] = m; //COLUNA 1
    contC++; 
     Mvei[contL][contC] = mo; //COLUNA 2
    contC++; 
     Mvei[contL][contC] = ano; //COLUNA 3
    contC++; 
     Mvei[contL][contC] =cor; //COLUNA 4
    contC++; 
     Mvei[contL][contC] = dia; //COLUNA 5
 
    contL++;
}

public void CadastroVeiculo(){
  
  System.out.println("Digite a Marca do Veiculo");
  vei.marca= sc.next();
  System.out.println("Digite o Modelo do Veiculo");
  vei.modelo= sc.next();
  System.out.println("Digite o Ano do Veiculo");
  vei.ano = sc.next();
  System.out.println("Digite a Cor do Veiculo");
  vei.cor = sc.next();
  System.out.println("Digite o valor da Diaria do Veiculo");
  vei.diaria= sc.next();
  
  this.TabelaVeiculos(vei.marca,vei.modelo,vei.ano, vei.cor, vei.diaria);

}


public void ListarVeiculo(){

    for(int l=0;l <= 7;l++){

        for(int C=0;C <= 5;C++){
     System.out.printf("|"+Mvei[l][C]);
     }
     System.out.println();
     }

}
public String forneceDescVei(Integer id){
   
  return Mvei[id][1]+" "+Mvei[id][2];


}


public Double fornecDiariaVei(Integer id){
   
  return Double.parseDouble(Mvei[id][5]);


}



}
