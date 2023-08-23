/*
    ENUNCIADO: Uma string é considerada bonita se satisfizer as seguintes condições:
               Cada uma das 5 vogais do alfabeto inglês ('a', 'e', 'i', 'o', 'u') deve
               aparecer pelo menos uma vez nela. As letras devem estar ordenadas em
               ordem alfabética (ou seja, todos os 'a's antes dos 'e's, todos os 'e's antes dos 'i's, etc.).
               Por exemplo, as strings "aeiou" e "aaaaaaeiiiioou" são consideradas bonitas,
               mas "uaeio", "aeoiu" e "aaaeeeooo" não são bonitas.
               Dada uma string word composta por vogais do alfabeto inglês, retorne o
               comprimento da substring bonita mais longa em word.
               Se nenhuma substring desse tipo existir, retorne 0.

    LINK: https://leetcode.com/problems/longest-substring-of-all-vowels-in-order/?envType=list&envId=r8m3m61s
 */
public class LongestBeautifulSubstring
{
    public static int longestBeautifulSubstring(String word)
    {
        /*
            Passo 1: For para encontrar o tamanho da "beautiful string" ,
            criamos um for para iterar sobre todos os caracteres da string
            e encontrar o tamanho ideal. Caso a condição seja desfeita, reseta
            as variáveis de controle e continua a iterar.
         */
        int len = 1;
        int cont = 1;
        int maxLen = 0;

        for(int i = 1 ; i < word.length() ; i++)
        {
            if(word.charAt(i - 1)<=word.charAt(i))
            {
                if(word.charAt(i - 1) != word.charAt(i))
                {
                    cont++ ;
                }
                len++ ;
                if(cont == 5)
                {
                    maxLen = Math.max(maxLen , len);
                }
            }
            else
            {
                len = 1 ;
                cont = 1 ;
            }
        }


        return maxLen ;
    }

    public static void main(String[] args)
    {
        String s = "aeiaaioaaaaeiiiiouuuooaauuaeiu";
        System.out.println(longestBeautifulSubstring(s));
    }
}
