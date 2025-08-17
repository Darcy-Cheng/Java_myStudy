//Code comes from Weng Kai (ZJU) 's courses in MOOC.
//A sample of Arraylist in Java.

import java.util.ArrayList;

public class Notebook
    {
        private ArrayList<String> notes = new ArrayList<String>();

        public void add(String s)
            {
                notes.add(s);
            }

        public int GetSize()
            {
                return notes.size();
            }

        public String GetNote(int index)
            {
                return "";
            }

        public boolean RemoveNote(int index)
            {
                return true;
            }

        public static void main(String[] args)
            {
                Notebook note1 = new Notebook();
                note1.add("First");
                note1.add("Second");

            }
    }
