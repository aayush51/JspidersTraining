
//+ getElementById

//- return single object of html element
//- returns null if no element found

let head = document.getElementById("h1");
console.log(head);

head.style.color="red";


//+ getElementsByTagName
let input = document.getElementsByTagName("input");

//- returns array of objects
//- object represents each tag of html(html element)
//- we can access it by indexes
//- object contains attributes of element

console.log(input);
console.log(input[0]);
input[0].title='Enter Your Name'

for (let i = 0; i < input.length; i++) {
    input[i].style.backgroundColor="yellow";
    input[i].style.border="1px";
}


//+ getElementsByClassName

//- returns array of objects
//- object represents each class of html(html element)
//- we can access it by indexes
//- object contains attributes of element

let userInput = document.getElementsByClassName('userInput');
console.log(userInput);


//+ querySelector

//- return single object of html element
//- returns first object
//- returns null if no element found

console.log(document.querySelector('input'));
console.log(document.querySelector('.userInput'));
console.log(document.querySelector('#userInput3'));


//+ querySelectorAll

//- returns array of objects
//- returns all objects

console.log(document.querySelectorAll('input'));
console.log(document.querySelectorAll('.userInput'));
console.log(document.querySelectorAll('#userInput1'));



//+ setAttribute

//- sets attributes of that specific element

let myDiv = document.querySelector('div');
console.log(myDiv);
myDiv.setAttribute('class','myDivClass');
console.log(myDiv);

let inp = document.querySelector('#inp');
console.log(inp);
inp.setAttribute('disabled','');
console.log(inp);
inp.setAttribute('disabled','true');
console.log(inp);


//+ removeAttribute

//- removes attributes of that specific element

let myDiv1 = document.querySelector('div');
console.log(myDiv1);
myDiv1.removeAttribute('class');
console.log(myDiv1);


//+ createElement

//- creates new html element
//- returns the new element created

let newDiv = document.createElement('div');
console.log(newDiv);
newDiv.setAttribute('class','newDiv')

//+ textContent

//- sets text content of that specific element
newDiv.textContent='Hello'


//+ append

//- adds new html element to that specific element

// let body = document.querySelector('body');
// console.log(body);
// body.appendChild(newDiv);

// console.log(document);   //document have direct access to body of html
let {body} = document
body.append(newDiv)




