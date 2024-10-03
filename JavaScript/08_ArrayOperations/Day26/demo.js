//! array.map() function

let arr = [10, 20, 30, 40, 50, 60, 70, 80]
let val1 = arr.forEach((e, i, w) => {
    console.log(e);
    // return e+100;    //? for each doesn't return anything
})
// console.log(val);
let val2 = arr.map((e, i, w) => {
    console.log(e);
    return e + 100;
})
console.log(val2);

console.log(arr);   //? map() doesnt affect original array


//` implicit return with fat arrow
let numbers = [1, 2, 3, 4, 5]
console.log(numbers);
let doubleNum = numbers.map(val => val * 2)
console.log(doubleNum);


let names = ["tinku", "pinku", "rinku"]
let newArr = []
names.forEach(name => {
    newArr.push(`Hello ${name}`)
})
console.log(newArr);

//! array.filter() function

// let ages = [34, 44, 10, 12, 18, 42, 53, 22, 19]
// let newAges = []
// for (let i = 0; i < ages.length; i++) {
//     if (ages[i] >= 18) {
//         newAges.push(ages[i])
//     }
// }
// console.log(newAges);

// let ages = [34, 44, 10, 12, 18, 42, 53, 22, 19]
// let newAges = []
// ages.forEach(val => {
//     if (val >= 18) {
//         newAges.push(val)
//     }
// })
// console.log(newAges);

let ages = [34, 44, 10, 12, 18, 42, 53, 22, 19]
let newAges = ages.filter((e, i, w) => {
    // return "Hello";
    // return 10;
    return e >= 18;
})
console.log(ages);  //? filter() doesn't affect original array
//` filter method evaluates if returning thing(condition or value) is true then it will return value
//` in filter method we return filter condition
console.log(newAges);

let data = [{
    "first_name": "Goran",
    "last_name": "Rugieri",
    "email": "grugieri0@about.com",
    "gender": "Male"
}, {
    "first_name": "Marcela",
    "last_name": "Standering",
    "email": "mstandering1@wikispaces.com",
    "gender": "Female"
}, {
    "first_name": "Gwenni",
    "last_name": "Gurner",
    "email": "ggurner2@canalblog.com",
    "gender": "Female"
}, {
    "first_name": "Riordan",
    "last_name": "Milsom",
    "email": "rmilsom3@linkedin.com",
    "gender": "Male"
}, {
    "first_name": "Hunter",
    "last_name": "Rittmeyer",
    "email": "hrittmeyer4@sogou.com",
    "gender": "Male"
}, {
    "first_name": "Trev",
    "last_name": "Rome",
    "email": "trome5@va.gov",
    "gender": "Male"
}, {
    "first_name": "Titus",
    "last_name": "Heindl",
    "email": "theindl6@huffingtonpost.com",
    "gender": "Male"
}, {
    "first_name": "Carolee",
    "last_name": "Pittle",
    "email": "cpittle7@imageshack.us",
    "gender": "Female"
}, {
    "first_name": "Edan",
    "last_name": "Goad",
    "email": "egoad8@desdev.cn",
    "gender": "Male"
}, {
    "first_name": "Lorine",
    "last_name": "Bruineman",
    "email": "lbruineman9@cocolog-nifty.com",
    "gender": "Polygender"
}, {
    "first_name": "Anthe",
    "last_name": "Vallender",
    "email": "avallendera@weather.com",
    "gender": "Genderqueer"
}, {
    "first_name": "Gearard",
    "last_name": "Danell",
    "email": "gdanellb@cbc.ca",
    "gender": "Male"
}, {
    "first_name": "Forbes",
    "last_name": "Caseri",
    "email": "fcaseric@ocn.ne.jp",
    "gender": "Male"
}, {
    "first_name": "Zabrina",
    "last_name": "Pughe",
    "email": "zpughed@aboutads.info",
    "gender": "Female"
}, {
    "first_name": "Evvy",
    "last_name": "Cadge",
    "email": "ecadgee@sphinn.com",
    "gender": "Female"
}, {
    "first_name": "Ella",
    "last_name": "Chazette",
    "email": "echazettef@edublogs.org",
    "gender": "Female"
}, {
    "first_name": "Raymond",
    "last_name": "Janus",
    "email": "rjanusg@opensource.org",
    "gender": "Male"
}, {
    "first_name": "Gratiana",
    "last_name": "Postgate",
    "email": "gpostgateh@microsoft.com",
    "gender": "Female"
}, {
    "first_name": "Gaby",
    "last_name": "Abramamov",
    "email": "gabramamovi@cdc.gov",
    "gender": "Male"
}, {
    "first_name": "Imogene",
    "last_name": "Bisterfeld",
    "email": "ibisterfeldj@wikimedia.org",
    "gender": "Female"
}, {
    "first_name": "Adda",
    "last_name": "McArthur",
    "email": "amcarthurk@wikispaces.com",
    "gender": "Female"
}, {
    "first_name": "Orson",
    "last_name": "Setterthwait",
    "email": "osetterthwaitl@desdev.cn",
    "gender": "Agender"
}, {
    "first_name": "Magnum",
    "last_name": "Bizzey",
    "email": "mbizzeym@liveinternet.ru",
    "gender": "Bigender"
}, {
    "first_name": "Lissie",
    "last_name": "Veljes",
    "email": "lveljesn@time.com",
    "gender": "Polygender"
}, {
    "first_name": "Nicoline",
    "last_name": "Brodley",
    "email": "nbrodleyo@twitter.com",
    "gender": "Female"
}, {
    "first_name": "Conchita",
    "last_name": "Lantiffe",
    "email": "clantiffep@irs.gov",
    "gender": "Female"
}, {
    "first_name": "Derry",
    "last_name": "Extance",
    "email": "dextanceq@ihg.com",
    "gender": "Non-binary"
}, {
    "first_name": "Dannie",
    "last_name": "Farlowe",
    "email": "dfarlower@yale.edu",
    "gender": "Female"
}, {
    "first_name": "Rois",
    "last_name": "Kevlin",
    "email": "rkevlins@cmu.edu",
    "gender": "Non-binary"
}, {
    "first_name": "Cash",
    "last_name": "Mithan",
    "email": "cmithant@fotki.com",
    "gender": "Male"
}]


let maleArray = data.filter(val => {
    return val.gender == "Male"
})

console.log(maleArray);

let femaleArray = data.filter(val => {
    return val.gender == "Female"
})

console.log(femaleArray);

let nameStartWithA = data.filter(val => {
    return val.first_name[0] == "A"
})

console.log(nameStartWithA);