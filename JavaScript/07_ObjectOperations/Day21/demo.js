// Creating object using constructor function with this keyword (5th way)
function CreateObj(name, addr, contact) {
  // function is treated as class 
  // convention of class first letter must be capital
  this.name = name;
  this.addr = addr;
  this.contact = contact;
}
let obj1 = new CreateObj("Sandeep", "pune", 985624475);
console.log(obj1);
console.log(obj1.name + " " + obj1.addr + " " + obj1.contact);

//! Javascript

let superhero = {
  name: "Spiderman",
  gf: "Merry",
  aunt: "May",
  uncle: "Ben"
};
function myFun1(realname,addr) {
  console.log(this);  //current object
  console.log(this.name); // spiderman
  this.realname = realname; // this will refect globally (to original object)
  console.log(this);  // updated object
  console.log(addr);
};
myFun1.call(superhero,"Peter Parker","NewYork");  // Manual binding - make function pointing towards particular object as current object
console.log(superhero); // updated object

// apply() method will take object and array of arguments 
function myFun2(realname,addr) {
  console.log(realname,addr);
}
myFun2.apply(superhero,["Peter Parker","NewYork"])

let bindedFun = myFun2.bind(superhero,"Peter","NY")  // just do binding of object and function not calling the function
bindedFun()


let villans = ["DocOcto","Electro","Goblin","SandMan"]
function myFun3(v1,v2,v3,v4) {
  console.log(v1,v2,v3,v4);
}
myFun3.apply(superhero,villans)