## Getting Started - Logger

Adding `Logger` dependency to `build.gradle.kts`:
```kotlin
  val kmpDry = "1.0.0"
  implementation("br.com.ericksprengel.kmpdry:kmp-dry-logger:${kmpDry}")
```

Using Logger :
```kotlin
import br.com.ericksprengel.kmpdry.logger.Log

Log.d("MY_TAG", "Hello KMP DRY")
Log.v("MY_TAG", "Hello KMP DRY")
Log.w("MY_TAG", "Hello KMP DRY")
Log.e("MY_TAG", "Hello KMP DRY")
```
