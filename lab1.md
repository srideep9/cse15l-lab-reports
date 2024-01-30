# Lab Report 1
---
Date: 01/10/2024

## cd Command Code Blocks

**Code Block 1 (`cd` with no arguments):**

    [user@sahara ~/lecture1/messages]$ pwd
    /home/lecture1/messages
    [user@sahara ~/lecture1/messages]$ cd
    [user@sahara ~]$ pwd
    /home

Working Directory: `/home/lecture1/messages`

Explanation: In this case, the starting directory was `messages`. `cd` with no arguments allows you to move to the very first directory, which is `home` in this case.

Error?: No

**Code Block 2 (cd with path to a directory):**

```
[user@sahara ~]$ pwd
/home
[user@sahara ~]$ cd lecture1
[user@sahara ~/lecture1]$ pwd
/home/lecture1
```

Working Directory: `/home`

Explanation: In this case, `cd` allows you to change the directory to `lecture1`.

Error?: No

**Code Block 3: (cd with path to a file):**

    [user@sahara ~/lecture1]$ pwd
    /home/lecture1
    [user@sahara ~/lecture1]$ cd Hello.java
    bash: cd: Hello.java: Not a directory
    [user@sahara ~/lecture1]$ 

Working Directory: `/home/lecture1`

Explanation: In this case, `cd` with a file argument gives you an error because you cannot `cd` (change directory) into a file.

Error?: Yes

## ls Command Code Blocks

**Code Block 1 (ls with no arguments):**

```
[user@sahara ~]$ pwd
/home
[user@sahara ~]$ ls
hello.txt  lecture1
[user@sahara ~]$ 
```

Working Directory: `/home`

Explanation: `ls` with no arguments just lists the files and directories listed inside the present working directory.

Error?: No

**Code Block 2 (ls with path to a directory):**

```
[user@sahara ~]$ pwd
/home
[user@sahara ~]$ ls lecture1
Hello.class  Hello.java  messages  README
```

Working Directory: `/home`

Explanation: `ls` with a directory as an argument gives you the files and directories inside the directory you pass in as the argument.

Error?: No

**Code Block 3: (ls with path to a file):**

```
[user@sahara ~]$ pwd
/home
[user@sahara ~]$ cd lecture1
[user@sahara ~/lecture1]$ ls Hello.java
Hello.java
```

Working Directory: `/home/lecture1`

Explanation: `ls` with a file as an argument just lists the file name again, because a file cannot containe other files or directories.

Error?: No

## cat Command Code Blocks

**Code Block 1 (cat with no arguments):**

```
[user@sahara ~]$ pwd
/home
[user@sahara ~]$ ls
hello.txt  lecture1
[user@sahara ~]$ cat


```
Working Directory: `/home`

Explanation: `cat` with no arguments results in an error, but it is not one with an error output. Instead, it simply breaks the terminal.

Error?: Yes

**Code Block 2 (cat with path to a directory):**

```
[user@sahara ~]$ pwd
/home
[user@sahara ~]$ ls
hello.txt  lecture1
[user@sahara ~]$ cd lecture1
[user@sahara ~/lecture1]$ cat messages
cat: messages: Is a directory
[user@sahara ~/lecture1]$ 
```

Working Directory: `/home/lecture1`

Explanation: `cat` with a directory as an argument also results in an error, but this time the error gives an output.

Error?: Yes

**Code Block 3: (cat with path to a file):**

```
[user@sahara ~/lecture1]$ cat Hello.java
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Hello {
  public static void main(String[] args) throws IOException {
    String content = Files.readString(Path.of(args[0]), StandardCharsets.UTF_8);    
    System.out.println(content);
  }
```

Working Directory: `/home/lecture1`

Explanation: `cat` with a file as an argument just prints the file contents.

Error?: No


