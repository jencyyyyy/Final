
import java.io.*;

import java.text.*;

import java.util.*;

public class StudentList
{
  
    public static void main (String[]args)
    {
        //Check arguments
        if(args.length == 0){
            System.out.println("No Argument present");
        }
        else if (args[0].equals ("a"))
        {

            System.out.println ("Loading data ...");

            try
            {

                BufferedReader bufferreader = new BufferedReader (new InputStreamReader (new FileInputStream("students.txt")));

                String string = bufferreader.readLine ();

                String studentList[] = string.split (",");

                for (String student:studentList){

                    System.out.println (student);
                }

            }
            catch (Exception e)
            {

            }

            System.out.println ("Data Loaded.");

        }
        else if (args[0].equals ("r"))

        {

            System.out.println ("Loading data ...");

            try
            {

                BufferedReader bufferreader = new BufferedReader (new InputStreamReader (new FileInputStream("students.txt")));

                String string = bufferreader.readLine ();

                System.out.println (string);

                String i[] = string.split (",");

                Random random = new Random ();

                int randomIndex = random.nextInt ();

                System.out.println (i[randomIndex]);

            } 
            catch (Exception e)
            {
                
            } 
            System.out.println ("Data Loaded.");

        }

        else if (args[0].contains ("+"))
        {

            System.out.println ("Loading data ...");

            try
            {

            BufferedWriter bufferreader = new BufferedWriter (new FileWriter ("students.txt", true));

            String string = args[0].substring (1);

            Date date = new Date ();

            String dateFormate = "dd/mm/yyyy-hh:mm:ss a";

            DateFormat dateFormat = new SimpleDateFormat (dateFormate);

            String fd = dateFormat.format (date);

            bufferreader.write (", " + date + "\nList last updated on " + fd);

            bufferreader.close ();

            }
            
            catch (Exception e)
            {
                
            }


            System.out.println ("Data Loaded.");

        }

        else if (args[0].contains ("?"))

        {

            System.out.println ("Loading data ...");

            try
            {

                BufferedReader s =new BufferedReader (new InputStreamReader (new FileInputStream("students.txt")));

                String r = s.readLine ();

                String i[] = r.split (",");

                boolean done = false;

                String t = args[0].substring (1);

                for (int idx = 0; idx < i.length && !done; idx++)
                {

                    if (i[idx].equals (t))
                    {

                        System.out.println ("We found it!");

                        done = true;

                    }

                }

            }
            catch (Exception e)
            {
                
            }

            System.out.println ("Data Loaded.");

        }

        else if (args[0].contains ("c"))

        {

            System.out.println ("Loading data ...");

            try
            {

                BufferedReader s =new BufferedReader (new InputStreamReader (new FileInputStream("students.txt")));

                String D = s.readLine ();

                char array[] = D.toCharArray ();

                boolean in_word = false;

                int count = 0;

                for (char c:array)
                {

                    if (c == ' ')
                    {

                        if (!in_word)
                        {
                            count++;
                            in_word = true;
                        }
                        else
                        {
                           in_word = false;
                        }

                    }

                }

                System.out.println (count + " word(s) found " + array.length);

            }
            catch (Exception e)
            {
                
            }

            System.out.println ("Data Loaded.");

        }

    }

}
