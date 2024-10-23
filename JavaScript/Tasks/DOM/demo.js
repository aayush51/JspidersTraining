let all = document.querySelectorAll('*');
console.log(all);
for (let i = 0; i < all.length; i++) {
    let e = all[i];
    e.style.margin = '0px';
    e.style.padding = '0px';
}

let { body } = document;

body.style.backgroundColor = '#ffffff'

let div = document.createElement('div');
body.append(div)
div.setAttribute('class', 'topDiv')

div.style.width = '100vw';
div.style.position = 'relative';
div.style.top = '0px';
div.style.left = '0px';
div.style.backgroundColor = 'yellow';
div.style.display = 'flex';
div.style.zIndex='2'
div.style.paddingTop = '25px'
div.style.lineHeight= '30px';

// let paddingDiv = document.createElement('div');
// body.append(paddingDiv);
// // paddingDiv.style.display = 'block'
// paddingDiv.style.position = 'relative'
// paddingDiv.style.top = '0px'
// paddingDiv.style.right = '0px'
// paddingDiv.style.width = '100%';
// paddingDiv.style.height = '25px';



let div1 = document.createElement('div')
div.append(div1)
div1.setAttribute('class', 'logo')
div1.style.display = 'inline-block';
div1.style.marginLeft = '4%'
div1.style.width = '53px';
div1.style.height = '36px';
div1.style.backgroundImage = 'url(Myntra.png)';
div1.style.backgroundSize = '1404px 105px';
div1.style.backgroundPosition = '-462px 0';


let div2 = document.createElement('div');
div.append(div2);
div2.setAttribute('class', 'nav');
div2.style.display = 'block';
div2.style.marginLeft = '0 0 0 3.5%';
div2.style.width='50%';



let ul = document.createElement('ul');
div2.append(ul);
ul.setAttribute('class', 'menu');
ul.style.fontFamily = 'Assistant, -apple-system, BlinkMacSystemFont, Segoe UI, Roboto, Helvetica, Arial, sans-serif';
ul.style.fontSize = '16px';
ul.style.listStyle = 'none';
ul.style.display = 'inline-block';
ul.style.margin = '0px'

let li2 = document.createElement('li');
ul.append(li2);
li2.textContent = 'Men';

let li3 = document.createElement('li');
ul.append(li3);
li3.textContent = 'Women';

let li4 = document.createElement('li');
ul.append(li4);
li4.textContent = 'Kids';

let li5 = document.createElement('li');
ul.append(li5);
li5.textContent = 'Home & Living';

let li6 = document.createElement('li');
ul.append(li6);
li6.textContent = 'Beauty';

let li7 = document.createElement('li');
ul.append(li7);
li7.textContent = 'Studio';

let allListItems = document.querySelectorAll('li');

for (let i = 0; i < allListItems.length; i++) {
    let e = allListItems[i];
    e.style.display = 'inline-block';
    e.style.margin = '0px 10px';
    e.style.padding ='0 17px 28px';
    e.style.textAlign= 'center';
    e.style.textDecoration = 'none';
    e.style.fontSize = '14px';
    e.style.letterSpacing = '.3px';
    e.style.color = '#282c3f';
    e.style.fontWeight= '700';
    e.style.textTransform ='uppercase';
}


let div3 = document.createElement('div');
div.append(div3);
div3.setAttribute('class', 'search');
div3.style.display = 'block';
div3.style.marginLeft = '3.5%';
div3.style.width='20%';

let search = document.createElement('input')
div3.append(search);
