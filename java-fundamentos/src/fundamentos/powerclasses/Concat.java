package fundamentos.powerclasses;

public class Concat {
    static void metodoConcat(){
        /** O metódo concat realiza a junção entre dois alfanumericos,
         * podendo ser de forma recursiva já que o retonro
         * deste método é um nova String*/

        String nome = "gleyson";
        String sobrenome = "sampaio";
        //gleyson sampaio
        String nomeCompleto = nome.concat( " ").concat(sobrenome);
        System.out.println(nomeCompleto);

    }
}
