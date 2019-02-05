
clean:
	rm -rf out/

versioncheck:
	./gradlew dependencyUpdates
