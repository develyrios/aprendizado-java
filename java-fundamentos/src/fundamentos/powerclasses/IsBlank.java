package fundamentos.powerclasses;

public class IsBlank {
    static void metodoIsBlank(){
        /** Retorna true se a string estiver vazia ou contiver apenas
         codepoints de espaço em branco, caso contrário, false.
         * método disponível desde versão 11
         * */

        String palavra= "";

        //antes do java 11
        boolean vazia = palavra.trim().length() == 0;
        System.out.println("A palavra está vazia? " + vazia);

        //com do java 11
        //vazia = palavra.isBlank();
        System.out.println("A palavra está vazia? " + vazia);


        //vamos ver a diferença entre isBlank versus isEmpty
        //https://howtodoinjava.com/java11/check-blank-string/#:~:text=isBlank()%20vs%20isEmpty(),not%20check%20the%20string%20length.

    }
}
