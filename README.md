# Using Robocode with IntelliJ

## Setup
1) Install [Robocode](https://robocode.sourceforge.io) the usual way: 
download *robocode-1.9.3.4-setup.jar* from [here](https://sourceforge.net/projects/robocode/files/).
and run the setup jar to install Robocode into your home directory with:

```bash
java -jar robocode-1.9.3.4-setup.jar
```

2) Clone this repo to a local directory with: 

```bash
git clone https://github.com/athenian-programming/robocode-example.git
```

3) Open the repo with IntelliJ, click on **Run** -> **Edit Configurations...** -> **+** -> **Application** 
and create a configuration with these values:

```
Name: Robocode
Main class: robocode.Robocode
VM options: -Xmx512M -Dsun.io.useCanonCaches=false -Ddebug=true
Working directory: /Users/username/robocode 
Use classpath of module: org.athenian.robocode-example.main
JRE: 1.8
```

![Robocode Configuration](docs/configuration.jpg)

4) Run the newly created configuration to start Robocode.

5) Once started, select **Options** -> **Preferences** -> **Development Options**,
add *robocode-example/out/production/classes* and *robocode-example/out/production/resources*
and click **Finish**.

![Preferences](docs/preferences.jpg)



