# gdx-LEdMap
A libgdx parser for LEd https://deepnight.net/tools/led-2d-level-editor/

[![Build, Test, Publish](https://github.com/lyze237/gdx-LEdMap/workflows/Build,%20Test,%20Publish/badge.svg?branch=main)](https://github.com/lyze237/gdx-LEdMap/actions?query=workflow%3A%22Build%2C+Test%2C+Publish%22)
[![License](https://img.shields.io/github/license/lyze237/gdx-LEdMap)](https://github.com/lyze237/gdx-LEdMap/blob/main/LICENSE) 
[![Jitpack](https://jitpack.io/v/lyze237/gdx-LEdMap.svg)](https://jitpack.io/#lyze237/gdx-LEdMap)

# Note

This is in an extremely early stage and does not work at all.

# Installation

1. Open or create `gradle.properties` in the root folder of your project, add the following line:
```properties
gdxLEdMapVersion=VERSION
```
Check [Jitpack](https://jitpack.io/#lyze237/gdx-LEdMap/) for the latest version and replace `VERSION` with that.

```groovy
implementation "com.github.lyze237:gdx-LEdMap:$gdxLEdMapVersion"
```


## Html/Gwt project
1. Gradle dependency:
```groovy
implementation "com.github.lyze237:gdx-LEdMap:$gdxLEdMapVersion:sources"
```
2. In your application's `.gwt.xml` file add [(Normally `GdxDefinition.gwt.xml`)](https://github.com/lyze237/gdx-LEdMap/blob/main/example/html/src/main/java/dev/lyze/ledmap/example/GdxDefinition.gwt.xml):
```xml
<inherits name="dev.lyze.ledmap" />
```

3. Check the [repo](https://github.com/lyze237/gdx-LEdMap/tree/main/example) for an example.