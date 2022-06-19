package.com.evengenerator.bean;

public class NumberGenerator
{
  public static void main(String[] args)
  {
      int n = 0;
      int index = 2;
      int evengenerated = 0;
      n = Integer.parseInt(System.getProperty("N"));
      while (evengenerated < 10)
      {
        if(index % 2 ==0 )
        {
            System.out.println(index);
            evengenerated++;
        }
        index++;
      }
     System.out.println("bye!");
  }
}