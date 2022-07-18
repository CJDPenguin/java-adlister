import beans.Album;
import beans.Artist;
import beans.Author;
import beans.Quote;

import java.util.ArrayList;
import java.util.Date;

public class BeanTest {

    public static void main(String[] args) {
        Author johnAdams = new Author("John", "Adams");
        Quote dare = new Quote(1, johnAdams, "The true source of our suffering has been our timidity. We have been afraid to think. . . . Let us dare to read, think, speak, and write.");
        Album backInBlack = new Album(new Artist ("AC/DC", true, "English"), "Back in Black", new Date(7-25-1980), 30.10, "Hard Rock");

        Quote liberty = new Quote(2, new Author("James", "Wilson"), "Without liberty, law loses its nature and its name, and becomes oppression. Without law, liberty also loses its nature and its name, and becomes licentiousness.");

        Quote power = new Quote(3, new Author("James", "Madison"), "It will not be denied that power is of an encroaching nature and that it ought to be effectually restrained from passing the limits assigned to it.");

        ArrayList <Quote> quotes = new ArrayList<>();
        quotes.add(dare);
        quotes.add(liberty);
        quotes.add(power);

        System.out.println(quotes.get(0).getContent());
        System.out.println(quotes.get(1).getAuthor().getLastName());
        System.out.println(quotes.get(2).getAuthor().getFirstName());
    }
}
