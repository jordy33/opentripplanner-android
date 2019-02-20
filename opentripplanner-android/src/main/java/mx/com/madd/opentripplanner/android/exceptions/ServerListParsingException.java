package mx.com.madd.opentripplanner.android.exceptions;

/**
 * Created by foucelhas on 2/10/14.
 */
public class ServerListParsingException extends IllegalArgumentException {

    public ServerListParsingException(String message) {
        super("Problems parsing server fields: " + message);
    }
}
