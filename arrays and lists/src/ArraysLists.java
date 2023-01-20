import java.util.ArrayList;

public class ArraysLists {

    public static void main(String[] args){

        //create a new int array of size 5
        //Array are lists = variable that holds something inside of it
        int[] numberArray = new int[5];

        //Creates a new string array of size 5
        String[] stringArray = new String[5];

        //How can you make a new array of any data type
        //Datatype[] numeOfArray = new datatype[ size of array you want ];

        // to populate( fill out ) an array we can use for a loop
        for (int i = 0; i < numberArray.length; i++){
            //filling the number array with a random number between 1-10
            numberArray[i] = (int) Math.random() * 10 + 1;
            System.out.println(numberArray[i]);

            //number array look like
            //numberArray
            //0. 1
            //1. 2
            //2. 3
            //3. 4
            //4. 5
            //Count the 0 as a one then continue

            //Easier way to populate an array
            numberArray[0] = 50;
            numberArray[1] = 100;
            numberArray[2] = 150;


        }

                    //A BETTER EASIER WAY called arraylists ( with importing )
            //the <> 
            ArrayList<String> stringArraylist = new ArrayList<>();

            //arraylists has unlimited size and no numbers in the making of the code
            stringArraylist.add("Hey");
            stringArraylist.add("hello");
            stringArraylist.add("Hey there");

        
        
            System.out.println(stringArraylist.get(0));

            // Loop can look at everything on the lists
            // then execute code on them
            for (int i = 0; i < stringArraylist.size(); i++){
                System.out.println(stringArraylist.get(i));

                
            }

    }
    
}
