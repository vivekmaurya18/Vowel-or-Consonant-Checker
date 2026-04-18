# 🔤 Vowel or Consonant Checker (Java)

## 📌 Description

This Java program checks whether a given alphabet is a **vowel** or a **consonant** using a `switch` statement.

The user enters a character, and the program determines its type based on predefined vowel cases.

---

## ⚙️ How It Works

* Takes input from the user using `Scanner`
* Extracts the first character from the input
* Uses a `switch` statement:

  * `'a'`, `'e'`, `'i'`, `'o'`, `'u'` → **Vowel**
  * Default → **Consonant**

---

## 🚀 Features

* Simple and beginner-friendly
* Uses `switch-case` logic
* Demonstrates fall-through concept in Java
* Easy to understand and modify

---

## 🖥️ Sample Output

```
Enter any alphabet
a
Vowel
```

```
Enter any alphabet
z
Consonant
```

---

## ⚠️ Limitations

* Works only for lowercase letters
* Does not validate invalid input (numbers, symbols)

---

## 📚 Concepts Used

* Scanner class
* switch-case statement
* Character input handling

---

## 📈 Future Improvements

* Support uppercase letters using `Character.toLowerCase()`
* Add input validation
* Handle multiple characters
