import java.io.*;
public class Database {
    private static String fileName = "database.txt";

    String cardNumber;
    int cardPin;
    long cardBalance;
    
    String tokenList[] = null;


    public void loadDatabase(){    

        try{
            final FileReader fr = new FileReader(fileName);
            final BufferedReader br = new BufferedReader(fr);

            final String line = br.readLine();

            tokenList = line.split(",");
            cardNumber = tokenList[0];
            cardPin = Integer.parseInt(tokenList[1]);
            cardBalance = Long.parseLong(tokenList[2]);
            fr.close();
            br.close();
        } catch (final IOException ex) {
            System.out.println(ex);
        }
    }

    public void saveDatabase(final long balance) {
        try {
            final FileWriter fw = new FileWriter(fileName);
            final PrintWriter pw = new PrintWriter(fw);
            pw.println(cardNumber + "," + cardPin + "," + balance);

            pw.flush();
            fw.close();
            pw.close();
        } catch (final IOException ex) {
            System.out.println(ex);
        }

    }

}