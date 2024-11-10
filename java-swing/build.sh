#! /usr/bin/sh
CLASS="PeterAlert"

javac --release 9 $CLASS.java
if [ -f "$CLASS\$1.class" ]; then
    echo "Main-Class: $CLASS" | jar cmvf /dev/stdin Peter.jar $CLASS.class $CLASS\$1.class peter.png
else
    echo "Main-Class: $CLASS" | jar cmvf /dev/stdin Peter.jar $CLASS.class peter.png
fi
echo "#! /usr/bin/java -jar" >peter
cat Peter.jar >>peter
chmod +x peter
