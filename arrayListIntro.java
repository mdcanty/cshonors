import java.util.*;
import java.io.*;
import acm.program.*;
import acm.grahpics.*;
import acm.util.*;
public class arrayListIntro extends ConsoleProgram {
    public void run () {
    
    ArrayList <String> myNames = new ArrayList<String>();
    ArrayList <Integer> myGrades = new ArrayList<Integer>();
    
    String ch;
    do {
        ch = readLine("(A)dd, (D)isplay, (O)ne, (Q)uit");
        if (ch.equals("Q") || ch.equals("q")) {
        break;
        }
