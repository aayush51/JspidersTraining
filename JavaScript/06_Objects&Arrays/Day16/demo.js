//----------------------OBJECT-----------------------------

let value = "1000"
let obj = {
    keyyy: value
}
// console.log(obj);
// console.log(obj.keyyy);
// obj.key = 10
// console.log(obj);

//if key is present then value will be updated
//if key is not present then new key value pair is added

// obj.keyyy = 10
// console.log(obj);
// delete obj.keyyy
// console.log(obj);


//Way of acceessing values inside object by key
console.log(obj["keyyy"]);

let objA1 = {
    name: "Ram",
    addr: "pune",
    mob: 9830494943,
    func1: () => {
        console.log("Func Executed");
        console.log(objA1.name);
        console.log(`My name is ${objA1.name} and im living in ${objA1.addr} , My contact no is ${objA1.mob}`);
        // we should not use this keyword in arrow function Reason-It will always point to window object
        // console.log(this.name);
    },
    func2: function () {
        console.log(this.name);
    }
}
//Check whether key(property) is present or not
console.log("addr" in objA1);
console.log("salary" in objA1);
console.log(obj.name);
console.log(obj.salary);

//Calling function stored inside object as value
objA1.func1();



//------------------------------ARRAY-----------------------------

// let arr1 = [10, 20, 30, 40]
// console.log(arr1);
// arr1.push(50)
// console.log(arr1);
// arr1.pop()
// console.log(arr1);
// arr1.unshift(1000)
// console.log(arr1);
// arr1.shift()
// console.log(arr1);


// console.log(arr1[0]);
// console.log(arr1[1]);

// for (let i = 0; i < arr1.length; i++) {
//     console.log(arr1[i]);    
// }

// let i = 0
// while (i < arr1.length) {
//     console.log(arr1[i]);
//     i++;
// }

// let i = 0
// do {
//     console.log(arr1[i]);
//     i++;
// } while (i < arr1.length)

//forEach is higher order function
//if cbfunction has only one parameter it is not compulsory to give ()
// arr1.forEach(element => {
//     console.log(element);
// });

// arr1.forEach((element) => {
//     console.log(element);
// });
// arr1.forEach(element,val => {
//     console.log(element);
// });
// arr1.forEach(element,(val) => {
//     console.log(element);
// });
// arr1.forEach((element,val) => {
//     console.log(element);
// });


//the value is returned by function 
//anonymous function
//implicit return
//if there is single statement to execute in function we skip { }
//val => "Hello"
// let a = val => "Hello"
// console.log(a);
// a();
// console.log(a());

arr2 = [10, 20, 30, 40]

// arr2.forEach(element => {
//     console.log(element);
// });

// let myFunc = (val)=>{   //callback func
//     console.log(val);
// }
// arr2.forEach(myFunc);

// arr2.forEach((element,index,array) => {
//     console.log(element,index,array);
// });

arr2.forEach( (e, i, w) => console.log(e, i, w) )

// arr3=[9,32,76,45,85];
// arr3.forEach((elementOfArray,indexOfArray,wholeArray) => {
//     console.log(elementOfArray,indexOfArray,wholeArray);
// });