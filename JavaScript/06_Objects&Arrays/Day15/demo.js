//Objects

// let car = {
//     color:"white",
//     price:2000000,
//     company:"tata",
//     name:"safari",
//     owner:{
//         ownerName:"Tinku",
//         add:{
//             city:"pune",
//             area:"deccan"
//         }
//     }
// }

//CRUD Operations on Object
//creating object
let object1 = {
    name: "Tinku",
    add: "Pune"
}
//reading object
console.log(object1);
//updating object (adding new properties)
object1.car = "safari"
console.log(object1);
//updating object (update existing properties)
object1.name = "Tinki"
console.log(object1);
//deleting key value
delete object1.car
console.log(object1);

// let object2 = new Object()
// object2.name = "Tinku"
// object2.add = "Pune"

// ways of declaring object
// #1 Object literal way
let obj1 = {
    key: "value"
}

// #2 Using new keyword and Object class
let obj2 = new Object({ name: "Tinku" })
console.log(obj2);

// #3 Using Classes in JavaScript
class CreateObj {
    constructor(name) {
        console.log(name);
        this.name = name
    }
}
let objA1 = new CreateObj("Tinku")
console.log(objA1);

// #4 Using Factory Function
let CreateObject = (name, addr) => {
    let obj = {
        name: name,
        add: addr
    };
    return obj;
}
let stud1 = new CreateObj("Tinku", "Pune")
let stud2 = new CreateObj("Rinku", "Lonavala")
let stud3 = new CreateObj("Pinku", "Satara")
console.log(stud1, stud2, stud3);



//Arrays
// arrays are dynamically typed (can be changed or add values during runtime)(can store any data)
// index starts from 0 ends at arr.length - 1

// let arr1 = ["mobile", "charger", "laptop", "headphone"]
// let arr2 = ["mobile", 100, null, undefined, () => { console.log("function") }, { name: "Tinku" }, ["item1", "item2"]]
// console.log(arr1);
// console.log(arr2);
// console.log(arr2.length);
// console.log(arr2[0]);
// console.log(arr2[arr2.length - 1]);

//CRUD Operations on Array
//creating array
let arr3 = [10, 20, 30, 40]
//reading array
console.log(arr3);
//adding element in array at last(last index)
arr3.push(50)
console.log(arr3);
//remove last element from array(last index)
arr3.pop()
console.log(arr3);
//adding element in array at start(first index)
arr3.unshift(100)
console.log(arr3);
//remove start element from array(first index)
arr3.shift()
console.log(arr3);

let arr4 = [10, 20, 30, 40]
console.log(arr4.indexOf(10));
console.log(arr4.at(0));
