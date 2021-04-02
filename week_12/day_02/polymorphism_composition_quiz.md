# Polymorphism & Composition Homework - Quiz

# Polymorphism

1. What does the ___word___ 'polymorphism' mean?

        Polymorphism means to have many forms.

2. What does it mean when we apply polymorphism to OO design? Give a simple Java example.

        It means we can give a class multiple types and allow them to be used and use any methods associated with those types.

        Basically when something IS A something.

        For example a car can also be a vehicle so you may refer to a car as (Vehicle car) aswell as (Car car)

3. What can we use to implement polymorphism in Java?

        Abstract and interface classes and inheritance. 

4. How many 'forms' can an object take when using polymorphism?

        As many as we want.

5. Give an example of when you could use polymorphism.

        When you have a Person class as a parent class and two child classes, say a Male class and a Female class. To put them all in an ArrayList you can use the Person type instead of Male type or Female type.


# Composition and Aggregation

6. What do we mean by 'composition' in reference to object-oriented programming?

        Composition refers to classes being connected with a "IS PART OF" association.

        Objects being made up of other objects.

7. When would you use composition? Provide a simple example in Java.

        You would use composition when an object is made up of different things but you have these as seperate objects/classes and the main class could not function without 

        Example: A car class could be made up of various parts. Taking the chassis for example, without it the car could not function.

8. Give a difference between composition and aggregation?

        Composition is when an object has something as part of it and if it wasn't there it couldn't function.
        Aggregation is when an object has something but could still function even without this. Therefore it doesn't depend on it to function.

9. What is/are the advantage(s) of using composition/aggregation?

        The code is split into multiple classes/files which allows you to reuse code. You are also not tied to using all parameters like you are with inheritance. 

        Dry code

10. When using composition, when an object is destroyed, what happens to all the objects it is composed of?

        They are also destroyed.

11. When using aggregation, when an object is destroyed, what happens to all the objects it is composed of?

        They continue to exist.