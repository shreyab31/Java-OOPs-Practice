import pyttsx3 # pip install pyttsx3
import speech_recognition as sr # pip install speechRecognition
import datetime
import wikipedia # pip install wikipedia
import webbrowser
import os
import sys
import time
import smtplib

engine = pyttsx3.init('sapi5')
voices = engine.getProperty('voices')
# print(voices[0].id)  # voices[0] is for male and voices[1] is for female
engine.setProperty('voice', voices[1].id)  # Set male voice


def speak(audio):
    engine.say(audio)
    engine.runAndWait()


def wishMe():
    hour = int(datetime.datetime.now().hour)
    if hour >= 0 and hour < 12:
        speak("Good Morning!")
    elif hour >= 12 and hour < 18:
        speak("Good Afternoon!")
    else:
        speak("Good Evening!")

    speak("Please tell me how may I help you")


def takeCommand():
    # It takes microphone input from the user and returns string output
    r = sr.Recognizer()
    with sr.Microphone() as source:
        print("Listening...")
        r.pause_threshold = 1
        audio = r.listen(source)
    try:
        print("Recognizing...")
        query = r.recognize_google(audio, language='en-in')
        print(f"User said: {query}\n")
    except Exception as e:
        # print(e)
        print("Can you say that again please...")
        speak("Can you say that again please")
        return "None"
    return query


if __name__ == "__main__":
    wishMe()
    while True:
        query = takeCommand().lower()

        # Logic for executing tasks based on query
        if 'wikipedia' in query:
            speak('Searching Wikipedia...')
            query = query.replace("wikipedia", "")
            results = wikipedia.summary(query, sentences=2)
            speak("According to Wikipedia")
            print(results)
            speak(results)

        elif 'open youtube' in query:
            webbrowser.open("youtube.com")

        elif 'open google' in query:
            webbrowser.open("google.com")

        elif 'open leetcode' in query:
            webbrowser.open("leetcode.com")

        elif 'open news' in query:
            webbrowser.open("bbc.com")
            print("Here are some headlines from BBC news, reading!")
            speak("Here are some headlines from BBC news, reading!")

        elif 'play music' in query:
            music_dir = "C:\\Users\\shrey\\Music"
            songs = os.listdir(music_dir)
            print(songs)
            os.startfile(os.path.join(music_dir, songs[0]))

        elif 'the time' in query:
            strTime = datetime.datetime.now().strftime("%H:%M:%S")
            speak(f"The time is {strTime}")

        elif 'goodbye' in query:
            speak("Goodbye! Have a nice day")
            print("Goodbye! Have a nice day")
            time.sleep(2)
            sys.exit()
