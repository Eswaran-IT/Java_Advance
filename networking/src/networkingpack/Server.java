package networkingpack;

import java.io.*;
import java.net.*;

public class Server {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        try {
            Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            System.out.println("Connected to chat server.");

            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader serverInputReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Start a separate thread to handle server messages
            Thread serverListenerThread = new Thread(new ServerListener(serverInputReader));
            serverListenerThread.start();

            String userInput;
            while ((userInput = userInputReader.readLine()) != null) {
                out.println(userInput);
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ServerListener implements Runnable {
    private BufferedReader reader;

    public ServerListener(BufferedReader reader) {
        this.reader = reader;
    }

    @Override
    public void run() {
        try {
            String serverResponse;
            while ((serverResponse = reader.readLine()) != null) {
                System.out.println("Server: " + serverResponse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
