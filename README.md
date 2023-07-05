# Working-with-Microsoft-Excel-in-Java-Maven
Assignment18 for homework on IT Bootcamp course

Working with Microsoft Excel from Java/Maven:

- Task1: Make a Maven project. Add dependencies for Apache poi and Faker. Manually create an xlsx file that contains 15 numbers (it can be int or double) arranged in 3 rows by 5 (A1-A3, B1-B3…). In this step we write in excel manually not through code. Through code you need to read all the numbers, find the average value of each row, and then write those values to a new sheet in the same excel table.
Example: 1 row: 1, 3, -5, 8, 22, average is 29/5, 2 row: 1, 1, 1, 1, 1, average is 5/5… The new sheet will therefore have values A1 = 29/5, A2 = 5/5…

- Task2: Make a new Maven project. Add dependencies for Apache poi and Faker. Manually create an xlsx file that contains 5 names. In this step we write in excel manually not through code. Through code you need to read, put in an array and print those 5 names, and then add another 5 names using Faker to the same array. After that, you need to write all the names from the list to a new sheet in the same excel table.
Example: Initial appearance of excel sheet: Bilja, Milos, Marko, Ivana, Vladimir. Appearance of new sheet: Bilja, Milos, Marko, Ivana, Vladimir (values from first sheet), Suzana, Marina, Ivan, Aleksandar, Dusan (or another names created by Faker).
