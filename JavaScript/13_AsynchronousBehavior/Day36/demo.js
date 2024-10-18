// let print = function () {
//     console.log("Hello");
// }
// setTimeout(print,5000);



// setInterval(() => {
//     console.log("Hello");
// }, 1000)



let count = 0;
let myInterval = setInterval(() => {
    count++;
    console.log(count);
    if(count==15){
        clearInterval(myInterval);
    }
}, 1000)
