# Robocode with IntelliJ

## Setup
1) Download the *robocode-1.9.3.4-setup.jar* from [here](https://sourceforge.net/projects/robocode/files/).

2) Run the setup jar and install Robocode into your home directory with:

```bash
java -jar robocode-1.9.3.4-setup.jar
```

3) Clone this repo with: 

```bash
git clone https://github.com/athenian-programming/robocode-example.git
```

4) Open the repo with IntelliJ, click on *Run* -> *Edit Configurations...* -> *+* -> *Application* and create 
a configuration with these values:

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

6) Once started, select *Options* -> *Preferences* -> *Development Options*,
add **robocode-example/out/production/classes** and **robocode-example/out/production/resources**
and click *Finish*.

![Preferences](docs/preferences.jpg)



