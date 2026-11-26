package main.completebuild;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class LibraryServer {

    public static void main(String[] args) {

        Library library = new Library();
        library.addMedia(new Book("1", "Pippi Långstrump", 1945, "Astrid"));
        library.addMedia(new Book("2", "Ronja Rövardotter", 1945, "Astrid"));
        library.addMedia(new Book("3", "Emil i Lönneberga", 1945, "Astrid"));
        library.addMedia(new Movie("4", "Starwars", 1945, "Linus Båge", 300));


        try(ServerSocket server = new ServerSocket(5000)) {
            System.out.println("Servern startad på port 5000");

            while (true){
                Socket socket = server.accept();
                ClientHandler handler = new ClientHandler(socket, library);
                handler.run();
            }
        }catch (IOException e){
            System.out.println("Serverfel "  + e.getMessage());
        }
    }
}
