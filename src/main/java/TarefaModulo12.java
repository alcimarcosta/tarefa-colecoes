import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TarefaModulo12 {

    /**
     * 1 - Ler do console nomes de pessoas separados por vírgula, depois armazenar em ordem
     * alfabética e imprimir no console. "split"
     *
     * 2 - Ler do console nome - sexo (Alcimar - M), separar por grupos por gêneros, imprimir no console
     * com grupos separados os arrays.
     */

    public static void main(String[] args) {
        Set<String> homens = new TreeSet<>();
        Set<String> mulheres = new TreeSet<>();
        Set<String> nomes = new TreeSet<>();

         /*
                 Fase 2 do exercício
         */
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes de pessoas separados por ',' sem espaço");
        String nomesDigitadosPeloUsuario = s.next();
        String[] listaNomes = nomesDigitadosPeloUsuario.split(",");

        for(int i = 0; i < listaNomes.length; i++){
            nomes.add(listaNomes[i]);
        }

        for(String nome : nomes){
            System.out.println(nome);
        }
        /*
                Fase 2 do exercício
         */
        System.out.println("Digite os nomes das pessoas e o sexo separando o nome do sexo por um -, e  " +
                "cada pessoa separada por ',' sem espaço");
        System.out.println("Veja o exemmplo: Alcimar-M,Mirella-F");

        String nomesESexodasDasPessoasDigitadosPeloUsuario = s.next();
        String[] listPessoas = nomesESexodasDasPessoasDigitadosPeloUsuario.split(",");

        for(int i = 0; i < listPessoas.length; i++){
            var pessoa = listPessoas[i];
            var sexo = pessoa.split("-")[pessoa.split("-").length -1];
            if(sexo.toUpperCase().equals("M")){
                homens.add(pessoa);
            } else {
                mulheres.add(pessoa);
            }

            System.out.println("Lista dos Homens");
            for(String homem: homens){
                System.out.println(homem.toUpperCase());
            }
            System.out.println("############################");

            System.out.println("Lista das Mulheres");
            for(String mulher: mulheres){
                System.out.println(mulher.toUpperCase());
            }
        }

    }
}
