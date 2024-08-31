//NaN 

// console.log("10a"-100);
// console.log("10a"*100);
// console.log("10a"/100);
// console.log("10a"%100);
// console.log(10 - undefined);
// console.log(10 + undefined);
// console.log(10 * undefined);
// console.log(undefined + undefined);
// console.log("str"-"str1");
// console.log(false/0);
// console.log(true/0);
// console.log(`${100} q`-422);
// console.log(Number(undefined));
// console.log(Number("hello"));
// console.log(Number("10pp"));
// console.log(parseInt("pp10pp"));
// var inp = prompt("ENTER A NUMBER ");
// console.log("hello"-inp);



//Symbol    - we use Symbol() constructor to declare symbol 

// var a = "hello"     //both var a and var b have same memory location
// var b = "hello"
// console.log(a == b);
// console.log(a === b);
// a = Symbol("hello")     //allocates new memory location 
// b = Symbol("hello")     //used to give unique identification
// console.log(a == b);
// console.log(a === b);
// a = Symbol(null)
// b = Symbol(null)
// console.log(a == b);
// console.log(a === b);
// a = Symbol(undefined)
// b = Symbol(undefined)
// console.log(a == b);
// console.log(a === b);
// a = null
// b = null
// console.log(a == b);
// console.log(a === b);


// var vs let vs const

// var a ;
// console.log(a);
// let b ;
// console.log(b);
// const c ;    // error
// console.log(c);

// var a; a = 10
// console.log(a);
// let b; b = 10
// console.log(b);
// const c; c = 10     // error
// console.log(c);

// var a = 10 ;
// console.log(a);
// let b = 10 ;
// console.log(b);
// const c = 10 ;
// console.log(c);

// var a ;
// var a ;
// console.log(a);
// let b ;     // error
// let b ;     // error
// console.log(b);
// const c ;       // error
// const c ;       // error
// console.log(c);

// var a = 10;
// a = 20;
// console.log(a);
// let b = 10;
// b=20;
// console.log(b);
// const c = 10;
// c = 20;
// console.log(c); // Uncaught TypeError: Assignment to constant variable.

// var a = 10
// var a = 20
// console.log(a);
// let b = 10      // error - Cannot redeclare block-scoped variable 'b'
// let b = 20      // error
// console.log(b); // Uncaught SyntaxError: Identifier 'b' has already been declared
// const c = 10        // error - Cannot redeclare block-scoped variable 'c'
// const c = 20        // error
// console.log(c); // Uncaught SyntaxError: Identifier 'c' has already been declared