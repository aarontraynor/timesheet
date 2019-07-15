package model;

public class Database {
    private String username;
    private String password;
    private String domain;
    private int port;

    /**
     *
     * @param username the username used to connect to the database
     * @param password the password of the associated username
     * @param domain the URL of the database
     * @param port the port used to access the database
     */
    public Database(String username, String password, String domain, int port) {
        this.username = username;
        this.password = password;
        this.domain = domain;
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
