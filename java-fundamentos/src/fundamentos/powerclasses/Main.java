package fundamentos.powerclasses;

public class Main {
    public static void main(String[] args) {
        /**
         * A classe String é utilizada para respresentar conteudos alfanumericos, exemplo:
         * JOSE, maria, NIJ-3323, 123@master
         *
         * Link documentação oficial oracle versão 18
         * https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/String.html
         */
        Concat.metodoConcat();
        Contains.metodoContains();
        IsBlank.metodoIsBlank();
        LowerUpperCase.metodoLowerUpperCase();

        //dinamica do emissor de cheque valor extenso
        //Exibir o valor cheque por extenso em 50 caracteres completados por *
        //Exemplo: Um mil e duzentos reais ***************** -
    }
}
