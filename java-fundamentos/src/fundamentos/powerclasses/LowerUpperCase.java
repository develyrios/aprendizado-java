package fundamentos.powerclasses;

public class LowerUpperCase {
    static void metodoLowerUpperCase(){
        /** métodos que tornam as palavras  minusculas respectivamente*/

        String nome = "GLEYSON SAMPAIO";
        String nomeMinusculo = nome.toLowerCase();
        System.out.println(nomeMinusculo);

        String deNovoMaiusculo = nomeMinusculo.toUpperCase();
        System.out.println(deNovoMaiusculo);
    }
}
