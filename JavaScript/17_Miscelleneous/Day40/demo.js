//+ Strict Mode

// 'use strict';

// let a = 10 ;
// b = 20 ; //error

// let a = 01000;  //error
// console.log(a);


//+ this keyword in Events

let btn = document.createElement('button');

btn.innerHTML = "Click Me";

document.body.append(btn);

btn.addEventListener('click', function () {
    console.log(this);
})
btn.addEventListener('dblclick', () => {
    console.log(this);
})


//+ for in loops

let obj = {
    name: "Ram",
    age: 23,
    addr: "pune",
};

for (key in obj) {
    console.log(key, obj[key]);
    console.log(key, obj.key);
}


//+ for of loops

let arr = [10, 20, 30, 40];

for (val of arr) {
    console.log(val);
}

let str = 'HelLo WOrlD';

for (val of str) {
    console.log(val);
}

//! Try testing

// for (ele of obj) {      //! Error = obj is not iterable
//     console.log(ele);
// }

for (val in arr) {     //- returns indexes of array
    console.log(val , arr[val]);
}

for (val in str) {      //- returns indexes of string
    console.log(val, str[val]);
}


//+ flat()

let arr2 = [[10, 20, [30, 40]], 50];

let arr3 = arr2.flat();
console.log(arr2);
console.log(arr3);
console.log(arr3.flat());
