public class Boletim{

    public static void main(String [] args){
      double  n1, n2, n3, media;
      String nome = "Victor";


        n1 = 10;
        n2 = 5;
        n3 = 1;

      media = (n1+n2+n3)/3;
      

      String mensagem;

      if (media >= 7){
        mensagem = "Aprovado";

      }
       else if(media >= 5 && media < 7){
        mensagem = "Recuperação";

       }
      else {
        mensagem = "Reprovado";

      }
      

      //escrever
      System.out.println("### meu boletim escolar ###");
         
    
      System.out.println("Nome: " +  nome  + "\nResultado: "  +  mensagem);

      System.out.printf("Media: %, .2f ", media);

    


        
             }
}
