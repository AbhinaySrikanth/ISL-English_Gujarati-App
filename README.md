# ISL English-Gujarati Translator App 📱🤟

An Android application designed to bridge communication gaps using Indian Sign Language (ISL) for digits and common phrases. This project integrates real-time gesture recognition with translation features, making it easier for users to understand and communicate using ISL in both English and Gujarati languages.

---

## 🚀 Features

- 📷 Real-time camera capture to identify hand gestures (0-9)
- 🤖 Offline gesture recognition using a trained Random Forest model (converted to `.tflite`)
- 🌐 Translation support for both English and Gujarati
- 🎥 Integrated sign image/video viewer for selected gestures
- 🔒 Runtime camera permission handling
- 🧠 Modular architecture with separate files for camera, model, translation logic

---

## 🧠 Machine Learning

- **Algorithm**: Random Forest with 150 decision trees
- **Dataset Split**: 80% training / 20% testing
- **Input Format**: 28x28 grayscale gesture images
- **Output**: Predictions for digits 0–9
- **Model Deployment**: Trained model exported as `.tflite` for integration with Android app

---

## 📁 Project Structure

├── app/
│ ├── java/com/abhinay/ISLEnglishGujaratiApp/
│ │ ├── CameraActivity.kt
│ │ ├── GestureActivity.kt
│ │ ├── Classifier.kt
│ │ ├── TranslationData.kt
│ │ └── ModelInspector.kt
│ ├── res/
│ │ ├── drawable/ ← Contains gesture images (zero.png to nine.png)
│ │ ├── layout/ ← XML layouts (camera_activity.xml, gesture_activity.xml)
│ │ └── raw/ ← Optional: sign videos (if any)
│ └── assets/
│ └── model.tflite ← Trained ML model

yaml
Copy
Edit

---

## 🛠️ How It Works

1. User launches the app and grants camera permission.
2. A gesture is captured using the device camera.
3. The captured image is processed and passed to the classifier.
4. The model predicts the corresponding digit (0-9).
5. The result is mapped to a translation and displayed with visual support.

---

## 📦 Requirements

- Android Studio (Electric Eel or above)
- Android SDK 24+
- Internet not required (runs fully offline)
- Device with CameraX support

---

## 🔧 Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/ISL-English-Gujarati-Translator.git
Open the project in Android Studio.

Place gesture images (zero.png to nine.png) inside the res/drawable folder.

Add the model.tflite file to the assets directory.

Run the app on an emulator or physical device.

📄 License
This project is developed for educational and non-commercial use. All resources (model, translations, code) are created from scratch or adapted under fair use.

🙌 Acknowledgements
CameraX by Android Jetpack

TensorFlow Lite for on-device ML

Gujarati translations adapted for accurate regional representation

👨‍💻 Author
Abhinay Srikanth Khamithkar
Android Developer | Machine Learning Enthusiast
Email: abhinay.khamithkar@example.comh
