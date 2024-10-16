let p1 = new Promise((resolve,reject)=>{
    let a = 10 ;
    if(a==10) {
        resolve();
    }
    else {
        reject();
    }
});

p1.then(()=>{console.log("True a==10");})
p1.catch(()=>{console.log("False a!=10");})




console.log("first");
let p2 = new Promise((resolve,reject)=>{
    let a = 33 + 44 ;
    resolve(a);
    reject("Something Went Wrong !");
});
p2.then((val)=>{console.log("Then Block",val);});
p2.catch((err)=>{console.log("Catch Block",err);})
console.log("last");



// example for resolve as well as reject not possible



let p = fetch('https://api.github.com/users');
console.log(p);

p.then(
    (val)=>{
        console.log(val);
        let data = val.json();
        return data;
    }
).then(
    (val2)=>{
        console.log(val2);
    }
).catch(
    (err)=>{
        console.log("something went wrong ",err);
    }
)


fetch('https://api.github.com/users').then(resp=> {return resp.json()}).then()


//- promises are objects i js
//- promises are used to handle async task
//- with promises we get 3 states - pending, resolve, rejected
//- pending - promise will be in pending state when it is neither resolve or rejected
//- resolve - when your promise is funfilled it is in resolved state
//-             when promise is resolved it will call then block & we can pass arguments along with it
//- reject - when your promise is not funfilled it is in rejected state
//-             when promise is rejected it will call catch block & we can pass arguments along with it i.e. error
//-             catch block can be used to handle errors and exceptions

//! promise can not be in resolve