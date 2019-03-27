/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication32;
import java.util.Scanner;
/**
 *
 * @author ovais
 */
public class JavaApplication32 {

 public static void print(String[][] f)
  {
    for (int i =0;i<f.length;i++)
    {
      for (int j=0;j<f[i].length;j++)
      {
        System.out.print(f[i][j]);
          System.out.print(" ");
      }
      System.out.println();
    }
  }
  
  public static void Red(String[][] f)
  {
    
    System.out.println("Drop Red (0–6): ");
    Scanner in = new Scanner (System.in);
    int c;
    
     c = in.nextInt();
  
    for (int i =5;i>=0;i--)
    {
      if (f[i][c] == " ")
      {
        f[i][c] = "R";
        break;
      }
      
    }
  }
  
  
  public static void Blue(String[][] f)
  {
    System.out.println("Drob Blue (0-6): ");
    Scanner in = new Scanner (System.in);
    int c = in.nextInt();
    
  
    for (int i =5;i>=0;i--)
    {
      if (f[i][c] == " ")
      {
        f[i][c] = "B";
        break;
      }
      
    }
  }
  

  
  public static String check(String[][] f)
  {
    
   
    for (int i =0;i<6;i++)
    {
     
      for (int j=0;j<3;j+=1)
      {
        if ((f[i][j+1] != " ")&& (f[i][j+2] != " ")&& (f[i][j+3] != " ") && (f[i][j+4] != " ")&& ((f[i][j] == f[i][j+1])&& (f[i][j+1] == f[i][j+2])&& (f[i][j+2] == f[i][j+3])))
         return f[i][j+1];  
      }
    }
    
    
    for (int i=0;i<7;i+=1)
    {
    
      for (int j =0;j<3;j++)
      {
            if((f[j][i] != " ") && (f[j+1][i] != " ")&& (f[j+2][i] != " ")  && (f[j+3][i] != " ")&& ((f[j][i] == f[j+1][i])&& (f[j+1][i] == f[j+2][i])&& (f[j+2][i] == f[j+3][i])))
            return f[j][i];  
      }  
    }
    
   
    for (int i=0;i<3;i++)
    {
      
    
      for (int j=0;j<4;j+=1)
      {
            if((f[i][j] != " ") && (f[i+1][j+1] != " ") && (f[i+2][j+2] != " ") && (f[i+3][j+3] != " ")&& ((f[i][j] == f[i+1][j+1])&& (f[i+1][j+1] == f[i+2][j+2])&& (f[i+2][j+2] == f[i+3][j+3])))
              return f[i][j];  
      }  
    }
    
   
    for (int i=0;i<3;i++)
    {
      for (int j=3;j<7;j+=1)
      {
            if((f[i][j] != " ")&& (f[i+1][j-1] != " ")&& (f[i+2][j-2] != " ") && (f[i+3][j-3] != " ")&& ((f[i][j] == f[i+1][j-1])&& (f[i+1][j-1] == f[i+2][j-2]) && (f[i+2][j-2] == f[i+3][j-3])))
              return f[i][j];  
      }  
    }
    
   
    return "0";
  }
  
  
  public static void main (String[] args)
  {
   
     String[][] arr = new String[7][7];
    
    
    for (int i =0;i<arr.length;i++)
    {
      
      
       for (int j =0;j<arr[i].length;j++)
      {       
        arr[i][j] = " ";      
        
        if (i==6) arr[i][j]= "-";
      } 
    }
    int count = 0;
    print(arr);
    while(count>=0)
    {
       if (count % 2 == 0) Red(arr);
       else Blue(arr);
       count++;
       print(arr);
      if (check(arr) != "0")
       {
          if (check(arr) == "R")
             System.out.println("Red wins.");
          else if (check(arr)== "B")
            System.out.println("Blue wins.");
          break;
    }
  }
}
}

