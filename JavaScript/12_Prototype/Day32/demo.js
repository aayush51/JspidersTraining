//! Prototype

let obj = {
    name:"Gaurav"
}
console.log(obj.__proto__);

let arr = [10,20,30]
console.log(arr.__proto__);

let num = 10 ;
console.log(num.__proto__);

let bool = true ;
console.log(bool,__proto__);

let str1 = 'hello';
console.log(str1.__proto__);
let str2 = "hello";
console.log(str2.__proto__);
let str3 = `hello`;
console.log(str3.__proto__);

let bigint1 = 98564522255822455n;
console.log(bigint1.__proto__);

let symb = Symbol("hello")
console.log(symb.__proto__);

// let var1 = null;     //? Error
// console.log(var1.__proto__);     

// let var1 = undefined;    //? Error
// console.log(var1.__proto__);

let var1 = Infinity;
console.log(var1.__proto__);




//! Inheritance between objects

let obj1 = {
    name:"Tinku"
}
let obj2 = {
    surname:"Pandey"
}
console.log(obj1.__proto__);
// obj1.__proto__ = {}
obj1.__proto__ = obj2       //` reinitialized / overrided
console.log(obj1.__proto__);
console.log(obj1);
console.log(obj2.surname);
console.log(obj1.surname);  
//` accessing obj2 property from obj1 
//` obj1 is child , obj2 is parent


// class Car {
//     constructor(name) {
//         name;
//         console.log(name);
//     }  
// }

// console.log(Car);
// console.log(Car.__proto__);
// let c1 = new Car("Harrier");
// console.log(c1.__proto__);




//! Destructuring

let backpack = {
    item1:"Waterbottle",
    item2:"Tiffin",
    item3:"Camera",
    item4:"Torch",
    itemi5:"Cloths",
    item6:"Charger"
}

// console.log(item2);  //? Error

let {item4,item2,item6} = backpack ;

console.log(item2);

