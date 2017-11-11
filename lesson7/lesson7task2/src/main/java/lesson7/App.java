package lesson7;
/*
1) Create a class Plants, which includes fields int size, Color color and Type type,
    and constructor where these fields are initialized.
2) Color and Type are Enum. Override the method toString( ).
3) Create classes ColorException and TypeException and describe there all possible colors and types of plants.
4) In the method main create an array of five plants. Check to work your exceptions.
*/
public class App 
{
    public static void main( String[] args ) throws ColorException, TypeException {

        try {
            Plants[] plants = new Plants[5];
            plants[0] = new Plants(5, "red", "tulip");
            plants[1] = new Plants(3, "purple", "rose");
            plants[2] = new Plants(11, "white", "rose");
            plants[3] = new Plants(101,"red", "tulip");
            plants[4] = new Plants(7,"purple", "orchid");

            for (Plants pl: plants) {
                System.out.println(pl.toString());
            }
        }catch (ColorException | TypeException e){
            System.err.println(e.getMessage() + "\n");
            e.printStackTrace();
        }
    }
}
