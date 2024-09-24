
// Way-2 : Creating Deep copy by using JSON Object ------------>
// Deep object : The changes ade in child(copy) object will not affect the parent object
// let person = {
//   name: "Tinku",
//   age: 25,
//   personalContact: 993487233,
//   address: {
//     street: "Pune",
//     city: "Pune",
//     state: "Maharashtra",
//   },
// };
// console.log(person);
// let jsonCopy = JSON.stringify(person);
// console.log(jsonCopy);
// let newJsObj = JSON.parse(jsonCopy); // Deep Copy (new object created)
// console.log(newJsObj);
// newJsObj.address.street = "Mumbai";
// console.log(newJsObj);
// console.log(person);

// console.log(person.address);
// console.log(newJsObj.address);
// console.log(person.address === newJsObj.address); // false
// console.log(person.address === person.address); // true

// Way-3 : Creating Deep copy by using Object.assign() ------------>
// Deep object : The changes ade in child(copy) object will not affect the parent object
// let person = {
//   name: "Tinku",
//   age: 25,
//   personalContact: 993487233,
//   address: {
//     street: "Pune",
//     city: "Pune",
//     state: "Maharashtra",
//   },
// };
// console.log(person);
// let newJsObj = Object.assign({}, person); // Deep Copy (new object created)
// console.log(newJsObj);
// newJsObj.address.street = "Mumbai";
// console.log(newJsObj);
// console.log(person);
// console.log(person.address);
// console.log(newJsObj.address);
// console.log(person.address === newJsObj.address); // false
// console.log(person.address === person.address); // true
// Way-4 : Creating Deep copy by using Object.create() ------------>
// Deep object : The changes ade in child(copy) object will not affect the parent object
// let person = {
//   name: "Tinku",
//   age: 25,
//   personalContact: 993487233,
//   address: {
//     street: "Pune",
//     city: "Pune",
//     state: "Maharashtra",
//   },
// };
// console.log(person);
// let newJsObj = Object.create(person); // Deep Copy (new object created)
// console.log(newJsObj);
// newJsObj.address.street = "Mumbai";
// console.log(newJsObj);
// console.log(person);
// console.log(person.address);
// console.log(newJsObj.address);
// console.log(person.address === newJsObj.address); // false
// console.log(person.address === person.address); // true
// Way-5 : Creating Deep copy by using JSON.parse(JSON.stringify()) ------------>

// Deep object : The changes ade in child(copy) object will not affect the parent object
let person = {
    name: "Tinku",
    age: 25,
    personalContact: 993487233,
    address: {
        street: "Pune",
        city: "Pune",
        state: "Maharashtra",
    },
};
console.log(person);
let newJsObj = JSON.parse(JSON.stringify(person)); // Deep Copy (new object created)
// console.log(newJsObj);
// newJsObj.address.street = "Mumbai";
// console.log(newJsObj);
// console.log(person);
// console.log(person.address);
// console.log(newJsObj.address);
// console.log(person.address === newJsObj.address); // false
// console.log(person.address === person.address); // true
