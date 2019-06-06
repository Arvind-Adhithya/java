import java.util.*;
public class wordPuzzle{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
//int n=s.nextInt();
System.out.println("Enter word: ");
String word=s.nextLine();
char puzzle[][]=new char[4][4];
System.out.println("Enter matrix: ");
for(int i=0;i<4;i++)
{
for(int j=0;j<4;j++)
{
puzzle[i][j]=s.next().charAt(0);
}
}
int length=word.length();
System.out.println("Matched position: ");
for(int i=0;i<4;i++)
{
for(int j=0;j<4;j++)
{
for(int k=0;k<length;k++) {

if(word.charAt(k)==puzzle[i][j])
{
System.out.println(i+" "+j);
if(((i>0)&&(i<4))&&((j>0)&&(j>4))&&(word.charAt(k+1)==puzzle[i+1][j]))
System.out.println(i+" "+j);
else if(((i>0)&&(i<4))&&((j>0)&&(j>4))&&(word.charAt(k+1)==puzzle[i][j+1]))
System.out.println(i+" "+j);

if(((i>0)&&(i<4))&&((j>0)&&(j>4))&&(word.charAt(k+2)==puzzle[i+1][j]))
System.out.println(i+" "+j);
else if(((i>0)&&(i<4))&&((j>0)&&(j>4))&&(word.charAt(k+2)==puzzle[i][j+1]))
System.out.println(i+" "+j);

if(((i>0)&&(i<4))&&((j>0)&&(j>4))&&(word.charAt(k+3)==puzzle[i+1][j]))
System.out.println(i+" "+j);
else if(((i>0)&&(i<4))&&((j>0)&&(j>4))&&(word.charAt(k+3)==puzzle[i][j+1]))
System.out.println(i+" "+j);
/*if(((i>0)&&(i<4))&&((j>0)&&(j>4))&&((word.charAt(k+2)==puzzle[i+1][j])||(word.charAt(k+1)==puzzle[i][j+1])))
System.out.println(i+" "+j);
if(((i>0)&&(i<4))&&((j>0)&&(j>4))&&((word.charAt(k+2)==puzzle[i+1][j])||(word.charAt(k+1)==puzzle[i][j+1])))
System.out.println(i+" "+j);*/
}
}
}
System.out.println();
}
}
}