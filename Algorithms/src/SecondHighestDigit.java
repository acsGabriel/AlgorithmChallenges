import java.util.Arrays;

/*
    ENUNCIADO: Dada uma string alfanumérica s, retorne o segundo maior dígito
    numérico que aparece em s, ou -1 se ele não existir. Uma string alfanumérica
    é uma string composta por letras minúsculas do alfabeto inglês e dígitos.

    LINK: https://leetcode.com/problems/second-largest-digit-in-a-string/?envType=list&envId=r8m3m61s
 */
public class SecondHighestDigit
{
    public static boolean isDigit(char c)
    {
        /*
            Função para checar se um caractere é um digito ou uma letra / símbolo.
         */
        if( c >= '0' && c <= '9')
        {
            return true  ;
        }
        return false ;
    }

    public static int secondHighest(String s)
    {
        /*
            Passo 1: Contar quantos caracteres dentro da String são digitos
            e salvar esse numero.
            Passo 2: Testar se existem digitos, senão, retornar -1.
            Passo 3: Criar uma nova array para armazenar os dígitos que foram
            encontrados na string.
            Passo 4: Encontrar o maior dígito nessa nova array.
         */
        int tamanho = s.length();
        int cont = 0;

        for(int i = 0 ; i < tamanho ; i++)
        {
            if(isDigit(s.charAt(i)))
            {
                cont++;
            }
        }

        if(cont == 0)
        {
            return -1;
        }

        int a[] = new int [cont];
        int j = 0;

        for(int i = 0 ; i < tamanho ; i++)
        {
            if(isDigit(s.charAt(i)))
            {
                a[j] = s.charAt(i) - '0';
                j++;
            }
        }

        Arrays.sort(a);

        int largest = -1;
        int secondLargest = -1;

        for (int i = cont - 1; i >= 0; i--)
        {
            if (a[i] < largest)
            {
                secondLargest = a[i];
                break;
            }
            else if (a[i] > largest)
            {
                secondLargest = largest;
                largest = a[i];
            }
        }
        return secondLargest ;

    }

    public static void main(String[] args)
    {
        String s = "dfa12321afd";
        System.out.println(secondHighest(s));
    }
}
