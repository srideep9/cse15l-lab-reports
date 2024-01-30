# Lab Report 2
---
Date: 01/30/2024

## Chat Server Code

**ChatServer.java:**

    import java.io.IOException;
    import java.net.URI;
    import java.util.ArrayList;

    class Handler implements URLHandler {
    	ArrayList<String> msgs = new ArrayList<String>();
        public String handleRequest(URI url) {
            if(url.getPath().equals("/add-message")){
                String message = url.getQuery().substring(url.getQuery().indexOf("s=") + 2, url.getQuery().indexOf("&"));
                String user = url.getQuery().substring(url.getQuery().indexOf("&user=") + 6);
                String s = String.format("%s: %s\n", user, message);
                msgs.add(s);
                return String.join("\n", msgs);
            }
            return "404 Not Found!";
        }
    }

    class ChatServer {
        public static void main(String[] args) throws IOException {
            if(args.length == 0){
                System.out.println("Missing port number! Try any number between 1024 to 49151");
                return;
            }
            int port = Integer.parseInt(args[0]);
            Server.start(port, new Handler());
        }
    }

## Images

![alt_text](image.png)
