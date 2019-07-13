package model;

public class Database {
    private String username;
    private String password;
    private String domain;
    private String protocol;
    private int port;

    /**
     *
     * @param username the username used to connect to the database
     * @param password the password of the associated username
     * @param domain the URL of the database
     * @param protocol the protocol used to access the database
     * @param port the port used to access the database
     */
    public Database(String username, String password, String domain, String protocol, int port) {
        this.username = username;
        this.password = password;
        this.domain = domain;
        this.protocol = protocol;
        this.port = port;
    }
}
