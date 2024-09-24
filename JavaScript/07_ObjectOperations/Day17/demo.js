let obj1 = {
    name: "Rinku",
    "user name": "Rinku123",
    add: "pune",
    age: 21,
    gender: "male",
    alarm: () => {
        console.log("Snoozeee...!!!");
        return "Stop";
    }
};
console.log(obj1);
// obj1.alarm()
// console.log(obj1.alarm);
// console.log(obj1.alarm());
// console.log(obj1["name"]);
// console.log(obj1["user name"]);
// delete obj1.add
// obj1.salary=309923;
// console.log(obj1);

// let obj2 = new Object();
let obj2 = new Object({ name: "Rishu", age: 23 });
console.log(obj2);

class CreateObject {
    constructor(name) {
        this.name = name
    }
}
let obj3 = new CreateObject("Mahesh")
console.log(obj3);

// factory method
// let CreateObj = (name)=> {
//     let obj = {
//         username:name
//     };
//     return obj;
// }
// let noob = CreateObj("Gaurav")

// let CreateStud = (name,yop,qual,branch,email)=>{
//     let obj = {
//         name : name ,
//         yop : yop,
//         qual : qual ,
//         branch : branch ,
//         email : email
//     }
//     return obj
// }
// let stud1 = CreateStud("mahesh", 2024, "b.tech", "cs", "mahesh@gamil.com");

let CreateStud = (name, yop, qual, branch, email) => {
    let obj = { name, yop, qual, branch, email };
    return obj;
}
let stud1 = CreateStud("mahesh", 2024, "b.tech", "cs", "mahesh@gamil.com");
console.log(stud1);

//Object inside Object 
//Array inside Object
let student = {
    name:"Bindu",
    addr:{
        houseNo:22,
        landmark:"Gov School",
        area:"Karve Nagar",
        city:"Pune"
    },
    hobbies:["Writing","Reading","Coding","Swimming"],
    email:"bindu@23.com"
}
// console.log(student.addr.city);
student.hobbies.forEach(e => {
    console.log(e);
});

//entries function - convert object to array
let user = {
    username:"anish123",
    phone:838484903,
    email:"anish@gmail.com"
}
let arr1 = Object.entries(user)
console.log(arr1);

//fromEntries function - convert array to object
//array should be in key value pair nested array format
console.log(Object.fromEntries(arr1));

// let arr2 = [["n1",10],["n2",20],["n3",30],["n4",40]]
// console.log(Object.fromEntries(arr2));

//assign function - merges two objects
let add = {
    houseNo:55,
    city:"pune",
    pincode:411050
}
let newStud = Object.assign(stud1,add);
console.log(newStud);