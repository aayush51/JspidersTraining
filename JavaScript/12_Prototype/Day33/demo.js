//! Destructuring
//- Destructing of Object

let backpack = {
    item1: "Waterbottle",
    item2: "Tiffin",
    item3: "Camera",
    item4: "Torch",
    itemi5: "Cloths",
    item6: "Charger"
}

// console.log(item2);  //? Error

let { item4, item2, item6 } = backpack;

console.log(item2);

console.log(window);
// window.alert("1 welcome");
// alert("2 Hello")




//- Destructing of Array

let arrBag = ['Waterbottle', 'Tiffin', 'Camera', 'Torch', 'Cloths', 'Charger']
console.log(arrBag);

//` array dont have keys so we give them keys explicitly
//` array have indexes it is necessary to maintain order of elements

// let [a,b,c,d,e,f] = arrBag
// console.log(a);
// console.log(f);

let [a, b, c, ...d] = arrBag
//- Rest Parameter (...)
//` A rest element must be last in a destructuring pattern
//` parameter / placeholder
//` returns array if used with array destructuring

console.log(a);
console.log(d);

//- Spread Operator (...)
console.log(...arrBag);
console.log(...a);

let func = (a,b,c) => {
    console.log(c);
}
// func('Waterbottle', 'Tiffin', 'Camera', 'Torch', 'Cloths', 'Charger')
// func(arrBag[0],arrBag[1],arrBag[2])
func(...arrBag)

//` (LHS)   ...Rest   =    ...Spread     (RHS)
//` REST - elements rests at one place



let str = "Hello World"
let [s1,s2,s3,s4,s5,...s6] = str

console.log(s1);
console.log(s2);
console.log(s3);
console.log(s6);
console.log(...str);



let bagObj = {
    i1: "Waterbottle",
    i2: "Tiffin",
    i3: "Camera",
    i4: "Torch",
    i5: "Cloths",
    i6: "Charger"
}
// let {i1,i2,i3,...remainingItems} = bagObj
// console.log(i1);
// console.log(remainingItems);

// let {i5,...remainingItems} = bagObj
// console.log(remainingItems);

// console.log(...bagObj);  //? Error

console.log({...bagObj}); // deep copy

// let newObj = {...bagObj}
// newObj.hello = "Bye"
// console.log(newObj);
// console.log(bagObj);

let string = "GoodDay"
let [str1,...str2] = string
console.log(str1);
console.log(str2);
console.log(...string);
console.log({...string});
console.log([...string]);