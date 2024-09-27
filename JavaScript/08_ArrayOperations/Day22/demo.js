//Declaring array in js
//way1  - Array Literal Way
let arr1 = [10, 20, 30, 40, 50];
console.log(arr1);
//way2  - Using Array class(Constructor) and new keyword
let arr2 = new Array(60, 70, 80, 90);
console.log(arr2);

//Can store any data 
let arr3 = [23, "Hello", true, null, undefined, () => { console.log(`func inside array`); }, { name: "Minu" }, [33, 44, [40, [55, ["Last"]]]]]
console.log(arr3);

//Using/accesing elements of array
//array[index]
console.log(arr3[5]);
//Calling function stored inside array
arr3[5]()
//Accessing object stored inside array
console.log(arr3[6].name);
//Nested arrays
console.log(arr3[7]);
console.log(arr3[7][2]);
console.log(arr3[7][2][1]);
console.log(arr3[7][2][1][1]);

let arr4 = [10, 20, 30, 40]
console.log(arr4);
arr4.push(50)
console.log(arr4);
arr4.pop()
console.log(arr4);
arr4.unshift(0)
console.log(arr4);
arr4.shift()
console.log(arr4);

console.log(arr4.indexOf(20));
console.log(arr4.indexOf(40));

console.log(arr4.at(0));
console.log(arr4.at(1));

console.log(arr4.includes(20));




let arr5 = [10, 20, 30, 40]
console.log(arr5);  // [10, 20, 30, 40]
let newArr1 = arr5.slice(2,3)  
console.log(newArr1);  // [30]
console.log(arr5);  //  [10, 20, 30, 40]


let arr6 = [10, 20, 30, 40]
console.log(arr6);  // [10, 20, 30, 40]
let newArr2 = arr6.splice(2,3)  
console.log(newArr2);  // [30]
console.log(arr6);  //  [10, 20, 40]