import java.util.Arrays;

public class MajorityElement
{
    public static int majorityElement(int[] nums)
    {
        /*
        Passo 1 - Descobrir o tamanho da array utilizando a propriedade length comum entre todos
        os vetores.
        Passo 2 - Ordenar o vetor. Ao ordenar o vetor, todos os valores iguais estaão posicionados
        em sequência.
        Passo 3 - A resposta estará sempre na posição n/2 pois o enunciado assume que todos os
        números majoritários ocupam metade das posições da array, logo não existe um caso em que
        a resposta não esteja na posição n/2.

        NOTA: FÁCIL

        */

        int n = nums.length; //arrays use length and strings use length()

        Arrays.sort(nums);

        return nums[n/2];

    }
}
