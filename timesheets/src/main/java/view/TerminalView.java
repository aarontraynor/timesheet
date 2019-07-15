package view;

import control.DatabaseConnector;
import model.Database;

import java.util.Scanner;

/**
 * @author Aaron
 */
public class TerminalView {

    /**
     *
     * @param args arguments given from the terminal when executing the program
     */
    public static void main(String[] args) {
        String domain;
        String username;
        String password;
        int port;

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter database URL: ");
        domain = kb.nextLine();

        System.out.print("Enter port number (1-65535): ");
        port = Integer.parseInt(kb.nextLine());

        System.out.print("Enter username: ");
        username = kb.nextLine();

        System.out.print("Enter password: ");
        password = kb.nextLine();

        System.out.println("Connecting...");
        DatabaseConnector dbc = new DatabaseConnector(new Database(domain, username, password, port));

        System.out.println("Connected: " + dbc.isConnected());
    }
}
