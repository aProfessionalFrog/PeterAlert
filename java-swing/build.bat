set CLASS=PeterAlert

javac --release 9 %CLASS%.java
if errorlevel 1 (
    echo Compilation failed.
    exit /b 1
)
echo Main-Class: %CLASS% > manifest.mf

if exist %CLASS%$1.class (
    jar cmvf manifest.mf Peter.jar %CLASS%.class %CLASS%$1.class peter.png
) else (
    jar cmvf manifest.mf Peter.jar %CLASS%.class peter.png
)
del manifest.mf