## Classe String em Java

A classe `String` em Java é fundamental para manipulação de texto. Ela representa uma sequência imutável de caracteres Unicode. Isso significa que, uma vez criada, uma instância de `String` não pode ser modificada.

### Principais Métodos da Classe String

- **`length()`**: Retorna o comprimento da string.
  
- **`charAt(int index)`**: Retorna o caractere no índice especificado.
  
- **`substring(int beginIndex)`** e **`substring(int beginIndex, int endIndex)`**: Retorna uma substring com base nos índices especificados.

- **`concat(String str)`**: Concatena a string especificada ao final da string atual.

- **`indexOf(String str)`** e **`lastIndexOf(String str)`**: Retorna a posição da primeira ou última ocorrência da string especificada.

- **`startsWith(String prefix)`** e **`endsWith(String suffix)`**: Verifica se a string começa ou termina com a string especificada.

- **`toLowerCase()`** e **`toUpperCase()`**: Converte todos os caracteres da string para minúsculas ou maiúsculas.

- **`trim()`**: Remove espaços em branco do início e do fim da string.

- **`replace(char oldChar, char newChar)`** e **`replace(CharSequence target, CharSequence replacement)`**: Substitui caracteres ou sequências de caracteres na string.

- **`split(String regex)`**: Divide a string em substrings usando o regex especificado.

### Exemplo de Uso

```java
  String str = "Exemplo de texto";
  System.out.println("Comprimento da string: " + str.length());
  System.out.println("Caractere no índice 5: " + str.charAt(5));
  System.out.println("Substring entre índices 0 e 7: " + str.substring(0, 7));
  System.out.println("Concatenando com outra string: " + str.concat(" adicionado"));
  System.out.println("Primeira ocorrência de 'de': " + str.indexOf("de"));
  System.out.println("Texto em minúsculas: " + str.toLowerCase());
  System.out.println("Texto em maiúsculas: " + str.toUpperCase());
  System.out.println("Substituindo 'texto' por 'string': " + str.replace("texto", "string"));
```
