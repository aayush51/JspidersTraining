// fetch('https://api.github.com/users')
// .then((res)=>{return res.json()})
// .then((data)=>{
//     console.log(data);
//     data.map((v,i,w)=>{
//       console.log(i , v.login);       
//     })
// })

// let arr = [10,20,30,40]
// arr.map((v,i,w)=>{
//     console.log(v);
// })


//! async await

let func = async () => {
    let res = await fetch('https://api.github.com/users');
    let data = await res.json();
    // console.log(data);

    data.map((v, i, w) => {
        console.log(i, v.login , v.avatar_url);
    })

}
func();

let ele = document.getElementById("id");
console.log(ele);