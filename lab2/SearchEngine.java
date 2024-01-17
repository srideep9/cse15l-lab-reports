import java.io.IOException;
import java.net.URI;
import java.util.*;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    ArrayList<String> strings = new ArrayList<String>();
    String output = "Search Engine Contains:";

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            for(int i = 0; i < strings.size(); i++){

                output = output + " " + strings.get(i);

            }
            return output;
        } else {
            if (url.getPath().contains("/add")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s")) {
                    strings.add(parameters[1]);
                    return String.format("%s added to list!", parameters[1]);
                }
            }
            else if(url.getPath().contains("/search")){
                String[] parameters = url.getQuery().split("=");
                String output2 = "";
                if(parameters[0].equals("s")){
                    for(int i = 0; i < strings.size(); i++){
                        if(strings.get(i).contains(parameters[1])){
                            output2 = output2 + " " + strings.get(i);
                        }
                    }
                    return String.format("Search Results: %s", output2);
                }
            }
            return "404 Not Found!";
        }
    }
}

class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
