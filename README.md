# README.md

````markdown
# HashMap Frequency Counter in Java

## 📌 Project Overview

This Java program demonstrates how to use the **HashMap** collection to count the frequency of elements in an integer array.

The program stores each unique number as a key in a `HashMap` and its occurrence count as the corresponding value.

---

## 📂 Project Structure

```
HashMapDemo.java
README.md
```

---

## 💻 Technologies Used

- Java
- HashMap (java.util.HashMap)

---

## 📖 How the Program Works

Given the array:

```java
int a[] = {6,7,3,6,8,8,4,4,6,2,6};
```

The program counts how many times each number appears.

Example:

| Number | Frequency |
|---------|-----------|
| 6 | 4 |
| 7 | 1 |
| 3 | 1 |
| 8 | 2 |
| 4 | 2 |
| 2 | 1 |

---

## 🚀 Algorithm

1. Create an empty HashMap.
2. Traverse the array.
3. For every element:
   - If it already exists in the HashMap:
     - Increase its frequency by 1.
   - Otherwise:
     - Insert it with frequency 1.
4. Print every key along with its frequency.

---

## ▶️ Sample Output

```
2 1
3 1
4 2
6 4
7 1
8 2
```

> **Note:** HashMap does not maintain insertion order, so the output order may vary.

---

## 📚 Concepts Covered

- HashMap
- Arrays
- Loops
- Conditional Statements
- Key-Value Pair
- Frequency Counting
- Time Complexity

---

## ⏱ Time Complexity

| Operation | Complexity |
|------------|------------|
| Traversing Array | O(n) |
| HashMap Insert/Search | O(1) Average |
| Total | O(n) |

---

## 💡 Key Methods Used

| Method | Description |
|---------|-------------|
| `put()` | Inserts a key-value pair into the HashMap |
| `get()` | Retrieves the value of a key |
| `containsKey()` | Checks whether a key exists |
| `keySet()` | Returns all keys in the HashMap |

---

## 👨‍💻 Author

Created for learning Java Collections Framework and HashMap.
````

---

# Step-by-Step Explanation

## Step 1: Import HashMap

```java
import java.util.HashMap;
```

This imports the `HashMap` class from the Java Collections Framework.

---

## Step 2: Create the Class

```java
public class HashMapDemo {
```

Defines the Java class.

---

## Step 3: Main Method

```java
public static void main(String[] args)
```

The program starts execution from the `main()` method.

---

## Step 4: Create a HashMap

```java
HashMap<Integer, Integer> map = new HashMap<>();
```

This creates an empty HashMap.

* **Key** → Integer (array element)
* **Value** → Integer (frequency)

Initially:

```
{}
```

---

## Step 5: Create an Array

```java
int a[] = {6,7,3,6,8,8,4,4,6,2,6};
```

Array contains 11 elements.

---

## Step 6: Traverse the Array

```java
for(int i=0;i<a.length;i++)
```

Loop through every element one by one.

---

## Step 7: Store Current Element

```java
int n = a[i];
```

Stores the current array element.

Example:

```
First iteration

n = 6
```

---

## Step 8: Check if Number Exists

```java
if(map.containsKey(n))
```

Checks whether the current number already exists in the HashMap.

---

## Step 9: If Number Exists

```java
int prev = map.get(n);
map.put(n, prev + 1);
```

Retrieve the previous count and increase it by 1.

Example:

Before:

```
6 → 2
```

After:

```
6 → 3
```

---

## Step 10: If Number Doesn't Exist

```java
map.put(n,1);
```

Insert the number into the HashMap with frequency 1.

Example:

```
7 → 1
```

---

## Step 11: Final HashMap

After processing the entire array, the HashMap contains:

| Key | Value |
| --- | ----- |
| 6   | 4     |
| 7   | 1     |
| 3   | 1     |
| 8   | 2     |
| 4   | 2     |
| 2   | 1     |

---

## Step 12: Print the HashMap

```java
for(int val : map.keySet())
{
    System.out.println(val + " " + map.get(val));
}
```

`keySet()` returns all the keys in the HashMap.

For every key:

```java
map.get(val)
```

retrieves its frequency.

Output (order may vary):

```
6 4
7 1
3 1
8 2
4 2
2 1
```

---

# Dry Run

| Element | Action | HashMap                   |
| ------- | ------ | ------------------------- |
| 6       | Insert | {6=1}                     |
| 7       | Insert | {6=1,7=1}                 |
| 3       | Insert | {6=1,7=1,3=1}             |
| 6       | Update | {6=2,7=1,3=1}             |
| 8       | Insert | {6=2,7=1,3=1,8=1}         |
| 8       | Update | {6=2,7=1,3=1,8=2}         |
| 4       | Insert | {6=2,7=1,3=1,8=2,4=1}     |
| 4       | Update | {6=2,7=1,3=1,8=2,4=2}     |
| 6       | Update | {6=3,7=1,3=1,8=2,4=2}     |
| 2       | Insert | {6=3,7=1,3=1,8=2,4=2,2=1} |
| 6       | Update | {6=4,7=1,3=1,8=2,4=2,2=1} |

---

## Final Output

```
6 4
7 1
3 1
8 2
4 2
2 1
```

