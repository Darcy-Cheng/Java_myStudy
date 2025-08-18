import java.util.HashMap;
import java.util.Scanner;

public class Coin
    {
        public HashMap<Integer, String> coinnames = new HashMap<Integer, String>();

        public Coin()
            {
                coinnames.put(1, "penny");
                coinnames.put(10, "dime");
                coinnames.put(25, "quarter");
                coinnames.put(50, "half-dollar");
                coinnames.put(50, "五毛");
                System.out.println(coinnames.keySet());
                System.out.println(coinnames.keySet().size());
            }

        public String GetName(int amount)
            {
                if (coinnames.containsKey(amount))
                    {
                        return coinnames.get(amount);
                    } else
                    {
                        return "We don't have such a name.";
                    }
            }


        public static void main(String[] args)
            {
                Scanner in = new Scanner(System.in);
                int amount = in.nextInt();

                Coin coins = new Coin();
                String name = coins.GetName(amount);
                System.out.println(name);
                System.out.println(coins.coinnames);
                for (Integer i : coins.coinnames.keySet())
                    {
                        String s = coins.coinnames.get(i);
                        System.out.println(s);
                    }
            }
    }