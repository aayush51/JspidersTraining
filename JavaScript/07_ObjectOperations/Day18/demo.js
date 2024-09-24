// console.log("Object");

// Combine 2 objects without affecting original objects --------------->

// let personal = {
//   name: "Tinku",
//   age: 22,
//   add: "Pune",
//   mob: 786384973,
// };

// let office = {
//   contact: 97329873,
// };

// let obj3 = Object.assign({}, personal, office);
// console.log(personal);
// console.log(office);
// console.log(obj3);

// console.log("--------------------------------");



// Shallow Copy : The changes made in child object will affect the parent object

let person1 = {
  name: "Tinku",
  age: 25,
  personalContact: 993487233,
};
console.log(person1); 

let shallowCopy = person1; // shallowCopy and person1 both pointing at same object (contains reference of same object)
console.log(shallowCopy);

console.log(`shallowCopy.add = "Pune"; ---------------Performed`);
shallowCopy.add = "Pune";
console.log(shallowCopy);
console.log(person1);

// Deep object : The changes made in child(copy) object will not affect the parent object

// Way#1 : Creating Deep copy by using JSON Object ------------>

let person2 = {
    name: "Tinku",
    age: 25,
    personalContact: 993487233,
};
console.log("Person - Original Js Object");
console.log(person2);

let jsonCopy = JSON.stringify(person2);
console.log("jsonCopy - Copy of Js Object in JSON form 'String' (Js Object to JSON Conversion)");
console.log(jsonCopy);

let newJsObj = JSON.parse(jsonCopy); // Deep Copy (new object created)
console.log("newJsObj - JSON to Js Object Conversion");
console.log(newJsObj);


newJsObj.add = "Pune";
console.log(`newJsObj.add = "Pune"; ---------------Performed`);
console.log("newJsObj");
console.log(newJsObj);
console.log("Person");
console.log(person2);

