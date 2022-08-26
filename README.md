# uniswap-sdk-java
Java SDK for uniswap covering both V2 and V3 contracts periphery and core.

# Dependencies

- WEB3J : Code generation and compile the contract calling code
- uniswap/v3-core : Repository containing uniswap core solidity contract
- uniswap/v3-periphery : Repository containing uniswap periphery solidity contract
- uniswap/v2-core : Repository containing uniswap periphery solidity contract older version
- uniswap/v2-periphery : Repository containing uniswap periphery solidity contractolder version

# Using it

## Maven

To use in maven use:
```xml
<dependency>
	<groupId>uniswap.jvm</groupId>
	<artifactId>uniswap-sdk-java</artifactId>
	<version>LATEST-VERSION</version>
<dependency>
```
# Building It:

## Requirement:

- Git to download repositories
- Java and Maven to build it.
- Node and NPM to get dependencies of contracts which can be quite a few and different versions.

## Generating the source files from contracts.
It downloads the core and periphery git repositories to src/main/js and then runs web3j contract code generation to create java files to interact with the contracts.

For this purpose do the following:

1. Go the src/main/js folder inside the root.
2. If it is empty then run `mvn generate-sources -Pproject-init`. Checkout of core and periphery from git complete.
3. Run `mvn generate-sources -Pcontracts-compile`. Code generation of code from contracts complete.
4. Run `mvn package`. Creation of jar with the java code complete.
5. Use the jar in project by importing in pom its gav coordinates.

## Cleaning the files generated.

To clean the downloaded git directory only run `mvn generate-sources -Pproject-clean`.
To clean the generated contracts code only run `mvn clean`.
