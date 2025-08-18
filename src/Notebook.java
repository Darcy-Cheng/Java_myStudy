//Code comes from Weng Kai (ZJU) 's courses in MOOC.
//A sample of Arraylist in Java.

import java.util.ArrayList;
import java.util.HashSet;

public class Notebook
    {
        private ArrayList<String> notes = new ArrayList<String>();

        public void add(String s)
            {
                notes.add(s);
            }

        public void add(int location, String s)
            {
                notes.add(location, s);
            }

        public int GetSize()
            {
                return notes.size();
            }

        public String GetNote(int index)
            {
                return notes.get(index);
            }

        public String[] list()
            {
                String[] a = new String[notes.size()];
//                for (int i = 0; i < notes.size(); i++)
//                    {
//                        a[i] = notes.get(i);
//                    }
                notes.toArray(a);
                return a;
            }

        public void RemoveNote(int index)
            {
                notes.remove(index);
            }

        public static void main(String[] args)
            {
                Notebook note1 = new Notebook();
                note1.add("First");
                note1.add("Second");
                note1.add(1, "Test");
                System.out.println(note1.GetSize());
//                System.out.println(note1.GetNote(1));
//                System.out.println(note1.GetNote(2));
//                note1.RemoveNote(1);
//                String[] a = note1.list();
//                for (String s : a)
//                    {
//                        System.out.println(s);
//                    }
                HashSet<String> s = new HashSet<String>();
                s.add("First");
                s.add("Second");
                s.add("First");

                for (String a : s)
                    {
                        System.out.println(a);
                    }
            }
    }
