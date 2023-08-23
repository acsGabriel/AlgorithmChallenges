/*
    ENUNCIADO: Dada uma matriz ordenada composta apenas por inteiros,
    onde cada elemento aparece exatamente duas vezes, exceto por um
    elemento que aparece exatamente uma vez, retorne o elemento único
    que aparece apenas uma vez.

    LINK: https://leetcode.com/problems/single-element-in-a-sorted-array/?envType=list&envId=r8m3m61s
 */

public class SingleNonDuplicate
{
    public static int singleNonDuplicate(int[] nums)
    {
        /*
            Passo 1: Declarar a resposta como 0
            Passo 2: Tratar das exceções de quando o arranjo tiver o tamanho 1 e 2
            Passo 3: Encontrar o valor que não seja igual ao valor anterior e retornar
                     esse valor.
        */
        int x = 0;

        if( nums.length == 1)
        {
            return nums[0];
        }
        else if( nums[0] < nums[1])
        {
            return nums[0];
        }
        else if( nums[nums.length - 1] > nums[nums.length - 2])
        {
            return nums[nums.length - 1];
        }

        for(int i = 2 ; i < nums.length - 2; i++)
        {
            if(nums[i] > nums[i - 1] && nums[i] < nums[i + 1])
            {
                x = nums[i];
            }
        }

        return x;
    }

    public static void main(String[] args)
    {
        int[] nums = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums));
    }
}
