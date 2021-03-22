package App.Model.Dao;


public class LocacaoDao {

    String Mloc [][] = new String [20][20]; 
    
    Integer contL=1;
    Double ValorT;

    public void TabelaLocacao(Integer idC,String C, Integer idV,String descV,Integer D,Double diaria){
        Mloc[0][0] = "ID Locação";
        Mloc[0][1] = "ID Cliente";
        Mloc[0][2] = "Cliente";
        Mloc[0][3] = "ID Veiculo";
        Mloc[0][4] = "Veiculo";
        Mloc[0][5] = "Dias";
        Mloc[0][6]= "Valor Total";
        
        Integer contC=0;
        Mloc[contL][contC] = String.valueOf(contL); //COLUNA 0
        contC++; 
        Mloc[contL][contC] = String.valueOf(idC); //COLUNA 1
        contC++; 
        Mloc[contL][contC] = C; //COLUNA 2
        contC++; 
        Mloc[contL][contC] = String.valueOf(idV); //COLUNA 3
        contC++; 
        Mloc[contL][contC] = descV; //COLUNA 4
        contC++; 
        Mloc[contL][contC] = String.valueOf(D); //COLUNA 5
        contC++;
        ValorT = D * diaria; // CALCULO DE TOTAL DE DIARIAS
        Mloc[contL][contC] = String.valueOf(ValorT); //COLUNA 6
        
         
        contL++;
    }

    public void ListarLocacao(){
             
        for(int l=0;l <= 7;l++){

            for(int C=0;C <= 6;C++){
         System.out.printf("|"+Mloc[l][C]);
         }
         System.out.println();
         }
       
  

    }



    
}
