#!/usr/bin/bash
javac -d bin -sourcepath src -cp lib/Pokemon.jar src/Main.java
echo -e "Main-Class: Main\nClass-Path: lib/Pokemon.jar" > MANIFEST.mf
jar cfm lab2.jar MANIFEST.mf -C bin .
rm -rf bin MANIFEST.mf
