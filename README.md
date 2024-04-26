# `School` Assessment One GUI

This Java program, named `AssessmentOneGui`, is a graphical user interface (GUI) application designed to perform various operations on a set of integers entered by the user. Here's an in-depth explanation of its functionality:

## Overview

The `AssessmentOneGui` GUI application allows users to input a specified number of integers and performs several operations on the entered data. It provides a user-friendly interface using Java's Swing library, enabling seamless interaction.

## Features

### Input Number of Integers
- Upon launching the application, the user is prompted to enter the desired number of integers.
- The user clicks the "How many integers?" button to initiate the input process.

### Input Integer Values
- After specifying the number of integers, the user is prompted to enter integer values for each position.
- Input continues until the user enters "s" to stop or fills all positions.

### Operations
- **Print From First to Last**: Displays the entered integers in the order they were input.
- **Print From Last to First**: Displays the entered integers in reverse order.
- **Print Minimum**: Determines and displays the minimum value from the entered integers.
- **Print Maximum**: Determines and displays the maximum value from the entered integers.
- **Print Total**: Calculates and displays the sum of all entered integers.
- **Print Average**: Calculates and displays the average of all entered integers.

## Implementation Details

### GUI Components
- The GUI consists of a single button labeled "How many integers?" to initiate the input process.

### Event Handling
- The button is associated with an ActionListener that triggers the input process when clicked.

### Input Validation
- The application validates user input to ensure only numeric values are accepted.

### Error Handling
- Error handling is implemented to handle invalid input and prevent runtime exceptions.

### Modularization
- The code is modularized into separate methods to improve readability and maintainability.
- Each method is responsible for a specific operation, enhancing code organization.

## Usage
1. Compile and execute the `AssessmentOneGui` Java class.
2. Click the "How many integers?" button.
3. Enter the desired number of integers.
4. Input integer values as prompted.
5. View the results of various operations displayed in dialog boxes.

## Conclusion
The `AssessmentOneGui` GUI application provides a convenient way to input, manipulate, and analyze sets of integers. With its intuitive interface and robust functionality, it serves as a practical tool for users to perform basic mathematical operations on integer data.

For further enhancements, additional features such as error handling for non-integer input and graphical representation of data could be implemented.
