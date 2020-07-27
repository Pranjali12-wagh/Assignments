package demo;
public class EliminateCharacters
{
   public static int duplicateElement(int[] arrNumbers, int num)
   {  
      if(num == 0 || num == 1)
      {  
         return num;  
      }  
      int[] temp = new int[num];  
      int b = 0;  
      for(int a = 0; a < num - 1; a++)
      {  
         if(arrNumbers[a] != arrNumbers[a + 1])
         {  
            temp[b++] = arrNumbers[a];  
         }  
      }  
      temp[b++] = arrNumbers[num - 1]; 
      for(int a = 0; a < b; a++)
      {  
         arrNumbers[a] = temp[a];  
      }  
      return b;  
   }
   public static void main(String[] args) 
   {
      int[] arrInput = {1, 2, 3, 3, 4, 4, 5, 6, 7, 8};  
      int len = arrInput.length;  
      len = duplicateElement(arrInput, len);  
     
      for(int a = 0; a < len; a++)
      {
         System.out.print(arrInput[a] + " ");
      }
   }
}

