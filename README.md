# timesheet
A simple timesheet application

# Setting up the Database
TODO: Add database configuration files

This program uses MariaDB to read and store data. This can be run locally, or alternatively can be hosted remotely.

## Connecting to a Remote Database

If hosted remotely, an SSH tunnel must be configured on the device to forward any traffic directed to localhost:3306 to the remote SQL server. This can be done using the following command: ```ssh -f username@server_hostname -p server_port -L 3306:127.0.0.1:3306 -N```

## Configuring the Database

The database requires two tables with the following structure:

EMPLOYERS:
  - ID (int, PK, AUTO_INCREMENT)
  - NAME (string, NOT NULL)
  - SALARY (double, NOT NULL)
  
SHIFTS:
  - ID (int, PK, AUTO_INCREMENT)
  - EMPLOYER_ID (int, FK EMPLOYERS(ID))
  - STARTDATE (date, NOT NULL)
  - STARTTIME (time, NOT NULL)
  - ENDDATE (date)
  - ENDTIME (time)
  
Please note: The program currently assumes that the database is called aarontraynor_timesheet (this will be changed in a future update)
