# acem-JC03

## Naming convention (Programming Case)
<img width="1204" alt="image" src="https://user-images.githubusercontent.com/21164124/175962036-0a3c0620-ec50-455f-ac29-facde01c6045.png">

## FYI
* Class Name - PascalCase
* Method/Variable Name - camelCase
* Final Variable Name - UPPER_SNAKE_CASE



## Git Commands
> Initialize git.
```sh
git init
```
> Add a remote git server origin link.
```sh
git remote add origin <origin_name>
```
> Add files to track.
```sh
git add .
```
> Commit the file changes.
```sh
git commit -m "<commit message>"
```
> Pushing for the firsttime (Pushing branch to git server).
```sh
git push origin -u master
```
> Push commits to git server.
```sh
git push 
```
> Pull latest code from git server.
```sh
git pull 
```

## Setup Github access with ssh keys

> Create SSH keys

```sh
ssh-keygen
```
> You can give any name to the file. We used testing as the key name here
> Output
```sh
ssh-keygen
Generating public/private rsa key pair.
Enter file in which to save the key (/Users/testuser/.ssh/id_rsa): /Users/testuser/.ssh/testing
Enter passphrase (empty for no passphrase): 
Enter same passphrase again: 
Your identification has been saved in /Users/testuser/.ssh/testing
Your public key has been saved in /Users/testuser/.ssh/testing.pub
The key fingerprint is:
SHA256:h14zZ4uKxIAnY3p5knHl91IpipFpaSdoYrr4MKeLtzM testuser@testuser.local
The key's randomart image is:
+---[RSA 3072]----+
|                 |
|                 |
|      .          |
|   o *   . .     |
|..O % o S B o    |
|o= @ B + * * .   |
|= * o + o o .    |
|oBEo . . o       |
|*+o+  . .        |
+----[SHA256]-----+
```
> Change directory to the location where the file is created. For our case its in /Users/testuser/.ssh/

```sh
cd /Users/testuser/.ssh/
```
> Read the public key and copy the contents
```sh
cat testing.pub
```
>Login to github head to setting then goto ssh/gpg keys and add the copied contents as new ssh key

>Now, git project must be pointing to ssh origin to be able to push/pull from the repository

## Bundling with folder structure
```sh
javac path/to/MainClass.java -sourcepath src -d build/classes
java -cp build/classes package.name.of.MainClass
```
