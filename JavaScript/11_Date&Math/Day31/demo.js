//! Date

// let date = new Date();
// console.log(date);

console.log(Date.now());

let date = new Date();  //? creating date object
console.log(date.getDay()); //? returns integer of day starts from 0 (index)

switch (date.getDay()) {
    case 0:
        console.log("Sunday");
        break;
    case 1:
        console.log("Monday");
        break;
    case 2:
        console.log("Tuesday");
        break;
    case 3:
        console.log("Wednesday");
        break;
    case 4:
        console.log("Thursday");
        break;
    case 5:
        console.log("Friday");
        break;
    case 6:
        console.log("Saturday");
        break;
    
    default:
        break;
}

console.log(date.getMonth());   //? returns integer of month starts from 0 (index)

switch (date.getMonth()) {
    case 0:
        console.log("Jan");
        break;
    case 1:
        console.log("Feb");
        break;
    case 2:
        console.log("Mar");
        break;
    case 3:
        console.log("Apr");
        break;
    case 4:
        console.log("May");
        break;
    case 5:
        console.log("Jun");
        break;
    case 6:
        console.log("Jul");
        break;
    case 7:
        console.log("Aug");
        break;
    case 8:
        console.log("Sept");
        break;
    case 9:
        console.log("Oct");
        break;
    case 10:
        console.log("Nov");
        break;
    case 11:
        console.log("Dec");
        break;

    default:
        break;
}

console.log(date.getDate());    //? returns todays date

console.log(date.getFullYear());    //? returns current year

console.log(date.getHours());     //? returns time in hours (24 hrs)

console.log(date.getMilliseconds());    //? return current time in miliseconds

console.log(date.getMinutes());     //? return current time in Minutes

console.log(date.getSeconds());     //? return current time in Seconds

console.log(date.getTime());      //? retunrs complete time

//! Math

console.log(Math.abs(10.007));

console.log(Math.floor(10.5));

console.log(Math.ceil(10.5));

console.log(Math.max(10,20,5,50,4,88,9,75,66,95,2));

console.log(Math.min(10,20,5,50,4,88,9,75,66,95,2));

console.log(Math.pow(2,10));

console.log(Math.random());

console.log(Math.round(10.5));

console.log(`OTP : ${Math.round(Math.random()*9000)+1000}`);

console.log(Math.sqrt(25));

console.log(Math.cbrt(64));

console.log(Math);

console.log(Math);