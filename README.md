# idea plugin learn

Learn how to develop an idea plugin.

## environment:

OS: Windows10

IDEA: Community 2020.3

JDK: 11

Gradle: 6.6



## note: 

1. when you refresh gradle project, it will download ideaC package and source, the path should be:

   ```
   $GRADLE_USER_HOME\caches\modules-2\files-2.1\com.jetbrains.intellij.idea\ideaIC\2020.3
   ```

   

2. if you run `runide` and it start download jbr 11 tar file, you can also download it manually and put the tar file to gradle repository path:

   ```
   $GRADLE_USER_HOME/caches/modules-2/files-2.1/com.jetbrains/jbre
   ```

   then rerun the `runide` command, it will auto extract and work.



