# fadian

本工具可以帮助您快速发癫。

目前仅支持 Linux.

# Usage
```
Usage: fadian options_list
Arguments: 
    name -> 发癫对象 (optional) { String }
Options: 
    --mode [normal] { Value should be one of [interactive, normal] }
    --type [dog] { Value should be one of [fabing, dog] }
    --num [0] { Int }
    --help, -h -> Usage info 
```

# Build
```bash
./gradlew linkReleaseExecutableLinux
```