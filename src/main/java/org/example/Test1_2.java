package org.example;

public class Test1_2 {
    public static void main(String[] args){
        Tool tool = new Tool();
        tool.BalanceTriangle(3);
        tool.BalanceTriangle(5);
        tool.BalanceTriangle(8);

    }


}

class Tool{
    public void BalanceTriangle(int height)
    {
        for(int i = 0; i < height; i++){
            for(int j = 0; j < height *2; j++)
            {
                if(j >= height -1 -i && j <= height -1 +i)
                    System.out.print ("*");
                else
                    System.out.print (" ");
            }
            System.out.println();
        }
    }
}
