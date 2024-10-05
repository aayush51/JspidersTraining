
let str1 = 'Hello'
let str2 = "Hiii"
let str3 = `How are You`
let str4 = new String("Hello")

console.log(str4);

let string1 = 'Bahubali'
// console.log(string1[0]);
// console.log(string1[1]);
// console.log(string1[2]);
// console.log(string1[3]);
// console.log(string1[4]);
// console.log(string1[5]);
// console.log(string1[6]);
// console.log(string1[7]);
// console.log(string1[8]);    //Undefined no value at that index

// let newString1 = string1[0]+string1[1]+string1[4]+string1[6]+string1[3]
// console.log(newString1);
console.log(string1);

//` str.length
console.log(string1.length);

for (let i = 0; i < string1.length; i++) {
    console.log(string1[i]);
}

//! Array Higher order function not work for String
// string1.forEach(e => {
//     console.log(e);
// });

//` String to Array conversion with str.split()
let string2 = 'Bahubali'
let strArr1 = string2.split()
let strArr2 = string2.split('a')
let strArr3 = string2.split('i')
let strArr4 = string2.split('')
console.log(strArr1);
console.log(strArr2);
console.log(strArr3);
console.log(strArr4);

let string3 = 'Bahubali is very strong'
let strArr5 = string3.split(' ')
console.log(strArr5);


//` array.reverse()         reverse the array
let string4 = 'Bahubali'
let strArr6 = string4.split('').reverse()   
console.log(strArr6);


//` array.join()        concat array elements 
//` join(separator) takes separator in string format
console.log(strArr6.join());
console.log(strArr6.join(''));
let newString2 = strArr6.join('')
console.log(newString2);


// let string5 = 'bahubali'
// let newString3 = ''
// for (let i = string5.length-1; i >= 0 ; i--) {
//     newString3+=string5[i]
// }
// console.log(newString3);


//` str.padEnd()        add padding at end of string
//` str.padStart()      add padding at start of string
let num1 = '8945'
console.log(num1.padEnd(10,'*'));       
let adharNum = '7475'
console.log(adharNum.padStart(12,'*'));
let num2 = '56841'
console.log(num2.padStart(10,'*').padEnd(15,'*'));


//` str.trim()                  trims spaces from both sides
//` str.trimStart()             trims spaces from start
//` str.trimEnd()               trims spaces from end
let str01 = '           Bahubali'
console.log(str01.trimStart());
let str02 = 'Bahubali          '
console.log(str02.trimEnd());
let str03 = '              Bahubali                '
console.log(str03.trim());


//` str.toUpperCase()
let str001 = 'Bahubali'
console.log(str001.toUpperCase());
console.log(str001.toLocaleUpperCase());    //not prefared

//` str.toLowerCase()
let str002 = 'BAHUBALI'
console.log(str002.toLowerCase());
console.log(str002.toLocaleLowerCase());

//` str.replace()       which character to change , with which character
//` replace() method will only replace till first occurance
let str003 = 'Bahubali'
console.log(str003.replace('Bahu','Tang'));
console.log(str003.replace('a','i'));

//` str.replaceAll()
//` replaceAll() method will replace all occurance
console.log(str003.replaceAll('a','i'));

//! strings are immutable
str003[0]='K';  
console.log(str003);

console.log(str003.replace('B','k').replace('h','').replace('a','ha').replace('b','g').replace('l','ll'));