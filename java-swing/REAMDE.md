# Java Swing

Requires Java

## Linux

Run `build.sh`

- Compiles Java class files
- Builds .jar file
- Turns .jar file into Linux executable
    - Run `sudo cp /usr/bin/peter ./peter` to make it executable using the `peter` command

## Windows

Run `build.bat`

- Compiles Java class files
- Builds .jar file

## Have a blast

To build these classes instead of `PeterAlert.java`, change CLASS in the build files to the name of the class that you are trying to build.

- `PeterAlert_popups.java` makes a Peter popup every second. They all close if you click enter.

- `PeterAlert_service.java` randomly makes a Peter popup about every 5 minutes, on average. You can change this by changing the `MINUTES` value.
### On Linux, you can make this an autorun service using systemd

Run `sudo cp /usr/bin/autopeter ./peter` to put `peter` in Unix System Resources.
```
[Unit]
Description=Shows you Peter
After=network-online.target
Wants=network-online.target systemd-networkd-wait-online.service

[Service]
ExecStart=/usr/bin/autopeter
Display=DISPLAY=:0

[Install]
WantedBy=multi-user.target
```
Use `sudo nano /etc/systemd/user/peter.service` to create and edit the service. 

Start the service using `systemctl --user start peter`\
Stop it using `systemctl --user stop peter`

### On Windows, you can add the jar file to `shell:startup`

1. Type `Windows logo + R` to open the run dialog
2. In the `Open` field, type `shell:startup`
3. In the folder that opens, add a shortcut to the jar file

### It is recommended to leave run on startup disabled because the JVM is not known for being light on resources, and it can severly impact login time.
