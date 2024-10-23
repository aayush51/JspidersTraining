
//+ Session Storage

let password = "12345";
sessionStorage.setItem('mypassword',password);

let username = "aayush5";
sessionStorage.setItem('myusername',username);

console.log(sessionStorage);

let mypassword = sessionStorage.getItem('mypassword');
console.log(mypassword);


//+ Local Storage

let lpassword = "12345";
localStorage.setItem('lpassword',lpassword);

let lusername = "aayush5";
localStorage.setItem('lusername',lusername);

console.log(localStorage);

let my2password = localStorage.getItem('lpassword');
console.log(my2password);

localStorage.clear()