//! str.slice(start,end)
//` 2nd argument is optional
//` If 2nd argument not given it will take till length of string by default
let string1 = 'Katappa'
console.log(string1.slice(0, 2));
console.log(string1.slice(2, 7));
console.log(string1.slice(3, 7));
console.log(string1.slice(-3, -1));
console.log(string1.slice(-1, 7));
console.log(string1.slice(-1, string1.length));
console.log(string1.slice(-1));
console.log(string1.slice(4));
console.log(string1);



//! str.substring(start,end)
//` 2nd argument is optional
//` If 2nd argument not given it will take till length of string by default
let string2 = 'Katappa'
console.log(string2.substring(3, 7));
console.log(string2.substring(-7, 4));
console.log(string2.substring(3));
console.log(string2.substring(-3));
console.log(string2.substring(-7));
console.log(string2);

//! str.substr(start,length)
//` It is deprecated method
//` 2nd argument is optional, If 2nd argument not given it will take till length of string by default
console.log(string2.substr(2, 3));
console.log(string2.substr(-5, 3));
console.log(string2.substr(2));



//! str.includes(string)
//` Returns true if passed string is present in given string else returns false
let string3 = 'Katappa'
console.log(string3.includes('t'));

//! str.startsWith(string)
//! str.endsWith(string)
//` Returns true if passed string is present at start/end of given string else returns false
console.log(string3.startsWith('k'));
console.log(string3.startsWith('K'));
console.log(string3.startsWith('Kat'));
console.log(string3.endsWith('a'));
console.log(string3.endsWith('appa'));

//! str.at(index)
//! str.charAt(index)
//` returns character at that particular index
console.log(string3.at(0));
console.log(string3.at(-1));
console.log(string3.charAt(2));
console.log(string3.charAt(-2));

//! str.charCodeAt(index)
//` returns ASCII value of character at that particular index
//` if index not given it will take first index
console.log(string3.charCodeAt(0));
console.log(string3.charCodeAt(4));



//!! Exception Handling

try {
    console.log(a);
} 
catch (err) {
    console.log(err);
}
//` If there is no error it will print undefined
//` If we try to print a variable which is not declared then it will throw an error and
//` will be caught by catch block
//` If variable a is not declared it will throw ReferenceError and will be caught by catch block

try {
    throw new Error("custom: a is not defined")
} 
catch (err) {
    console.log(err);
}

try {
    throw "custom: you are wrong"
} 
catch (err) {
    console.log(err);
}