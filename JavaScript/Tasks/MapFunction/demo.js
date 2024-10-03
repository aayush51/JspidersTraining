// ### Task 1: Double the Numbers
// Write a function that takes an array of numbers and returns a new array with each number doubled.

// **Input:** `[1, 2, 3, 4, 5]`  
// **Output:** `[2, 4, 6, 8, 10]`

let numbers = [1, 2, 3, 4, 5]
console.log(numbers);
let doubleNum = numbers.map(val => val * 2)
console.log(doubleNum);



// ### Task 2: Convert Temperatures
// Given an array of temperatures in Celsius, use `map()` to convert them to Fahrenheit.

// **Formula:** `F = (C × 9/5) + 32`
// **Input:** `[0, 10, 20, 30]`
// **Output:** `[32, 50, 68, 86]`

let celsius = [0, 10, 20, 30]
let fahrenheit = celsius.map(val => (val * 9 / 5) + 32)
console.log(fahrenheit);



// ### Task 3: Add 'Hello' to Each Name
// You have an array of names. Use `map()` to return a new array where each name is prefixed with "Hello".

// **Input:** `["Alice", "Bob", "Charlie"]`
// **Output:** `["Hello Alice", "Hello Bob", "Hello Charlie"]`

let names = ["Alice", "Bob", "Charlie"]
let greets = names.map(val => `Hello ${val}`)
console.log(greets);



// ### Task 4: Extract Property Values
// You have an array of objects representing users. Use `map()` to return an array of just the usernames.

// **Input:** `[{ name: "Alice", age: 25 }, { name: "Bob", age: 30 }]`
// **Output:** `["Alice", "Bob"]`

let dataObj = [{ name: "Alice", age: 25 }, { name: "Bob", age: 30 }]
let usernames = dataObj.map(val => val.name)
console.log(usernames);



// ### Task 5: Square the Numbers
// Write a function that squares each number in an array and returns the new array using `map()`.

// **Input:** `[2, 3, 4]`
// **Output:** `[4, 9, 16]`

let numbersArr = [2, 3, 4]
let squares = numbersArr.map(val => val ** 2)
console.log(squares);



// ### Task 6: Create HTML List Items
// Given an array of product names, use `map()` to return a new array of HTML `<li>` elements for each product.

// **Input:** `["Apples", "Oranges", "Bananas"]`
// **Output:** `["<li>Apples</li>", "<li>Oranges</li>", "<li>Bananas</li>"]`

let fruitNames = ["Apples", "Oranges", "Bananas"]
let fruitList = fruitNames.map(val => `<li>${val}</li>`)
console.log(fruitList);



// ### Task 7: Add Tax to Prices
// You have an array of product prices. Use `map()` to return a new array where each price includes 15% tax.

// **Input:** `[100, 200, 300]`
// **Output:** `[115, 230, 345]`

let prices = [100, 200, 300]
let taxedPrices = prices.map(val => val + (val * 0.15))
console.log(taxedPrices);



// ### Task 8: Convert Strings to Numbers
// You have an array of strings representing numbers. Use `map()` to convert them into actual numbers.

// **Input:** `["1", "2", "3"]`
// **Output:** `[1, 2, 3]`

let stringNumbers = ["1", "2", "3"]
let numNumbers = stringNumbers.map(val => Number(val))
console.log(numNumbers);