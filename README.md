<p align="center">
<img alt="AndroidInterviewQuestions" src="https://raw.githubusercontent.com/MindorksOpenSource/android-interview-questions/master/assets/android_interview_questions.png">
</p>


# Android Interview Questions
[![Mindorks](https://img.shields.io/badge/mindorks-opensource-blue.svg)](https://mindorks.com/open-source-projects)
[![Mindorks Community](https://img.shields.io/badge/join-community-blue.svg)](https://mindorks.com/join-community)
> Android Interview Questions - Your Cheat Sheet For Android Interview

## We will be adding answers to the more questions on our [Mindorks website](https://mindorks.com).

## Prepared and maintained by [Amit Shekhar](https://github.com/amitshekhariitbhu) who is having experience of taking interviews of many Android developers and cracking interviews of top companies.

## Contents
 * [Data Structures And Algorithms](#data-structures-and-algorithms)
 * [Core Java](#core-java)
 * [Core Android](#core-android)
 * [Architecture](#architecture)
 * [Design Problem](#design-problem)
 * [Tools And Technologies](#tools-and-technologies)
 * [Android Test Driven Development](#android-test-driven-development)
 * [Others](#others)


### Data Structures And Algorithms

> The level of questions asked on the topic of Data Structures And Algorithms totally depends on the company for which you are applying.

* Array
    - An Array consists of a group of elements of the same data type. It is stored continuously in memory and by using its' index, you can find the underlying data. Arrays can be one dimensional and multi-dimensional. One dimensional array is the simplest data structure, and also most commonly used. It is worth noting that in Java language multi-dimensional array are implemented as arrays of arrays. For example, int[10][5] is actually one array with its' cells pointing to ten 5-element arrays.    

        | Algorithm | Average | Worst Case |
        |:---------:|:-------:|:----------:|
        | Space     | Θ(n)    | O(n)       |    
        | Search    | Θ(n)    | O(n)       |
        | Insert    | Θ(n)    | O(n)       |
        | Delete    | Θ(n)    | O(n)       |

* LinkedList
    - A LinkedList, just like a tree and unlike an array, consists of a group of nodes which 
    together represent a sequence. Each node contains data and a pointer. The data in a node can be 
    anything, but the pointer is a reference to the next item in the LinkedList. A LinkedList 
    contains both a head and a tail. The "Head" is the first item in the LinkedList, while the "Tail" is 
    the last item. It is not a circular data structure, therefore the tail does not have its' 
    pointer pointing at the Head - the pointer is just NULL. The run time complexity for each of 
    the base methods are as follows:

        | Algorithm | Average | Worst Case |
        |:---------:|:-------:|:----------:|
        | Space     | Θ(n)    | O(n)       |
        | Search    | Θ(n)    | O(n)       |
        | Insert    | Θ(1)    | O(1)       |
        | Delete    | Θ(1)    | O(1)       |

* DoublyLinkedList
   - A DoublyLinkedList is based on a LinkedList, but there is two pointers in each node, "previous" pointer holds reference to the previous node and "next" pointer holds reference to the next node. It also has a Head node, head node's next pointer references the first node in this DoublyLinkedList. The last node's "next" reference points to NULL, but if last node's next pointer points to the first node, such DoublyLinkedList is called "Circular DoublyLinkedList". This data structure is very convenient if you need to be able to traverse stored elements in both directions. 
  
       ![DoublyLinkedList](https://upload.wikimedia.org/wikipedia/commons/thumb/5/5e/Doubly-linked-list.svg/610px-Doubly-linked-list.svg.png)
            
        | Algorithm | Average | Worst Case |
        |:---------:|:-------:|:----------:|
        | Space     | Θ(n)    | O(n)       |
        | Search    | Θ(n)    | O(n)       |
        | Insert    | Θ(1)    | O(1)       |
        | Delete    | Θ(1)    | O(1)       |
* Stack
    - A Stack is a basic data structure with a "Last-in-First-out" (LIFO) semantics. This means that 
    the last item that was added to the stack is the first item that comes out of the stack. A 
    Stack is like a stack of books in that in order to get to the first book that was added in the stack 
    (the bottom book), all of the books that were added after need to be removed first. Adding to a 
    Stack is called "Push", removing from a stack is called "Pop", and getting the last item 
    inserted into the stack without removing it is called "Top". [The most common way to implement a
     stack is by using a LinkedList, but there is also StackArray (implemented with an array) 
     which does not replace null entries, and there is also a Vector implementation that does 
     replace null entries.](https://en.wikibooks.org/wiki/Data_Structures/Stacks_and_Queues#Performance_Analysis)
     
        <table>
            <tr>
                <th>Algorithm</th>
                <th>Average</th>
                <th>Worst Case</th>
                <th>Image representation</th>
            </tr>
            <tr>
                <td>Space</td>
                <td>Θ(n)</td>
                <td>O(n)</td>
                <td rowspan="5">
                    <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/2/29/Data_stack.svg/250px-Data_stack.svg.png"/>
                </td>
            </tr>
            <tr>
                <td>Search</td>
                <td>Θ(n)</td>
                <td>O(n)</td>
            </tr>
            <tr>
                <td>Insert (Push)</td>
                <td>Θ(1)</td>
                <td>O(1)</td>
            </tr>
            <tr>
                <td>Delete (Pop)</td>
                <td>Θ(1)</td>
                <td>O(1)</td>
            </tr>
            <tr>
              <td>Top</td>
              <td>Θ(1)</td>
              <td>O(1)</td>
            </tr>
        </table>
* Queue
* PriorityQueue
* Dynamic Programming
* String Manipulation
* Binary Tree
* Binary Search Tree
* Sorting Algorithms
* Hash Table or Hash Map
* Breadth First Search
* Depth First Search
* Greedy Algorithm


### Core Java

* Explain OOP Concepts.
    - Object-Oriented Programming is a methodology of designing a program using classes, objects, 
    [inheritance](https://en.wikipedia.org/wiki/Inheritance_(object-oriented_programming)),
    [polymorphism](https://en.wikipedia.org/wiki/Polymorphism_(computer_science)),
    [abstraction](https://en.wikipedia.org/wiki/Abstraction_(software_engineering)), and
    [encapsulation](https://en.wikipedia.org/wiki/Encapsulation_(computer_programming)).
* Differences between abstract classes and interfaces? [link](https://arjun-sna.github.io/java/2017/02/02/abstractvsinterface/)
    - An abstract class, is a class that contains both concrete and abstract methods 
    (methods without implementations). An abstract method must be implemented by the abstract class
     sub-classes. Abstract classes cannot be instantiated and need to be extended to be used.
    - An interface is like a blueprint/contract of a class (or it may be thought of as a class with methods, but without their implementation). It contains empty methods that 
    represent, what all of its subclasses should have in common. The subclasses provide the 
    implementation for each of these methods. Interfaces are implemented.
* What is serialization? How do you implement it?
    - Serialization is the process of converting an object into a stream of bytes in order to store 
    an object into memory, so that it can be recreated at a later time, while still keeping the 
    object's original state and data. In Android you may use either the Serializable, Externalizable (implements Serializable) or Parcelable interfaces.
    While Serializable is the easiest to implement, Externalizable may be used if you need to insert custom logic into the process of serialization (although it is almost never used nowadays as it is considered a relic from early versions of Java). But it is highly recommended to use Parcelable in Android 
    instead, as Parcelable was created exclusively for Android and it performs about 10x faster than Serializable,
    because Serializable uses reflection, which is a slow process and tends to create a lot of
    temporary objects and it may cause garbage collection to occur more often.

    To use Serializable all you have to do is implement the interface.

    Serializable Example:

    ```java
        /**
         *  Implementing the Serializeable interface is all that is required
         */
        public class User implements Serializable {

            private String name;
            private String email;

            public User() {
            }

            public String getName() {
                return name;
            }

            public void setName(final String name) {
                this.name = name;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(final String email) {
                this.email = email;
            }
        }
    ```

    Parcelable requires a bit more work.

    Parcelable Example:

    ```java
        public class User implements Parcelable {

            private String name;
            private String email;

            /**
             * Interface that must be implemented and provided as a public CREATOR field that generates
             * instances of your Parcelable class from a Parcel.
             */
            public static final Creator<User> CREATOR = new Creator<User>() {
                /**
                 * Creates a new USer object from the Parcel. This is the reason why the constructor that
                 * takes a Parcel is needed.
                 */
                @Override
                public User createFromParcel(Parcel in) {
                    return new User(in);
                }

                /**
                 * Create a new array of the Parcelable class.
                 * @return an array of the Parcelable class, with every entry initialized to null.
                 */
                @Override
                public User[] newArray(int size) {
                    return new User[size];
                }
            };

            public User() {
            }

            /**
             * Parcel overloaded constructor required for Parcelable implementation used in the CREATOR
             */
            private User(Parcel in) {
                name = in.readString();
                email = in.readString();
            }

            public String getName() {
                return name;
            }

            public void setName(final String name) {
                this.name = name;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(final String email) {
                this.email = email;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            /**
             * This is where the parcel is performed.
             */
            @Override
            public void writeToParcel(final Parcel parcel, final int i) {
                parcel.writeString(name);
                parcel.writeString(email);
            }
        }

    ```

    Note: For a full explanation of the <b>describeContents()</b> method see <a href="https://stackoverflow.com/questions/4076946/parcelable-where-when-is-describecontents-used/4914799#4914799">HERE</a>.
    In Android Studio, you can have all of the parcelable code auto generated for you, but like with everything else, it is always a good thing to try and understand everything that is happening.

* What is Singleton class?
    - A singleton is a class that can only be instantiated once. [This singleton pattern restricts 
    the instantiation of a class to one object. This is useful when exactly one object is needed 
    to coordinate actions across the system. The concept is sometimes generalized to systems 
    that operate more efficiently when only one object exists, or that restrict the instantiation 
    to a certain number of objects.](https://en.wikipedia.org/wiki/Singleton_pattern)
* What are anonymous classes?
* What is the difference between using `==` and `.equals` on a string?
* What is the `hashCode()` and `equals()` used for?
* What are these `final`, `finally` and `finalize`?
* What is memory leak and how does Java handle it?
* What is garbage collector? How does it work?
  - All objects are allocated on the heap area managed by the JVM. 
  As long as an object is being referenced, the JVM considers it alive. 
  Once an object is no longer referenced and therefore is not reachable by the application code,
  the garbage collector removes it and reclaims the unused memory.
* `Arrays` vs `ArrayLists`.
* `HashSet` vs `TreeSet`.
* Typecast in Java.
* Difference between method overloading and overriding.
<p align="center">
<img alt="Overloading and Overriding" src="https://github.com/codeshef/android-interview-questions/blob/master/assets/overloading-vs-overriding.png">
</p>
Overloading happens at compile-time while Overriding happens at runtime: The binding of overloaded method call to its definition has happens at compile-time however binding of overridden method call to its definition happens at runtime.

More info on static vs. dynamic binding: <a href="https://stackoverflow.com/questions/19017258/static-vs-dynamic-binding-in-java">StackOverflow</a>.

Static methods can be overloaded which means a class can have more than one static method of same name. Static methods cannot be overridden, even if you declare a same static method in child class it has nothing to do with the same method of parent class as overridden static methods are chosen by the reference class and not by the class of the object.

So, for example:

```java
public class Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
}

public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.testClassMethod();
        Animal myAnimal = myCat;
        myAnimal.testClassMethod();
        myAnimal.testInstanceMethod();
    }
}
```
Will output: 
```
The static method in Cat    // testClassMethod() is called from "Cat" reference

The static method in Animal // testClassMethod() is called from "Animal" reference, 
                            // ignoring actual object inside it (Cat)
                            
The instance method in Cat  // testInstanceMethod() is called from "Animal" reference,
                            // but from "Cat" object underneath
```

The most basic difference is that overloading is being done in the same class while for overriding base and child classes are required. Overriding is all about giving a specific implementation to the inherited method of parent class.

Static binding is being used for overloaded methods and dynamic binding is being used for overridden/overriding methods.
Performance: Overloading gives better performance compared to overriding. The reason is that the binding of overridden methods is being done at runtime through reflection.

Private and final methods can be overloaded but they cannot be overridden. It means a class can have more than one private/final methods of same name but a child class cannot override the private/final methods of their base class.

Return type of method does not matter in case of method overloading, it can be same or different. However in case of method overriding the overriding method can have more specific return type (meaning if, for example, base method returns an instance of Number class, all overriding methods can return any class that is extended from Number, but not a class that is higher in the hierarchy, like, for example, Object is in this particular case).

Argument list should be different while doing method overloading. Argument list should be same in method Overriding.
It is also a good practice to annotate overridden methods with `@Override` to make the compiler be able to notify you if child is, indeed, overriding parent's class method during compile-time.

* What are the access modifiers you know? What does each one do?
   There are four access modifiers in Java language (from strictest to the most lenient):
   1. `private` *variables*, *methods*, *constructors* or *inner classes* are only visible to its' containing class and its' methods. This modifier is most commonly used, for example, to allow variable access only through getters and setters or to hide underlying implementation of classes that should not be used by user and therefore maintain encapsulation. Singleton constructor is also marked `private` to avoid unwanted instantiation from outside.
   2. `protected` can be used on *variables*, *methods* and *constructors* therefore allowing access only to subclasses and classes that are inside the same package as protected members' class.
   3. Default (no keyword is used) this modifier can be applied to *classes*, *variables*, *constructors* and *methods* and allows access from classes and methods inside the same package.
   4. `public` modifier is widely-used on *classes*, *variables*, *constructors* and *methods* to grant access from any class and method anywhere. It should not be used everywhere as it implies that data marked with `public` is not sensitive and can not be used to harm the program.

* Can an Interface extend another Interface?
* What does the `static` word mean in Java?
    - In case of `static` variable it means that this variable (its' value or the object it references) spans across all instances of encapsulating class (changing it in one instance affects all others), while in case of `static` methods it means that these methods can be invoked without an instance of their encapsulating class. It is useful, for example, when you create util classes that need not be instantiated every time you want to use them.
* Can a `static` method be overridden in Java?
    - While child class can override a static method with another static method with the same signature (return type can be downcasted), it is not truly overridden - it becomes "hidden", but both methods can still be accessed under right circumstances (see question about overloading/overriding above).
* What is Polymorphism? What about Inheritance?
* What is the difference between an Integer and int?
    - `int` is a primitive data type (with `byte`, `short`, `long`, `float` and `double`), while `Integer` (with `Byte`, `Short`,`Long`, `Float` and `Double`) is a [wrapper](https://docs.oracle.com/javase/tutorial/java/data/numberclasses.html) class that encapsulates primitive data type, while providing useful methods to perform different tasks with it.
* Do objects get passed by reference or value in Java? Elaborate on that.
* What is a ThreadPoolExecutor? [Link](https://blog.mindorks.com/threadpoolexecutor-in-android-8e9d22330ee3)
* What the difference between local, instance and class variables?
* What is reflection? [Link](http://tutorials.jenkov.com/java-reflection/index.html)
* What are strong, soft and weak references in Java?
* What is dependency injection? Can you name few libraries? Have you used any?
* What does the keyword `synchronized` mean?
* What does it means to say that a `String` is immutable?
* What are `transient` and `volatile` modifiers?
* What is the `finalize()` method?
* How does the `try{}finally{}` works?
* What is the difference between instantiation and initialization of an object?
* When is a `static` block run?
* Explain Generics in Java?
* Difference between `StringBuffer` and `StringBuilder`?
* How is a `StringBuilder` implemented to avoid the immutable string allocation problem?
* What is Autoboxing and Unboxing?
* What’s the difference between an Enumeration and an Iterator?
* What is the difference between fail-fast and fail safe in Java?
* What is Java priority queue?
* What are the design patterns? [Link](https://github.com/iluwatar/java-design-patterns)


### Core Android

* Explain activity lifecycle.
* Tell all the Android application components.
* Service vs IntentService. [Link](https://stackoverflow.com/a/15772151/5153275)
* What is the structure of an Android Application?
* How to persist data in an Android app?
* How would you perform a long-running operation in an application?
* How would you communicate between two Fragments?
* Explain Android notification system?
* How can two distinct Android apps interact?
* What is Fragment?
* Why is it recommended to use only the default constructor to create a fragment? [Link](https://stackoverflow.com/a/16042750/2809326)
* Why Bundle class is used for data passing and why cannot we use simple Map data structure
* Explain the lifecycle of a Fragment. [Link](https://www.techsfo.com/blog/wp-content/uploads/2014/08/complete_android_fragment_lifecycle.png)
* What is Dialog in Android?
* What is View in Android?
* Can you create custom views? How?
* What are ViewGroups and how they are different from the views?
* What is the difference between a fragment and an activity? Explain the relationship between the two.
* What is the difference between Serializable and Parcelable? Which is the best approach in Android?
* What are "launch modes"? [Link](https://blog.mindorks.com/android-activity-launchmode-explained-cbc6cf996802)
* What are Intents? [Link](https://stackoverflow.com/questions/6578051/what-is-an-intent-in-android)
* What is an Implicit Intent?
* What is an Explicit Intent?
* What is an AsyncTask?
* What is a BroadcastReceiver? [Link](https://stackoverflow.com/questions/5296987/what-is-broadcastreceiver-and-when-we-use-it)
* What is a LocalBroadcastManager? [Link](https://developer.android.com/reference/android/support/v4/content/LocalBroadcastManager.html)
* What is a JobScheduler? [Link](http://www.vogella.com/tutorials/AndroidTaskScheduling/article.html)
* What is DDMS and what can you do with it?
* What is the support library? Why was it introduced?[Link](http://martiancraft.com/blog/2015/06/android-support-library/)
* What is a ContentProvider and what is it typically used for?
* What is Android Data Binding? [Link](https://developer.android.com/topic/libraries/data-binding/index.html)
* What are Android Architecture Components? [Link](https://developer.android.com/topic/libraries/architecture/index.html)
* What is ADB?
* What is ANR? How can the ANR be prevented?
* What is `AndroidManifest.xml`?
* Describe how broadcasts and intents work to be able to pass messages around your app?
* How do you handle `Bitmaps` in Android as it takes too much memory?
* What are different ways to store data in your Android app?
* What is the Dalvik Virtual Machine?
* What is the relationship between the life cycle of an AsyncTask and an Activity? What problems can this result in? How can these problems be avoided?
* What is the function of an intent filter?
* What is a Sticky Intent? [Link](http://www.androidinterview.com/what-is-a-sticky-intent/)
* What is AIDL? Enumerate the steps in creating a bounded service through AIDL.
* What are the different protection levels in permission?
* How would you preserve Activity state during a screen rotation? [Link](https://stackoverflow.com/questions/3915952/how-to-save-state-during-orientation-change-in-android-if-the-state-is-made-of-m)
* Relative Layout vs Linear Layout.
* How to implement XML namespaces?
* Difference between `View.GONE` and `View.INVISIBLE`?
* What is the difference between a regular bitmap and a nine-patch image?
* Tell about the bitmap pool. [Link](https://blog.mindorks.com/how-to-use-bitmap-pool-in-android-56c71a55533c)
* How to avoid memory leaks in Android?
* What are widgets on Home-Screen in Android?
* What is AAPT?
* How do you find memory leaks in Android applications?
* How do you troubleshoot a crashing application?
* Why should you avoid to run non-ui code on the main thread?
* How did you support different types of resolutions?
* What is Doze? What about App Standby?
* What can you use for background processing in Android?
* What is ORM? How does it work?
* What is a Loader?
* What is the NDK and why is it useful?
* What is the StrictMode? [Link](https://blog.mindorks.com/use-strictmode-to-find-things-you-did-by-accident-in-android-development-4cf0e7c8d997)
* What is Lint? What is it used for?
* What is a `SurfaceView`?
* What is the difference between `ListView` and `RecyclerView`?
* What is the ViewHolder pattern? Why should we use it?
* What is a PendingIntent?
* Can you manually call the Garbage collector?
* What is the best way to update the screen periodically?
* What are the different types of Broadcasts?
* Have you developed widgets? Describe. [Link](https://blog.mindorks.com/android-widgets-ad3d166458d3)
* What is Context? How is it used? [Link](https://medium.com/p/understanding-context-in-android-application-330913e32514)
* Do you know what is the view tree? How can you optimize its depth?
* What is the `onTrimMemory` method?
* Is it possible to run an Android app in multiple processes? How?
* How does the OutOfMemory happens?
* What is a `spannable`?
* What is `overdraw`? [Link](https://developer.android.com/topic/performance/rendering/overdraw.html)
* What is renderscript? [Link](https://blog.mindorks.com/comparing-android-ndk-and-renderscript-1a718c01f6fe)
* What are the differences between Dalvik and ART?
* FlatBuffers vs JSON. [Link](https://blog.mindorks.com/why-consider-flatbuffer-over-json-2e4aa8d4ed07)
* What are Annotations? [Link](https://blog.mindorks.com/creating-custom-annotations-in-android-a855c5b43ed9), [Link](https://blog.mindorks.com/improve-your-android-coding-through-annotations-26b3273c137a)
* Tell about Constraint Layout [Link](https://blog.mindorks.com/using-constraint-layout-in-android-531e68019cd)
* `HashMap`, `ArrayMap` and `SparseArray` [Link](https://blog.mindorks.com/android-app-optimization-using-arraymap-and-sparsearray-f2b4e2e3dc47)
* Explain Looper, Handler and HandlerThread. [Link](https://blog.mindorks.com/android-core-looper-handler-and-handlerthread-bd54d69fe91a)
* How to reduce battery usage in an android application? [Link](https://blog.mindorks.com/battery-optimization-for-android-apps-f4ef6170ff70)
* What is `SnapHelper`? [Link](https://blog.mindorks.com/using-snaphelper-in-recyclerview-fc616b6833e8)
* How to handle multi-touch in android [link](https://arjun-sna.github.io/android/2016/07/20/multi-touch-android/)


### Architecture

* Describe the architecture of your last app.
* Describe MVP. [Link](https://blog.mindorks.com/essential-guide-for-designing-your-android-app-architecture-mvp-part-1-74efaf1cda40)
* What is presenter?
* What is model?
* Describe MVC.
* What is controller?
* Describe MVVM. [Link](https://github.com/MindorksOpenSource/android-mvvm-architecture)
* Tell something about clean code [Link](https://blog.mindorks.com/every-programmer-should-read-this-book-6755dedec78d)


### Design Problem

* Design Uber App.
* Design Facebook App.
* Design Facebook Near-By Friends App.
* Design WhatsApp.
* Design SnapChat.
* Design problems based on location based app.


### Tools And Technologies

* Git. [Link](https://github.com/git-tips/tips)
* RxJava. [Link](https://blog.mindorks.com/a-complete-guide-to-learn-rxjava-b55c0cea3631)
* Dagger 2. [Link](https://medium.com/p/a-complete-guide-to-learn-dagger-2-b4c7a570d99c)
* Android Development Useful Tools. [Link](https://blog.mindorks.com/android-development-useful-tools-fd73283e82e3)
* Firebase. [Link](https://firebase.google.com/)


### Android Test Driven Development

* What is Espresso? [Link](https://developer.android.com/training/testing/ui-testing/espresso-testing.html)
* What is Robolectric? [Link](http://robolectric.org/)
* What is UI-Automator? [Link](https://developer.android.com/training/testing/ui-testing/uiautomator-testing.html)
* Explain unit test.
* Explain instrumented test.
* Have you done unit testing or automatic testing?
* Why Mockito is used? [Link](http://site.mockito.org/)
* Describe JUnit test.


### Others

* Describe how REST APIs work.
* Describe SQLite.
* Describe database.
* Project Management tool - trello, basecamp, kanban, jira, asana.
* About build System - gradle, ant, buck. 
* Reverse Engineering an APK.
* What is proguard used for?
* What is obfuscation? What is it used for? What about minification?
* How do you build your apps for release?
* How do you control the application version update to specific number of users?
* Can we identify users who have uninstalled our application?
* APK Size Reduction. [Link](https://blog.mindorks.com/how-to-reduce-apk-size-in-android-2f3713d2d662)
* Android Development Best Practices. [Link](https://blog.mindorks.com/android-development-best-practices-83c94b027fd3)
* Android Code Style And Guidelines. [Link](https://blog.mindorks.com/android-code-style-and-guidelines-d5f80453d5c7)
* Have you tried Kotlin? [Link](https://medium.com/p/why-you-must-try-kotlin-for-android-development-e14d00c8084b)
* What are the metrics that you should measure continuously while android application development? [Link](https://blog.mindorks.com/android-app-performance-metrics-a1176334186e)


### Found this project useful :heart:
* Support by clicking the :star: button on the upper right of this page. :v:

[Check out Mindorks awesome open source projects here](https://mindorks.com/open-source-projects)


### License
```
   Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```

### Contributing to Android Interview Questions
Just make pull request. You are in!
