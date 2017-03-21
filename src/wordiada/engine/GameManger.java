package wordiada.engine;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;


/**
 * Created by eran on 21/03/2017.
 */
public class GameManger {
    public class Board
    {

    }

    public class Deck {

    }

    private String dictionaryFileName;
    private int targetDeckSize;
    private int boardSize;
    private int retriesNumber;
    private int cubeFacets;
    public void gameManager()
    {
        this.dictionaryFileName = "war-and-piece.txt";
        this.targetDeckSize = 150;
        this.boardSize = 7;
        this.retriesNumber = 2;
    }


}
