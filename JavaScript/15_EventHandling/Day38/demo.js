
//+ onclick

let { body } = document;

let black = () => {
    // console.log("Button Clicked");
    body.style.backgroundColor = 'black'
    body.style.color = 'white'
}
let white = () => {
    // console.log("Button Clicked");
    body.style.backgroundColor = 'white'
    body.style.color = 'black'
}

let btn = document.querySelector('.jsclick');
// console.log(btn);
// btn.onclick = white;


btn.addEventListener('click', (eventObject) => {
    body.style.backgroundColor = 'white';
    body.style.color = 'black';
    eventObject.target.style.backgroundColor = 'cyan';
    console.log(eventObject);
});

let str = ''
let inp = document.querySelector('input');
inp.addEventListener('input', (e) => {
    console.log(e);
    str += e.data;
    console.log(str);
    document.querySelector('header').innerHTML = str;
});

