import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        System.out.println("Digite a nota de Física");
        int fisica = s.nextInt();

        System.out.println("Digite a nota de Matemática");
        int matematica = s.nextInt();

        System.out.println("Digite a nota de Química");
        int quimica = s.nextInt();

        System.out.println("Digite a nota de História");
        int historia = s.nextInt();
        

        int calculoMedia = (fisica + matematica + quimica + historia)/4;

        System.out.println("Media da Nota: " + calculoMedia);
        
        if (calculoMedia >= 7){
            System.out.println("Aluno Aprovado");
            
        } else if (calculoMedia >= 5) {
            System.out.println("Aluno de Recuperação");

        }else
            System.out.println("Aluno de Reprovado");


    }


}