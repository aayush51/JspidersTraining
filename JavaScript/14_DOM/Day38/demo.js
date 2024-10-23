
//+ innerHTML

//- returns HTML inside element
//- adds HTML inside element


let {body} = document ;
let nav = document.createElement('nav');
nav.innerHTML = `
<div class="navs">text</div>
<div class="navs">text</div>
<div class="navs">text</div>
<div class="navs">text</div>
<div class="navs">text</div>
` 
body.append(nav)


//+ textContext

//- returns text inside element
//- adds text inside element


//+ remove()

//- removes element from DOM

let nav1 = document.querySelector('.navs');
nav1.remove()

