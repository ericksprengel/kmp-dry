KMP-DRY is a collection of standard libraries for KMP.

## Getting Started

Each KMP-DRY module has the same setup.
Try the [Url Launcher](kmp-dry-url-launcher/README.md) or any other module from the below [Package List](#package-list).

## Package List

`TODO: add missing packages`

| Package Name | Dependency                                                 | Android | iOS | Desktop | WasmJs |                  README                  |
|--------------|------------------------------------------------------------|:-------:|:---:|:-------:|:------:|:----------------------------------------:|
| Logger       | br.com.ericksprengel.kmpdry:kmp-dry-url-logger:${kmpDry}   |    ✅    |  ✅  |    ✅    | `TODO` |    [README](kmp-dry-logger/README.md)    |
| Url Launcher | br.com.ericksprengel.kmpdry:kmp-dry-url-launcher:${kmpDry} |    ✅    |  ✅  |    ✅    | `TODO` | [README](kmp-dry-url-launcher/README.md) |
|              |                                                            |         |     |         |        |                                          ||

## Why?

I started a KMP app with Compose Multiplatform, and I noticed that I was coding to each platform source set more than
other multiplatform technologies.

Keep in mind:

- Unified standard library.
- Write one, work everywhere

Manage multiple independent libraries is a mess. With one catalog we are free from conflicts.
Example:

- kmp-dry-url-launcher
- kmp-dry-battery
- kmp-device-info
- kmp-sms

All this libraries should be part of a standard library. In a native app, you never need to install a library to open a
URL, get battery status, send a sms etc. In KMP you can write source sets by platform, but it's better to write once.

It's inspired on:

- [Expo SDK](https://docs.expo.dev/versions/latest/sdk/device/)
- [Flutter standard packages](https://github.com/flutter/packages/tree/main/packages)
- [Android Platform](https://developer.android.com/reference/packages)
- [Apple Apple](https://developer.apple.com/documentation/uikit/app_and_environment)