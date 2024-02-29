public class TiposDeDados{

    public static void main(String [] args){
         byte n1;
         short n2;
         int n3;
         long n4;

         // Atribuição dos inteiros
         //Obs: Por padrão, um valor numerico "inteiro"atribuido no codigo sera sempre
         // "int" quando ultrapassa a capacidade do tipo

          n1 = 100; //Ok, o tipo byte pode alocar o valor 100< pois o maximo é 127
          //n1 = 128 erro: o tipo byte nao suporta o valor 128, logo 128 é int
          n2 = 2654;
          n3 = 25469; // caso ultrapassa a capacidade do inteiro o numero assumira o tipo long
          n4 = 451811;

          //declaração e atribução de valores reais

          float nota1 = 6.54f; //no final do numero adicionar a letra"f" indicando que aquele numero é float
          double salario = 5698.65;

          //por padrao, um valo0r real atribuido a uma variavel assumira o tipo "double"
          

          //declaração e atribução de valor de caracter
          //permitido apenas caracter utilize aspas simples
        char letra = 'B';

        //delcaração e atribuido de valor logico(booleano)

        boolean solteiro = false;
        boolean comFome = true;
        
         // para cadeias (texto) utilizamos a classe String. String não é um tipo primitivo de dados

         String escola = "ITB Brasilios Flores Azevedo";

        
             }
}