## Getting Started - URL Launcher

Adding `Url Launcher` dependency to `build.gradle.kts`:
```kotlin
  val kmpDry = "1.0.0"
  implementation("br.com.ericksprengel.kmpdry:kmp-dry-url-launcher:${kmpDry}")
```

Using `Url Launcher`:
```kotlin
import br.com.ericksprengel.kmpdry.urllauncher.launchUrl

launchUrl("https://github.com")
```