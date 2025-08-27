# 📱 MyITC4204 Android App

A modern Android application built with **Kotlin**, **Jetpack libraries**, and **Material Design 3**.  
This project demonstrates clean UI/UX practices, modular code structure, and smart features like an interactive calculator powered by `exp4j`.

---

## ✨ Features

- 🔢 **Smart Calculator**
  - Handles basic arithmetic (`+ − × ÷`)
  - Expression parsing via [`exp4j`](https://www.objecthunter.net/exp4j/)
  - Error handling for invalid inputs

- 🎨 **Modern UI/UX**
  - Material Design 3 components
  - Responsive layouts
  - Dynamic light & dark mode support

- 🧩 **Architecture**
  - Kotlin + AndroidX
  - Fragments for modular UI
  - Version Catalog (`libs.versions.toml`) for dependency management
 
  ## ✨ Summary
- 🌙 Material Design 3 theme support (Light & Dark mode)
- 🎨 Custom colors and styles (`md_theme_outline`, `md_theme_surface`, `md_theme_primary`)
- 👤 Placeholder assets (`ic_profile_placeholder`, `ic_edit`)
- 🖼️ `CircleImageView` for profile/avatar handling
- 🔐 Authentication-ready architecture
- 📡 API-ready networking layer
- ⚡ Optimized performance with modern Android libraries

---

## 🗂️ Project Structure
```plaintext
MyITC4204/
│
├── app/
│   ├── build.gradle.kts
│   ├── proguard-rules.pro
│   │
│   ├── src/
│   │   ├── main/
│   │   │   ├── AndroidManifest.xml
│   │   │   │
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── ysddesigns/
│   │   │   │           └── myitc4204/
│   │   │   │               ├── MainActivity.kt
│   │   │   │               ├── SplashScreen.kt
│   │   │   │               │
│   │   │   │               ├── ui/
│   │   │   │               │   ├── home/
│   │   │   │               │   │   └── HomeFragment.kt
│   │   │   │               │   ├── calculator/
│   │   │   │               │   │   └── CalculatorFragment.kt
│   │   │   │               │   ├── product/
│   │   │   │               │   │   └── ProductFragment.kt
│   │   │   │               │   ├── profile/
│   │   │   │               │   │   └── ProfileFragment.kt
│   │   │   │               │   └── adapters/
│   │   │   │               │       └── UsersAdapter.kt
│   │   │   │               │
│   │   │   │               └── models/
│   │   │   │                   └── User.kt
│   │   │   │
│   │   │   ├── res/
│   │   │   │   ├── drawable/
│   │   │   │   │   ├── ic_profile_placeholder.xml
│   │   │   │   │   ├── ic_edit.xml
│   │   │   │   │   └── circle_image_view.xml
│   │   │   │   │
│   │   │   │   ├── font/
│   │   │   │   │   └── montserrat_regular.ttf
│   │   │   │   │
│   │   │   │   ├── layout/
│   │   │   │   │   ├── fragment_home.xml
│   │   │   │   │   ├── fragment_calculator.xml
│   │   │   │   │   ├── fragment_product.xml
│   │   │   │   │   ├── fragment_profile.xml
│   │   │   │   │   ├── activity_main.xml
│   │   │   │   │   └── item_user.xml
│   │   │   │   │
│   │   │   │   ├── values/
│   │   │   │   │   ├── colors.xml        # md_theme_outline, md_theme_surface, md_theme_primary
│   │   │   │   │   ├── strings.xml
│   │   │   │   │   └── styles.xml
│   │   │   │   │
│   │   │   │   └── mipmap/
│   │   │   │       └── ic_launcher.png
│   │   │   │
│   │   │   └── kotlin/
│   │   │       └── (if you add Kotlin DSL extensions/helpers)
│   │   │
│   │   ├── test/               # Unit tests
│   │   └── androidTest/        # Instrumented tests
│   │
│   └── build/
│
├── gradle/
│   └── wrapper/
│       ├── gradle-wrapper.properties
│       └── gradle-wrapper.jar
│
├── build.gradle.kts
├── settings.gradle.kts
└── README.md

```

## 🚀 Getting Started

### Prerequisites
- [Android Studio Giraffe or newer](https://developer.android.com/studio)
- JDK 17+
- Gradle 8+

### Clone the Repository
```bash
git clone https://github.com/your-username/myitc4204-android.git
cd myitc4204-android
