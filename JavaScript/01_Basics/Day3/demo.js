console.log("Hello");

var a = undefined;
var b ; // variable is not initialized then we get undefined when we access
var c = null;
console.log(a,b,c);

var salary = null;
console.log(salary);
salary = 93899;
console.log(salary);

var x ;
console.log(x);

// var InputText = prompt("Enter Your Name")
// console.log("Your Name is "+InputText);

// var InputNumber = prompt()
// console.log(InputNumber);
// console.log(InputNumber+123);
// console.log(typeof InputNumber);

// console.log(typeof null);
// console.log(typeof undefined);

// var Name = prompt("Enter Your Name ")
// console.log(Name);
// console.log(typeof Name);

// var Age = Number(prompt("Enter Your Age "))
// console.log(Age , typeof Age);

// if we cancel prompt we get null
var Age = prompt("Enter Your Age ")  // 22 years
console.log(Age , typeof Age);       
// let Num = Number(Age)
// console.log(Num , typeof Num); //typeof Num -> NaN

let Num = parseInt(Age)        //Number should be in starting of string
console.log(Num , typeof Num); //typeof Num -> number
