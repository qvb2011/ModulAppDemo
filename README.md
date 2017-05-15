
1.跑整个app

gradle.properties文件中修改 IsBuildMudle=false

Sync Project Gradle File

这时候只有一个appModule可以跑起来


2.跑单个Module

gradle.properties文件中修改 IsBuildMudle=true 

Sync Project Gradle File

这时候可以分别起 PayModule 和 LoginModule
