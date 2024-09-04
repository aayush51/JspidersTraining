var a = 11
if(true) {
    console.log(a);
    var a = 12
    console.log(a);
}
console.log(a);

// ------------------------------------------------

let b = 22
if(true) {
    console.log(b);
    let b = 23
    console.log(b);
}
console.log(b);

// -------------------------------------------------

const c = 33
if (true) {
    console.log(c);
    const c = 34
    console.log(c);
}
console.log(c);

// -------------------------------------------------


{
    var aa = 10
    let bb = 20
    const cc = 30
}

console.log(aa,bb,cc);