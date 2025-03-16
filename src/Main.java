public class Main {
    public static void main(String[] args) {
        String texto = "Oi, estou aprendendo manipulação de String com Java!";

        System.out.println("Tamanho da String: " + texto.length());

        // Utilização do index
        System.out.println("Posição do caractere 'a': " + texto.indexOf('a'));

        // Utilização do index a partir de uma posição usando Unicode repassa 11 converte para Unicode
        System.out.println("Posição do caractere na posição 11: " + texto.indexOf(11));
        System.out.println("Retorna a última posição do caractere 'a': " + texto.lastIndexOf('a'));
        System.out.println("Retorna a última posição do caractere 'a' a partir da posição 10: " + texto.lastIndexOf('a', 10));

        System.out.println("Verifica se o texto começa ou termina com um prefixo/sufixo: " + texto.startsWith("Oi") + " " + texto.endsWith("Java!"));
        System.out.println("Validação se a string está vazia: " + texto.isEmpty());
        System.out.println("Texto em letra maiúscula: " + texto.toUpperCase());
        System.out.println("Texto em letra minúscula: " + texto.toLowerCase());
        System.out.println("Texto com espaços removidos: " + texto.trim());
        System.out.println("Texto substituindo a palavra 'Java' por 'Python': " + texto.replace("Java", "Python"));

        String vetor[] = texto.split(" ");
        System.out.println("Texto dividido por espaços: " + vetor[7]);

        System.out.println("Texto na posição 21: " + texto.charAt(21));
        System.out.println("Uma parte do texto: " + texto.substring(0, 10));

        String nome1 = "João";
        String nome2 = "JOÃO";
        System.out.println("Comparação de Strings: " + nome1.equals(nome2));
        System.out.println("Comparação de Strings ignorando case: " + nome1.equalsIgnoreCase(nome2));

        // Retorna 0 se as strings forem iguais
        // Retorna um número negativo se a primeira string for menor que a segunda
        // Retorna um número positivo se a primeira string for maior que a segunda
        System.out.println("Comparação de Strings ignorando case: " + nome1.compareTo("João"));

        System.out.println("Texto concatenado: " + texto.concat(" E você?"));
        System.out.println("Verifica se contém a palavra 'Java': " + texto.contains("Java"));

        // Junta um array de strings em uma única string
        String[] tecnologias = {"Java", "Python", "C++"};
        System.out.println(String.join(", ", tecnologias));

    }
}