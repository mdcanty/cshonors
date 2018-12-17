import acm.program.*;

public class moreString extends ConsoleProgram {
        public void run () {
                String str1 = new String("This is a BeginnersBook tutorial");
                String str2 = new String("Beginners");
                String str3 = new String("Book");
                String str4 = new String("Books");

                //------indexOf() produces an integer------------

                println("Index of B in str1: " + str1.indexOf("B"));
                println("Index of B in str1 after 15th char: " + str1.indexOf("B", 15));
                println("Index of B in str1 after 30th char:  " + str1.indexOf("B", 30));
                println("Index of string str2 in str1: " + str1.indexOf(str2));
                println("Index of str2 after 15th char: " + str1.indexOf(str2, 15));
                println("Index of string str3: " + str1.indexOf(str3));
                println("Index of string str4: " + str1.indexOf(str4));
                println("Index of hardcoded string: " + str1.indexOf("is"));
                println("Index of hardcoded string after 4th char: " + str1.indexOf("is", 4));

                //-------replace() does just that, replaces----------
                String str = new String("Site is Carver Engineers");
                println("Original String: " + str);
                println("String after replacing all 'e' with 'z' :");
                println(str.replace("e", "z"));

                println("String after replacing all 'g' with 'k' :");
                println(str.replace("g", "k"));

                //-------isEmpty() and contains() produces True or False------------
                String str5 = "";
                String str6 = "hello";
                println(str5.isEmpty());
                println(str6.isEmpty());

                String show = "Game of Thrones";
                println(show.contains("Game"));
        }
}








