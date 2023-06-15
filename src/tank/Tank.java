package tank;

import java.util.Random;
import java.util.Scanner;

/**
 * Battle of tanks (game)
 * 
 * @author Amir
 * 
 */

public class Tank
{
    private static String b[][]=new String[15][15];
    private static String c[][]=new String[15][15];
    private static String d[][]=new String[15][15];
    private static String e[][]=new String[15][15];
    private static String f[][]=new String[15][15];
    private static int x1,y1,x2,y2,x3,y3,x4,y4,x5,y5;
    private static int a1,b1,a2,b2,a3,b3,a4,b4,a5,b5;
    private static int s1,s2,s3,s4,s5;
    private static int l1,l2,l3,l4,l5;
    private static int f1,f2,f3,f4,f5;
    private static int g1,g2,g3,g4,g5;
    private static int p1,q1,p2,q2;
    private static int E=0;
    private static int k1=0,k2=0,k3=0,r1=0,r2=0,r3=0;
    private static int o;
    private static int w;
    private static int u1=0,u2=0,u3=0,t3=0;
    private static Scanner input;
    private static Random random;
    
    public static void form()
    {
    for (int i=0;i<12;i++) {
        if (i==0)
            {
                System.out.println("  | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | ");
            }
        else
        {
            System.out.println("--+---+---+---+---+---+---+---+---+---+---+--");
              if (i!=11) {
            System.out.print(i-1);
           }
              else 
              {
                   System.out.print(" ");
              }
            for (int j=0;j<11;j++)    
            {
            System.out.print(b[i][j]);
            }
        System.out.println();
        }
    }
    }
    public static void form1()
    {
    for (int i=0;i<12;i++) {
        if (i==0)
            {
                System.out.println("  | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | ");
            }
        else
        {
            System.out.println("--+---+---+---+---+---+---+---+---+---+---+--");
              if (i!=11) {
            System.out.print(i-1);
           }
              else 
              {
                   System.out.print(" ");
              }
            for (int j=0;j<11;j++)    
            {
            System.out.print(d[i][j]);
            }
        System.out.println();
        }
    }
    }
    public static void form2()
    {
    for (int i=0;i<12;i++) {
        if (i==0)
            {
                System.out.println("  | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | ");
            }
        else
        {
            System.out.println("--+---+---+---+---+---+---+---+---+---+---+--");
              if (i!=11) {
            System.out.print(i-1);
           }
              else 
              {
                   System.out.print(" ");
              }
            for (int j=0;j<11;j++)    
            {
            System.out.print(e[i][j]);
            }
        System.out.println();
        }
    }
    }
    public static void form3()
    {
    for (int i=0;i<12;i++) {
        if (i==0)
            {
                System.out.println("  | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | ");
            }
        else
        {
            System.out.println("--+---+---+---+---+---+---+---+---+---+---+--");
              if (i!=11) {
            System.out.print(i-1);
           }
              else 
              {
                   System.out.print(" ");
              }
            for (int j=0;j<11;j++)    
            {
            System.out.print(f[i][j]);
            }
        System.out.println();
        }
    }
    }
    public static void MTank()
    {
       System.out.print("x1=");
       x1 = input.nextInt();
       while (x1>9 || x1<0)
       {
           System.out.println("Error!");
           System.out.print("x1=");
           x1 = input.nextInt();   
       }
       System.out.print("y1=");
       y1 = input.nextInt();
       while (y1>9 || y1<0)
       {
           System.out.println("Error!");
           System.out.print("y1=");
           y1 = input.nextInt();   
       }
       b[x1+1][y1] = " | T";
       System.out.print("Down Vertical(1)or Up Vertical(2) or Left Horizontal(3) or Right Horizontal(4)? s1=");
       s1 = input.nextInt();
       while (s1>4 || s1<1)
       {
           System.out.println("Error!");
           System.out.print("s1=");
           s1 = input.nextInt();   
       }
       System.out.print("length?(please choose one number between 2 and 5) l1=");
       l1 = input.nextInt();
       while (l1>5 || l1<2)
       {
           System.out.println("Error!");
           System.out.print("l1=");
           l1 = input.nextInt();   
       }
       while ((l1-x1>1 && s1==2) || (l1+y1>10 && s1==4) || (l1-y1>1 && s1==3) || (l1+x1>10 && s1==1))
       {
           System.out.println("Error!");
           System.out.print("s1=");
           s1 = input.nextInt();
           while (s1>4 || s1<1)
           {
           System.out.println("Error!");
           System.out.print("s1=");
           s1 = input.nextInt();   
           }
           System.out.print("l1=");
           l1 = input.nextInt();
           while (l1>5 || l1<2 )
           {
           System.out.println("Error!");
           System.out.print("l1=");
           l1 = input.nextInt();   
           }
       }
       for (int i=1;i<l1;i++)
       {
           if (s1 == 1) {
               b[x1+2][y1] = " | T";
               x1++;
           }
           if (s1 == 2) {
               b[x1][y1] = " | T";
               x1--;
           }
           if (s1 == 3) {
               b[x1+1][y1-1] = " | T";
               y1--;
           }
           if (s1 == 4) {
               b[x1+1][y1+1] = " | T";
               y1++;
           }
       }
       System.out.print("x2=");
       x2 = input.nextInt();
       while (x2>9 || x2<0)
       {
           System.out.println("Error!");
           System.out.print("x2=");
           x2 = input.nextInt();   
       }
       System.out.print("y2=");
       y2 = input.nextInt();
       while (y2>9 || y2<0)
       {
           System.out.println("Error!");
           System.out.print("y2=");
           y2 = input.nextInt();   
       }
       b[x2+1][y2] = " | T";
       System.out.print("Down Vertical(1)or Up Vertical(2) or Left Horizontal(3) or Right Horizontal(4)? s2=");
       s2 = input.nextInt();
       while (s2>4 || s2<1)
       {
           System.out.println("Error!");
           System.out.print("s2=");
           s2 = input.nextInt();   
       }
       System.out.print("length?(please choose one number between 2 and 5) l2=");
       l2 = input.nextInt();
       while (l2>5 || l2<2)
       {
           System.out.println("Error!");
           System.out.print("l2=");
           l2 = input.nextInt();   
       }
       while ((l2-x2>1 && s2==2) || (l2+y2>10 && s2==4) || (l2-y2>1 && s2==3) || (l2+x2>10 && s2==1))
       {
           System.out.println("Error!");
           System.out.print("s2=");
           s2 = input.nextInt();
           while (s2>4 || s2<1)
           {
           System.out.println("Error!");
           System.out.print("s2=");
           s2 = input.nextInt();   
           }
           System.out.print("l2=");
           l2 = input.nextInt();
           while (l2>5 || l2<2 )
           {
           System.out.println("Error!");
           System.out.print("l2=");
           l2 = input.nextInt();   
           }
       }
       for (int i=1;i<l2;i++)
       {
           if (s2 == 1) {
               b[x2+2][y2] = " | T";
               x2++;
           }
           if (s2 == 2) {
               b[x2][y2] = " | T";
               x2--;
           }
           if (s2 == 3) {
               b[x2+1][y2-1] = " | T";
               y2--;
           }
           if (s2 == 4) {
               b[x2+1][y2+1] = " | T";
               y2++;
           }
       }
       System.out.print("x3=");
       x3 = input.nextInt();
       while (x3>9 || x3<0)
       {
           System.out.println("Error!");
           System.out.print("x3=");
           x3 = input.nextInt();   
       }
       System.out.print("y3=");
       y3 = input.nextInt();
       while (y3>9 || y3<0)
       {
           System.out.println("Error!");
           System.out.print("y3=");
           y3 = input.nextInt();   
       }
       b[x3+1][y3] = " | T";
       System.out.print("Down Vertical(1)or Up Vertical(2) or Left Horizontal(3) or Right Horizontal(4)? s3=");
       s3 = input.nextInt();
       while (s3>4 || s3<1)
       {
           System.out.println("Error!");
           System.out.print("s3=");
           s3 = input.nextInt();   
       }
       System.out.print("length?(please choose one number between 2 and 5) l3=");
       l3 = input.nextInt();
       while (l3>5 || l3<2)
       {
           System.out.println("Error!");
           System.out.print("l3=");
           l3 = input.nextInt();   
       }
       while ((l3-x3>1 && s3==2) || (l3+y3>10 && s3==4) || (l3-y3>1 && s3==3) || (l3+x3>10 && s3==1))
       {
           System.out.println("Error!");
           System.out.print("s3=");
           s3 = input.nextInt();
           while (s3>4 || s3<1)
           {
           System.out.println("Error!");
           System.out.print("s3=");
           s3 = input.nextInt();   
           }
           System.out.print("l3=");
           l3 = input.nextInt();
           while (l3>5 || l3<2 )
           {
           System.out.println("Error!");
           System.out.print("l3=");
           l3 = input.nextInt();   
           }
       }
       for (int i=1;i<l3;i++)
       {
           if (s3 == 1) {
               b[x3+2][y3] = " | T";
               x3++;
           }
           if (s3 == 2) {
               b[x3][y3] = " | T";
               x3--;
           }
           if (s3 == 3) {
               b[x3+1][y3-1] = " | T";
               y3--;
           }
           if (s3 == 4) {
               b[x3+1][y3+1] = " | T";
               y3++;
           }
       }
       System.out.print("x4=");
       x4 = input.nextInt();
       while (x4>9 || x4<0)
       {
           System.out.println("Error!");
           System.out.print("x4=");
           x4 = input.nextInt();   
       }
       System.out.print("y4=");
       y4 = input.nextInt();
       while (y4>9 || y4<0)
       {
           System.out.println("Error!");
           System.out.print("y4=");
           y4 = input.nextInt();   
       }
       b[x4+1][y4] = " | T";
       System.out.print("Down Vertical(1)or Up Vertical(2) or Left Horizontal(3) or Right Horizontal(4)? s4=");
       s4 = input.nextInt();
       while (s4>4 || s4<1)
       {
           System.out.println("Error!");
           System.out.print("s4=");
           s4 = input.nextInt();   
       }
       System.out.print("length?(please choose one number between 2 and 5) l4=");
       l4 = input.nextInt();
       while (l4>5 || l4<2 )
       {
           System.out.println("Error!");
           System.out.print("l4=");
           l4 = input.nextInt();   
       }
       while ((l4-x4>1 && s4==2) || (l4+y4>10 && s4==4) || (l4-y4>1 && s4==3) || (l4+x4>10 && s4==1))
       {
           System.out.println("Error!");
           System.out.print("s4=");
           s4 = input.nextInt();
           while (s4>4 || s4<1)
           {
           System.out.println("Error!");
           System.out.print("s4=");
           s4 = input.nextInt();   
           }
           System.out.print("l4=");
           l4 = input.nextInt();
           while (l4>5 || l4<2 )
           {
           System.out.println("Error!");
           System.out.print("l4=");
           l4 = input.nextInt();   
           }
       }
       for (int i=1;i<l4;i++)
       {
           if (s4 == 1) {
               b[x4+2][y4] = " | T";
               x4++;
           }
           if (s4 == 2) {
               b[x4][y4] = " | T";
               x4--;
           }
           if (s4 == 3) {
               b[x4+1][y4-1] = " | T";
               y4--;
           }
           if (s4 == 4) {
               b[x4+1][y4+1] = " | T";
               y4++;
           }
       }
       System.out.print("x5=");
       x5 = input.nextInt();
       while (x5>9 || x5<0)
       {
           System.out.println("Error!");
           System.out.print("x5=");
           x5 = input.nextInt();   
       }
       System.out.print("y5=");
       y5 = input.nextInt();
       while (y5>9 || y5<0)
       {
           System.out.println("Error!");
           System.out.print("y5=");
           y5 = input.nextInt();   
       }
       b[x5+1][y5] = " | T";
       System.out.print("Down Vertical(1)or Up Vertical(2) or Left Horizontal(3) or Right Horizontal(4)? s5=");
       s5 = input.nextInt();
       while (s5>4 || s5<1)
       {
           System.out.println("Error!");
           System.out.print("s5=");
           s5 = input.nextInt();   
       }
       System.out.print("length?(please choose one number between 2 and 5) l5=");
       l5 = input.nextInt();
       while (l5>5 || l5<2 )
       {
           System.out.println("Error!");
           System.out.print("l5=");
           l5 = input.nextInt();   
       }
       while ((l5-x5>1 && s5==2) || (l5+y5>10 && s5==4) || (l5-y5>1 && s5==3) || (l5+x5>10 && s5==1))
       {
           System.out.println("Error!");
           System.out.print("s5=");
           s5 = input.nextInt();
           while (s5>4 || s5<1)
           {
           System.out.println("Error!");
           System.out.print("s5=");
           s5 = input.nextInt();   
           }
           System.out.print("l5=");
           l5 = input.nextInt();
           while (l5>5 || l5<2 )
           {
           System.out.println("Error!");
           System.out.print("l5=");
           l5 = input.nextInt();   
           }
       }
       for (int i=1;i<l5;i++)
       {
           if (s5 == 1) {
               b[x5+2][y5] = " | T";
               x5++;
           }
           if (s5 == 2) {
               b[x5][y5] = " | T";
               x5--;
           }
           if (s5 == 3) {
               b[x5+1][y5-1] = " | T";
               y5--;
           }
           if (s5 == 4) {
               b[x5+1][y5+1] = " | T";
               y5++;
           }
       }
       k1 = l1 + l2 + l3 + l4 + l5;
       for (int i=0;i<10;i++)
       {
           for (int j=0;j<10;j++)
           {
               if (" | T".equals(b[i][j])) k2++;
           }
       }
           if (k2 != k1) 
           {
               System.out.println("Wrong!, Try again! ");
               k2 = 0;
               for (int i=0;i<12;i++)
               {
                    for (int j=0;j<12;j++)
                    {
                        b[i][j] = " |  ";
                    }
               }
               MTank();
           }
       form();
    }
       public static void MTank2()
    {
       System.out.print("x1=");
       x1 = input.nextInt();
       while (x1>9 || x1<0)
       {
           System.out.println("Error!");
           System.out.print("x1=");
           x1 = input.nextInt();   
       }
       System.out.print("y1=");
       y1 = input.nextInt();
       while (y1>9 || y1<0)
       {
           System.out.println("Error!");
           System.out.print("y1=");
           y1 = input.nextInt();   
       }
       e[x1+1][y1] = " | T";
       System.out.print("Down Vertical(1)or Up Vertical(2) or Left Horizontal(3) or Right Horizontal(4)? s1=");
       s1 = input.nextInt();
       while (s1>4 || s1<1)
       {
           System.out.println("Error!");
           System.out.print("s1=");
           s1 = input.nextInt();   
       }
       System.out.print("length?(please choose one number between 2 and 5) l1=");
       l1 = input.nextInt();
       while (l1>5 || l1<2)
       {
           System.out.println("Error!");
           System.out.print("l1=");
           l1 = input.nextInt();   
       }
       while ((l1-x1>1 && s1==2) || (l1+y1>10 && s1==4) || (l1-y1>1 && s1==3) || (l1+x1>10 && s1==1))
       {
           System.out.println("Error!");
           System.out.print("s1=");
           s1 = input.nextInt();
           while (s1>4 || s1<1)
           {
           System.out.println("Error!");
           System.out.print("s1=");
           s1 = input.nextInt();   
           }
           System.out.print("l1=");
           l1 = input.nextInt();
           while (l1>5 || l1<2 )
           {
           System.out.println("Error!");
           System.out.print("l1=");
           l1 = input.nextInt();   
           }
       }
       for (int i=1;i<l1;i++)
       {
           if (s1 == 1) {
               e[x1+2][y1] = " | T";
               x1++;
           }
           if (s1 == 2) {
               e[x1][y1] = " | T";
               x1--;
           }
           if (s1 == 3) {
               e[x1+1][y1-1] = " | T";
               y1--;
           }
           if (s1 == 4) {
               e[x1+1][y1+1] = " | T";
               y1++;
           }
       }
       System.out.print("x2=");
       x2 = input.nextInt();
       while (x2>9 || x2<0)
       {
           System.out.println("Error!");
           System.out.print("x2=");
           x2 = input.nextInt();   
       }
       System.out.print("y2=");
       y2 = input.nextInt();
       while (y2>9 || y2<0)
       {
           System.out.println("Error!");
           System.out.print("y2=");
           y2 = input.nextInt();   
       }
       e[x2+1][y2] = " | T";
       System.out.print("Down Vertical(1)or Up Vertical(2) or Left Horizontal(3) or Right Horizontal(4)? s2=");
       s2 = input.nextInt();
       while (s2>4 || s2<1)
       {
           System.out.println("Error!");
           System.out.print("s2=");
           s2 = input.nextInt();   
       }
       System.out.print("length?(please choose one number between 2 and 5) l2=");
       l2 = input.nextInt();
       while (l2>5 || l2<2)
       {
           System.out.println("Error!");
           System.out.print("l2=");
           l2 = input.nextInt();   
       }
       while ((l2-x2>1 && s2==2) || (l2+y2>10 && s2==4) || (l2-y2>1 && s2==3) || (l2+x2>10 && s2==1))
       {
           System.out.println("Error!");
           System.out.print("s2=");
           s2 = input.nextInt();
           while (s2>4 || s2<1)
           {
           System.out.println("Error!");
           System.out.print("s2=");
           s2 = input.nextInt();   
           }
           System.out.print("l2=");
           l2 = input.nextInt();
           while (l2>5 || l2<2 )
           {
           System.out.println("Error!");
           System.out.print("l2=");
           l2 = input.nextInt();   
           }
       }
       for (int i=1;i<l2;i++)
       {
           if (s2 == 1) {
               e[x2+2][y2] = " | T";
               x2++;
           }
           if (s2 == 2) {
               e[x2][y2] = " | T";
               x2--;
           }
           if (s2 == 3) {
               e[x2+1][y2-1] = " | T";
               y2--;
           }
           if (s2 == 4) {
               e[x2+1][y2+1] = " | T";
               y2++;
           }
       }
       System.out.print("x3=");
       x3 = input.nextInt();
       while (x3>9 || x3<0)
       {
           System.out.println("Error!");
           System.out.print("x3=");
           x3 = input.nextInt();   
       }
       System.out.print("y3=");
       y3 = input.nextInt();
       while (y3>9 || y3<0)
       {
           System.out.println("Error!");
           System.out.print("y3=");
           y3 = input.nextInt();   
       }
       e[x3+1][y3] = " | T";
       System.out.print("Down Vertical(1)or Up Vertical(2) or Left Horizontal(3) or Right Horizontal(4)? s3=");
       s3 = input.nextInt();
       while (s3>4 || s3<1)
       {
           System.out.println("Error!");
           System.out.print("s3=");
           s3 = input.nextInt();   
       }
       System.out.print("length?(please choose one number between 2 and 5) l3=");
       l3 = input.nextInt();
       while (l3>5 || l3<2)
       {
           System.out.println("Error!");
           System.out.print("l3=");
           l3 = input.nextInt();   
       }
       while ((l3-x3>1 && s3==2) || (l3+y3>10 && s3==4) || (l3-y3>1 && s3==3) || (l3+x3>10 && s3==1))
       {
           System.out.println("Error!");
           System.out.print("s3=");
           s3 = input.nextInt();
           while (s3>4 || s3<1)
           {
           System.out.println("Error!");
           System.out.print("s3=");
           s3 = input.nextInt();   
           }
           System.out.print("l3=");
           l3 = input.nextInt();
           while (l3>5 || l3<2 )
           {
           System.out.println("Error!");
           System.out.print("l3=");
           l3 = input.nextInt();   
           }
       }
       for (int i=1;i<l3;i++)
       {
           if (s3 == 1) {
               e[x3+2][y3] = " | T";
               x3++;
           }
           if (s3 == 2) {
               e[x3][y3] = " | T";
               x3--;
           }
           if (s3 == 3) {
               e[x3+1][y3-1] = " | T";
               y3--;
           }
           if (s3 == 4) {
               e[x3+1][y3+1] = " | T";
               y3++;
           }
       }
       System.out.print("x4=");
       x4 = input.nextInt();
       while (x4>9 || x4<0)
       {
           System.out.println("Error!");
           System.out.print("x4=");
           x4 = input.nextInt();   
       }
       System.out.print("y4=");
       y4 = input.nextInt();
       while (y4>9 || y4<0)
       {
           System.out.println("Error!");
           System.out.print("y4=");
           y4 = input.nextInt();   
       }
       e[x4+1][y4] = " | T";
       System.out.print("Down Vertical(1)or Up Vertical(2) or Left Horizontal(3) or Right Horizontal(4)? s4=");
       s4 = input.nextInt();
       while (s4>4 || s4<1)
       {
           System.out.println("Error!");
           System.out.print("s4=");
           s4 = input.nextInt();   
       }
       System.out.print("length?(please choose one number between 2 and 5) l4=");
       l4 = input.nextInt();
       while (l4>5 || l4<2)
       {
           System.out.println("Error!");
           System.out.print("l4=");
           l4 = input.nextInt();   
       }
       while ((l4-x4>1 && s4==2) || (l4+y4>10 && s4==4) || (l4-y4>1 && s4==3) || (l4+x4>10 && s4==1))
       {
           System.out.println("Error!");
           System.out.print("s4=");
           s4 = input.nextInt();
           while (s4>4 || s4<1)
           {
           System.out.println("Error!");
           System.out.print("s4=");
           s4 = input.nextInt();   
           }
           System.out.print("l4=");
           l4 = input.nextInt();
           while (l4>5 || l4<2 )
           {
           System.out.println("Error!");
           System.out.print("l4=");
           l4 = input.nextInt();   
           }
       }
       for (int i=1;i<l4;i++)
       {
           if (s4 == 1) {
               e[x4+2][y4] = " | T";
               x4++;
           }
           if (s4 == 2) {
               b[x4][y4] = " | T";
               x4--;
           }
           if (s4 == 3) {
               e[x4+1][y4-1] = " | T";
               y4--;
           }
           if (s4 == 4) {
               e[x4+1][y4+1] = " | T";
               y4++;
           }
       }
       System.out.print("x5=");
       x5 = input.nextInt();
       while (x5>9 || x5<0)
       {
           System.out.println("Error!");
           System.out.print("x5=");
           x5 = input.nextInt();   
       }
       System.out.print("y5=");
       y5 = input.nextInt();
       while (y5>9 || y5<0)
       {
           System.out.println("Error!");
           System.out.print("y5=");
           y5 = input.nextInt();   
       }
       e[x5+1][y5] = " | T";
       System.out.print("Down Vertical(1)or Up Vertical(2) or Left Horizontal(3) or Right Horizontal(4)? s5=");
       s5 = input.nextInt();
       while (s5>4 || x1<1)
       {
           System.out.println("Error!");
           System.out.print("s5=");
           s5 = input.nextInt();   
       }
       System.out.print("length?(please choose one number between 2 and 5) l5=");
       l5 = input.nextInt();
       while (l5>5 || l5<2)
       {
           System.out.println("Error!");
           System.out.print("l5=");
           l5 = input.nextInt();   
       }
       while ((l5-x5>1 && s5==2) || (l5+y5>10 && s5==4) || (l5-y5>1 && s5==3) || (l5+x5>10 && s5==1))
       {
           System.out.println("Error!");
           System.out.print("s5=");
           s5 = input.nextInt();
           while (s5>4 || s5<1)
           {
           System.out.println("Error!");
           System.out.print("s5=");
           s5 = input.nextInt();   
           }
           System.out.print("l5=");
           l5 = input.nextInt();
           while (l5>5 || l5<2 )
           {
           System.out.println("Error!");
           System.out.print("l5=");
           l5 = input.nextInt();   
           }
       }
       for (int i=1;i<l5;i++)
       {
           if (s5 == 1) {
               e[x5+2][y5] = " | T";
               x5++;
           }
           if (s5 == 2) {
               e[x5][y5] = " | T";
               x5--;
           }
           if (s5 == 3) {
               e[x5+1][y5-1] = " | T";
               y5--;
           }
           if (s5 == 4) {
               e[x5+1][y5+1] = " | T";
               y5++;
           }
       }
       u2 = l1 + l2 + l3 + l4 + l5;
       for (int i=0;i<11;i++)
       {
           for (int j=0;j<11;j++)
           {
               if (" | T".equals(e[i][j])) u3++;
           }
       }
           if (u3 != u2) 
           {
               System.out.println("Wrong!, Try again! ");
               u3 = 0;
               for (int i=0;i<10;i++)
               {
                    for (int j=0;j<10;j++)
                    {
                        e[i][j] = " |  ";
                    }
               }
               MTank2();
           }
       form2();
    }
    public static void CTank()
    {
       o = random.nextInt(2);
       if (o == 0)
       {
       a1 = 0;
       b1 = 0;
       c[a1+1][b1] = " | T";
       f1 = 1;
       g1 = 2;
       for (int i=1;i<g1;i++)
       {
            c[a1+2][b1] = " | T";
            a1++;  
       }
       a2 = 1;
       b2 = 1;
       c[a2+1][b2] = " | T";
       f2 = 1;
       g2 = 2;
       for (int i=1;i<g2;i++)
       {
           c[a2+2][b2] = " | T";
           a2++;
       }
       a3 = 2;
       b3 = 2;
       c[a3+1][b3] = " | T";
       f3 = 1;
       g3 = 2;
       for (int i=1;i<g3;i++)
       {
           c[a3+2][b3] = " | T";
           a3++;
       }
       a4 = 3;
       b4 = 3;
       c[a4+1][b4] = " | T";
       f4 = 1;
       g4 = 2;
       for (int i=1;i<g4;i++)
       {
           c[a4+2][b4] = " | T";
           a4++;
       }
       a5 = 4;
       b5 = 4;
       c[a5+1][b5] = " | T";
       f5 = 1;
       g5 = 2;
       for (int i=1;i<g5;i++)
       {
           c[a5+2][b5] = " | T";
           a5++;
       }
       r2=10;
       }
       if (o == 1)
       {
       a1 = 4;
       b1 = 0;
       c[a1+1][b1] = " | T";
       f1 = 1;
       g1 = 4;
       for (int i=1;i<g1;i++)
       {
            c[a1+2][b1] = " | T";
            a1++;  
       }
       a2 = 0;
       b2 = 9;
       c[a2+1][b2] = " | T";
       f2 = 1;
       g2 = 3;
       for (int i=1;i<g2;i++)
       {
           c[a2+2][b2] = " | T";
           a2++;
       }
       a3 = 5;
       b3 = 5;
       c[a3+1][b3] = " | T";
       f3 = 1;
       g3 = 2;
       for (int i=1;i<g3;i++)
       {
           c[a3+2][b3] = " | T";
           a3++;
       }
       a4 = 3;
       b4 = 3;
       c[a4+1][b4] = " | T";
       f4 = 1;
       g4 = 2;
       for (int i=1;i<g4;i++)
       {
           c[a4+2][b4] = " | T";
           a4++;
       }
       a5 = 9;
       b5 = 9;
       c[a5+1][b5] = " | T";
       f5 = 3;
       g5 = 3;
       for (int i=1;i<g5;i++) 
       {
           c[a5+1][b5-1] = " | T";
           b5--;
       }
       r2=14;
       }
       if (o == 2)
       {
       a1 = 1;
       b1 = 1;
       c[a1+1][b1] = " | T";
       f1 = 1;
       g1 = 5;
       for (int i=1;i<g1;i++)
       {
            c[a1+2][b1] = " | T";
            a1++;  
       }
       a2 = 7;
       b2 = 8;
       c[a2+1][b2] = " | T";
       f2 = 3;
       g2 = 4;
       for (int i=1;i<g2;i++) 
       {
            c[a5+1][b5-1] = " | T";
            b5--;
       }
       a3 = 6;
       b3 = 0;
       c[a3+1][b3] = " | T";
       f3 = 1;
       g3 = 3;
       for (int i=1;i<g3;i++)
       {
           c[a3+2][b3] = " | T";
           a3++;
       }
       a4 = 7;
       b4 = 3;
       c[a4+1][b4] = " | T";
       f4 = 1;
       g4 = 2;
       for (int i=1;i<g4;i++)
       {
           c[a4+2][b4] = " | T";
           a4++;
       }
       a5 = 0;
       b5 = 9;
       c[a5+1][b5] = " | T";
       f5 = 1;
       g5 = 4;
       for (int i=1;i<g5;i++)
       {
           c[a5+2][b5] = " | T";
           a5++;
       }
       r2=18;
       }
       System.out.println("Computer put its tanks also.");
    }
    public static void MGame()
    {
        if (w == 1)
        {
        System.out.print("p1=");
        p1 = input.nextInt();
        while (p1>9 || p1<0)
        {
           System.out.println("Error!");
           System.out.print("p1=");
           p1 = input.nextInt();   
        }
        System.out.print("q1=");
        q1 = input.nextInt();
        while (q1>9 || q1<0)
        {
           System.out.println("Error!");
           System.out.print("q1=");
           q1 = input.nextInt();   
        }
        if ( " | H".equals(d[p1+1][q1]) || " | X".equals(d[p1+1][q1])) 
        {
            System.out.println("Error! You hit this block previously"); 
            MGame();
        }
        else
        {
        if  (" | T".equals(c[p1+1][q1])) 
        {
            System.out.println("Player 1: hit!");
            d[p1+1][q1] = " | H";
            r3++;
            form1();
        }
        else
        {
            System.out.println("Player 1: miss!");
            d[p1+1][q1] = " | X";
            form1();
        }
        }
        if ( r3 == r2 ) 
        {
            System.out.println("Player 1 Wins!");
            E=1;
            form1();
        }
        }
        else
        {
        System.out.print("p1=");
        p1 = input.nextInt();
        while (p1>9 || p1<0)
        {
           System.out.println("Error!");
           System.out.print("p1=");
           p1 = input.nextInt();   
        }
        System.out.print("q1=");
        q1 = input.nextInt();
        while (q1>9 || q1<0)
        {
           System.out.println("Error!");
           System.out.print("q1=");
           q1 = input.nextInt();   
        }
        if ( " | H".equals(d[p1+1][q1]) || " | X".equals(d[p1+1][q1])) 
        {
            System.out.println("Error! You hit this block previously"); 
            MGame();
        }
        else
        {
        if  (" | T".equals(e[p1+1][q1])) 
        {
            System.out.println("Player 1: hit!");
            d[p1+1][q1] = " | H";
            t3++;
            form1();
        }
        else
        {
            System.out.println("Player 1: miss!");
            d[p1+1][q1] = " | X";
            form1();
        }
        }
        if ( t3 == u2 ) 
        {
            System.out.println("Player 1 Wins!");
            E=1;
            form1();
        } 
        }
    } 
    public static void MGame2()
    {
        System.out.print("p1=");
        p1 = input.nextInt();
        while (p1>9 || p1<0)
        {
           System.out.println("Error!");
           System.out.print("p1=");
           p1 = input.nextInt();   
        }
        System.out.print("q1=");
        q1 = input.nextInt();
        while (q1>9 || q1<0)
        {
           System.out.println("Error!");
           System.out.print("q1=");
           q1 = input.nextInt();   
        }
        if ( " | h".equals(f[p1+1][q1]) || " | x".equals(f[p1+1][q1])) 
        {
            System.out.println("Error! You hit this block previously"); 
            MGame2();
        }
        else
        {
        if  (" | T".equals(b[p1+1][q1])) 
        {
            System.out.println("Player 2: hit!");
            f[p1+1][q1] = " | h";
            u1++;
            form3();
        }
        else
        {
            System.out.println("Player 2: miss!");
            f[p1+1][q1] = " | x";
            form3();
        }
        }
        if ( u1 == k1 ) 
        {
            System.out.println("Player 2 Wins!");
            E=1;
            form3();
        }
    } 
    public static void CGame()
    {
        p2 = random.nextInt(10);
        q2 = random.nextInt(10);
        while (" | A".equals(b[p2+1][q2]) || " | M".equals(b[p2+1][q2]))
        {
            p2 = random.nextInt(10);
            q2 = random.nextInt(10);
        }
        if  (" | T".equals(b[p2+1][q2])) 
        {
            System.out.println("Computer: hit!");
            b[p2+1][q2] = " | A";
            k3++;
        }
        else
        {
            System.out.println("Computer: miss!");
            b[p2+1][q2] = " | M";
        }
        form();
        if ( k3 == k1 ) 
        {
            System.out.println("Computer Wins!");
            E=1;
        }
    }
    public static void main(String[] args) 
    {
        input = new Scanner(System.in);
        random = new Random();
        for (int i=0;i<12;i++) {
        for (int j=0;j<12;j++)
        {
            b[i][j]=" |  ";
        }
    }
        for (int i=0;i<12;i++) {
        for (int j=0;j<12;j++)
        {
            d[i][j]=" |  ";
        }
    }
        for (int i=0;i<12;i++) {
        for (int j=0;j<12;j++)
        {
            e[i][j]=" |  ";
        }
    }
        for (int i=0;i<12;i++) {
        for (int j=0;j<12;j++)
        {
            f[i][j]=" |  ";
        }
    }
        System.out.print("Select: One player(1)   Two player(2)? w=");
        w = input.nextInt();
        while (w>2 || w<1)
        {
           System.out.println("Error!");
           System.out.print("w=");
           w = input.nextInt();   
        }
        if (w == 1)
        {
            form();
            MTank();
            CTank();
        }
        else
        {
            form();
            MTank();
            MTank2();
        }
        System.out.println("Start!");
        while (E == 0)
        {    
            MGame();
        if (E == 0 && w==1) CGame();
        if (E == 0 && w==2) MGame2();
        }
    }
}
