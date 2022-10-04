package fundamentos.powerclasses;

public class Contains {
    static void metodoContains(){
        /** O metódo contains analisa se existe o texto passado como parametro
         * em uma determinada variável do tipo String retorna um valor boolean
         * verdadeiro ou falso*/

        String nome = "gleyson sampaio";
        String palavra = "sampaio";
        Boolean resposta = nome.contains(palavra);//ver aplicabilidade de usar classes Wrappers (toString)

        System.out.println("O nome ".concat(nome).concat(" contains a plavara ")
                .concat(palavra).concat("?\nResposta:").concat( resposta.toString() ));

    }
}
