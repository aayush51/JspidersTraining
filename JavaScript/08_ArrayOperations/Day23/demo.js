let arr1 = [10, 20, 30, 40, 50, 60, 70, 80]

let newArr1 = arr1.splice(4, 3)
console.log("arr1");
console.log(arr1);
console.log("newArr1");
console.log(newArr1);
let newArr2 = arr1.splice(4, 3, 100)
console.log("arr1");
console.log(arr1);
console.log("newArr2");
console.log(newArr2);
let newArr3 = arr1.splice(2, 3, 200, 300, 400, 500, 600)
console.log(arr1);
console.log(newArr3);

let arr2 = [10, 20, 30, 40, 40, 50, 60, 70, 80]
// arr2.splice(Infinity,0,4000)   //Add at ending
// arr2.splice(NaN,0,4000)    //Add at starting
// arr2.splice(arr2.length,0,4000)  //Add at end
arr2.splice(0, arr2.length, 4000)
console.log(arr2);



// let name = prompt("Enter Name")
// let address = prompt("Enter address")
// let contact = prompt("Enter contact")
// let userObj = { name, address, contact }



let data = [
    {
        "name": "Rachael Heidenreich II",
        "address": "Castro Valley",
        "contact": "731-752-3694",
        "id": "1"
    },
    {
        "name": "Margarita Orn",
        "address": "Bellingham",
        "contact": "564-570-5825",
        "id": "2"
    },
    {
        "name": "Dolores Volkman",
        "address": "San Juan",
        "contact": "713-236-7049",
        "id": "3"
    },
    {
        "name": "Mr. Cedric Herman",
        "address": "Charlottesville",
        "contact": "265-905-6560",
        "id": "4"
    },
    {
        "name": "Lillian Ortiz",
        "address": "West Allis",
        "contact": "944-740-5686",
        "id": "5"
    },
    {
        "name": "Kerry Bruen",
        "address": "Youngstown",
        "contact": "201-377-9722",
        "id": "6"
    },
    {
        "name": "Clifford Dach",
        "address": "Smyrna",
        "contact": "895-201-0615",
        "id": "7"
    },
    {
        "name": "Lionel Toy",
        "address": "Grand Prairie",
        "contact": "507-897-8309",
        "id": "8"
    },
    {
        "name": "Alison Murphy",
        "address": "Ashburn",
        "contact": "895-891-6330",
        "id": "9"
    },
    {
        "name": "Elias Blick",
        "address": "North Richland Hills",
        "contact": "733-971-0546",
        "id": "10"
    },
    {
        "name": "Holly Green",
        "address": "Cambridge",
        "contact": "795-980-3173",
        "id": "11"
    },
    {
        "name": "Edwin Tremblay",
        "address": "Pittsburgh",
        "contact": "285-450-6207",
        "id": "12"
    },
    {
        "name": "Marcella Reilly",
        "address": "Coachella",
        "contact": "967-213-3477",
        "id": "13"
    },
    {
        "name": "Damon Kiehn",
        "address": "Cranston",
        "contact": "957-683-8460",
        "id": "14"
    },
    {
        "name": "Dr. Arthur Purdy",
        "address": "Diamond Bar",
        "contact": "954-702-6138",
        "id": "15"
    },
    {
        "name": "Valerie Walsh",
        "address": "Casper",
        "contact": "785-760-1259",
        "id": "16"
    },
    {
        "name": "Joseph Goyette",
        "address": "Clifton",
        "contact": "822-410-0052",
        "id": "17"
    },
    {
        "name": "Lucy Conroy",
        "address": "Racine",
        "contact": "366-870-7837",
        "id": "18"
    },
    {
        "name": "George Jast I",
        "address": "Newport News",
        "contact": "477-853-8444",
        "id": "19"
    },
    {
        "name": "Winston Schuppe",
        "address": "Racine",
        "contact": "869-201-4056",
        "id": "20"
    },
    {
        "name": "Amber Steuber",
        "address": "Blue Springs",
        "contact": "571-772-8750",
        "id": "21"
    },
    {
        "name": "Miguel Wiegand",
        "address": "Rocklin",
        "contact": "680-320-0733",
        "id": "22"
    },
    {
        "name": "Karl Oberbrunner",
        "address": "Pinellas Park",
        "contact": "449-955-6749",
        "id": "23"
    },
    {
        "name": "Dr. Peggy Hickle",
        "address": "Tyler",
        "contact": "514-455-5194",
        "id": "24"
    },
    {
        "name": "Miss Roman Stiedemann",
        "address": "Pasco",
        "contact": "636-389-0698",
        "id": "25"
    },
    {
        "name": "Erik Stokes",
        "address": "Antioch",
        "contact": "727-569-5682",
        "id": "26"
    },
    {
        "name": "Ashley Haag DDS",
        "address": "Tucson",
        "contact": "311-450-9779",
        "id": "27"
    },
    {
        "name": "Kelli Toy",
        "address": "Sterling Heights",
        "contact": "322-446-6009",
        "id": "28"
    },
    {
        "name": "Darren Mayert II",
        "address": "Dallas",
        "contact": "860-692-1909",
        "id": "29"
    },
    {
        "name": "Tyrone McLaughlin",
        "address": "Gary",
        "contact": "201-409-8322",
        "id": "30"
    }
]
// data.push(userObj)
console.log(data);

let jsonData = JSON.stringify(data)
// let newData = JSON.parse(jsonData)
console.log(jsonData);
// console.log(newData);





// document.getElementById("myForm").addEventListener("submit",()=>{
//     var formData = new FormData(form);
//     console.log(formData);
// })

// var nameValue = document.getElementById("uniqueID").value;
// console.log(nameValue);