public class U6L3_quiz_Q1
{

public static void main(String[] args)
{
String[] word = {"algorithm", "boolean", "int", "String"};
System.out.println("The Word Length is:" + word.length);

for (int i = 0; i < word.length / 2; i++)
{

 word[i] = word[word.length - 1 - i];

 word[word.length - 1 - i] = word[i];

}

for (int i = 0; i < word.length; i++)

{

 System.out.print(word[i] + " ");

}

}

}
