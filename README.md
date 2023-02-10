

# Introduction

This project demonstrates how katalon studio helps users to automate Canvas applications. Canvas is something a bit tricky to automate so this project contains some of the test cases for Canvas.

# Canvas

A canvas is a rectangular area on an HTML page, and it is specified with the <canvas> element in HTML 5. 

All the objects inside the canvas can not be accessible via DOM(Xpath/CSS/Property) because of the limited access to DOM users have to find the coordinates for the objects before performing the actions.

![image](https://user-images.githubusercontent.com/84115288/218056204-eb7b4f83-fc96-4751-9f38-49821534018c.png)


# Requirements

* Katalon Studio
* Coordinates Plugin- https://chrome.google.com/webstore/detail/coordinates/bpflbjmbfccblbhlcmlgkajdpoiepmkd (optional)

# Use case
We have two different application which we have used for our sample project

* Online calculator **(https://www.online-calculator.com//html5/simple/index.php?v=10)**

* Kitchen application **(https://kitchen.applitools.com/ingredients/canvas)**

# Test Steps

* We are performing calculations (1+8=9) on the calculator.

* Open the Web application with Canvas.

* Capture the Canvas Object.

* Find the Coordinates for the Targeted Object inside the Canvas. 

* Perform the action. 


# How to automate
* Canvas application is completely working on coordinates.

* User have to find the coordinates for the object

* Write a test script by using object coordinates.

* Run the test script on the browser.

* Verify the test result.

**Repository for the Sample Project:**
https://github.com/katalon-studio-samples/katalon-canvas-sample.git

Thanks.
