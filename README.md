# Using Robocode with IntelliJ

## Links

* [Robocode home](https://robocode.sourceforge.io)
* Robocode [javadocs](https://robocode.sourceforge.io/docs/robocode/)

## Setup
1) Install Robocode the usual way: 
download *robocode-1.9.3.4-setup.jar* from [here](https://sourceforge.net/projects/robocode/files/)
and run the setup jar to install Robocode into your home directory with:

```bash
java -jar robocode-1.9.3.4-setup.jar
```

2) Clone this repo to a local directory with: 

```bash
git clone https://github.com/athenian-programming/robocode-example.git
```

3) Select **Build** -> **Build Project** to compile the project's java code.

4) Open the repo with IntelliJ, click on **Run** -> **Edit Configurations...**, 
then click on **+** and select **Application** from the list
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

5) Run the newly created configuration to start Robocode.

6) Once started, select **Options** -> **Preferences** -> **Development Options** on the Robocode app,
and add *robocode-example/out/production/classes* and *robocode-example/out/production/resources* from 
the cloned *robocode-example* repo and click **Finish**.

![Preferences](docs/preferences.jpg)

## Robots

* An example robot is here: *src/main/java/org/athenian/SimpleRobot.java*
* The sample robots included in the Robocode distro are here: *src/main/java/sample*



