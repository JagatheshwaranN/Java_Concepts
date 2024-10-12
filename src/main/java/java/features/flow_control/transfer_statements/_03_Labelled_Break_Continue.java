package java.features.flow_control.transfer_statements;

public class _03_Labelled_Break_Continue {

    public static void main(String[] args) {

        /*
            Labelled Break and Continue
            ===========================
            We can use the labelled Break and Continue to break or continue a particular loop in the
            nested loops.

            r:
              for()
              {
               r2:
                  for()
                  {
		           r3:
		             for()
		             {
                        break r3;
                        break r2;
                        break r1;
		             }
	              }
               }
        */
        labelBlock:
                    for(int i = 0; i < 3; i++)
                    {
                        for(int j = 0; j < 3; j++)
                        {
                            if(i == j)
                                break;
                            System.out.println(i+ " +++ "+j);
                       }
                    }

        labelBlock:
                    for(int i = 0; i < 3; i++)
                    {
                        for(int j = 0; j < 3; j++)
                        {
                            if(i == j)
                                continue;
                            System.out.println(i+ " +++ "+j);
                        }
                    }

        /*
            Do While vs Continue
        */
        int x = 0;
        do
        {
            x++;
            System.out.print(x+ " ");
            if(++x < 5)
                continue;  // continue statement will transfer the control to the while statement.
            x++;
            System.out.print(x+ " ");
        } while(++x < 10);

    }
}
