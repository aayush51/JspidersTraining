// WAY 2 - Deep copy by using Object.assign()

// let obj1 = {
//   name : "Rinku",
//   age :23 
// }
// console.log("obj1 object",obj1);
// let copy1 = Object.assign({},obj1)  // Deep copy is created
// console.log("copy of obj",copy1); 

// copy1.addr = "pune";
// console.log(`copy1.addr = "pune";---------performed`);
// console.log("copy1 after adding addr",copy1); 
// console.log("obj1 after adding addr",obj1);


//This Keyword

// 1.Inside Global Scope this keyword returns window object
console.log(`this keyword inside global scope`, this); // returns window object

// 2.Inside normal function scope this keyword returns window object
let func1 = function () {
  console.log(`this keyword inside normal function`, this); // returns window object
}
func1();

// 3.Inside arrow function scope this keyword returns window object
let func2 = () => {
  console.log(`this keyword inside arrow function`, this); // returns window object
}
func2();

let obj2 = {
  name: "Rinku",
  age: 23,

  // 4.Inside normal function from object this keyword returns current object
  func1: function () {
    console.log(`normal function inside object `, this); // returns current object
  },

  // 5.Inside arrow function from object this keyword returns window object
  func2: () => {
    console.log(`arrow function inside object`, this); // returns window object
  }
}

obj2.func1();
obj2.func2();

// 6.In arrow function from normal function inside object this keyword returns current object
// normally in arrow function this keyword always point towards window object 
// due to lexical scoping In arrow function from normal function inside object this keyword returns current object
let obj3 = {
  name:"Rinki",
  age:23,
  func1:function () {
    console.log(`object -> normal function `,this); // returns current object
    let a = 10 ;
    let nestedFunc = ()=>{
      console.log(`object -> normal function -> arrow function `,this); // returns current object
      // arrow function nested inside normal function points towards current object due to lexical scoping 
      // instead of pointing window object it points towards current object
      // console.log(a); // lexical scoping access variable outside function
    }
    nestedFunc();
  },
  func2:()=>{
    console.log(`object -> normal function `,this); // returns window object
  }
}
obj3.func1();
obj3.func2();




// let CreateObj = function (name) {
//   console.log(this.name);
//   console.log(this);
// }
// let obj4 = new CreateObj("Pinku")
let CreateObj = function (name,age) {
  let obj = {
    name , age 
  }
  return obj;
}
let obj4 = new CreateObj("Pinku",23)