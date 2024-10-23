// 1. **Change Background Color:**
//    - Create a button with a label like “Change Background”. Write a function that will change the background color of the entire page when this button is clicked. You can allow the user to choose a random color or pick a predefined color.

let btn1 = document.createElement('button');
btn1.innerHTML = 'Change Background';
document.body.append(btn1);
btn1.onclick = function () {
    document.body.style.backgroundColor = 'yellow';
};


// 2. **Text Update:**
//    - Add a paragraph element to your HTML with some initial text (e.g., “Click the button to change this text.”). Create a button labeled “Update Text”. Write a function that, when the button is clicked, changes the paragraph text to something else (e.g., “Text updated!”).

let para = document.createElement('p');
para.innerHTML = 'Click the button to change this text.';
document.body.append(para);

let btn2 = document.createElement('button');
btn2.innerHTML = 'Update Text';
document.body.append(btn2);

btn2.onclick = function () {
    para.innerHTML = 'Text updated!';
};

// 3. **Hide/Show Element:**
//    - Add a div with some content and a button labeled “Hide/Show”. Write a function that hides the div when the button is clicked for the first time, and shows it again when clicked the second time. Use a boolean or toggle to keep track of whether the div is visible or hidden.

let div = document.createElement('div');
div.innerHTML = 'This is the content of the div.';
document.body.append(div);

let btn3 = document.createElement('button');
btn3.innerHTML = 'Hide/Show';
document.body.append(btn3);

let toggle = false;
btn3.onclick = function () {
    if (toggle) {
        div.style.display = 'none';
        toggle = false;
    } else {
        div.style.display = 'block';
        toggle = true;
    }
}

// 4. **Add New Item to List:**
//    - Create an input field and an empty unordered list (ul) in your HTML. Below the input, add a button labeled “Add Item”. Write a function that, when the button is clicked, adds the value from the input field as a new list item (li) to the unordered list. Make sure to clear the input field after adding the item.

let input = document.createElement('input');
input.type = 'text';
document.body.append(input);

let list = document.createElement('ul');
document.body.append(list);

let btn4 = document.createElement('button');
btn4.textContent = 'Add Item';
document.body.append(btn4);

btn4.onclick = function () {
    let li = document.createElement('li');
    li.textContent = input.value;
    list.append(li);
    input.value = '';
}



// 5. **Remove Last Item from List:**
//    - Add an unordered list with a few predefined list items (li). Below the list, add a button labeled “Remove Last Item”. Write a function that, when the button is clicked, removes the last item from the list. Make sure the function works even when the list is empty (i.e., it shouldn’t break).

let list2 = document.createElement('ul');
list2.innerHTML = '<li>Item 1</li><li>Item 2</li><li>Item 3</li>';
document.body.append(list2);

let btn5 = document.createElement('button');
btn5.textContent = 'Remove Last Item';
document.body.append(btn5);

btn5.onclick = function () {
    let arr = list2.getElementsByTagName('li');
    arr[arr.length - 1].remove();
}

// 6. **Toggle Class:**
//    - Create a div element with some initial style, like a background color or border. Add a button labeled “Toggle Style”. Write a function that toggles a specific class on the div when the button is clicked. The class should change the div’s appearance (e.g., different color or border style).

let div2 = document.createElement('div');
div2.setAttribute('class','border');
document.body.append(div2);

let btn6 = document.createElement('button');
btn6.textContent = 'Toggle Style';
document.body.append(btn6);

btn6.onclick = ()=>{
    if(div2.className == 'border'){
        div2.setAttribute('class','active');
    }
    else{
        div2.setAttribute('class','border');
    }
}


// 7. **Change Image Source:**
//    - Add an image element with an initial source. Below the image, add two buttons labeled “Change to Image 1” and “Change to Image 2”. Write functions for both buttons that change the image’s source to a different URL when clicked.

let img = document.createElement('img');
img.src = 'https://images.all-free-download.com/images/thumbjpg/wild_nature_picture_ladybug_perching_branch_closeup_6930235.jpg';
document.body.append(img);

let btn7 = document.createElement('button');
btn7.textContent = 'Change to Image 1';
document.body.append(btn7);

let btn8 = document.createElement('button');
btn8.textContent = 'Change to Image 2';
document.body.append(btn8);

btn7.onclick = function () {
    img.src = 'https://images.all-free-download.com/images/thumbjpg/wild_nature_picture_ladybug_perching_branch_closeup_6930235.jpg';
}

btn8.onclick = function () {
    img.src = 'https://images.all-free-download.com/images/thumbjpg/nature_backdrop_picture_elegant_tiny_ladybug_flower_closeup_6930230.jpg';
}


// 8. **Create Elements Dynamically:**
//    - Add a button labeled “Add Paragraph”. Write a function that, when the button is clicked, creates a new paragraph element and appends it to the document body. The paragraph should contain some text (e.g., “This is a new paragraph!”).

let btn9 = document.createElement('button');
btn9.textContent = 'Add Paragraph';
document.body.append(btn9);

btn9.onclick = function () {
    let p = document.createElement('p');
    p.textContent = 'This is a new paragraph!';
    document.body.append(p);
}


// 9. **Disable Button After Click:**
//    - Add a button labeled “Click Me”. Write a function that disables the button (i.e., makes it unclickable) after it’s been clicked once. You can change the button’s text to indicate that it’s been disabled (e.g., “Button Disabled”).

let btn10 = document.createElement('button');
btn10.textContent = 'Click Me';
document.body.append(btn10);

btn10.onclick = function () {
    btn10.disabled = true;
}



// 10. **Display Input Text:**
//     - Create an input field and a div below it. Write a function that, as the user types into the input field, displays the same text in the div In real-time. This can be achieved by listening for the input event and updating the div’s inner text with the input’s current value.

let input2 = document.createElement('input');
input2.type = 'text';
document.body.append(input2);

let div3 = document.createElement('div');
document.body.append(div3);

input2.addEventListener('input',function () {
    div3.textContent = input2.value;
});

// 11. **Change Text Color on Hover:**
//     - Add a paragraph element with some text. Write a function that changes the text color when the mouse hovers over the paragraph and reverts the color back to its original state when the mouse leaves.

let para2 = document.createElement('p');
para2.textContent = 'This is a paragraph.';
document.body.append(para2);

para2.addEventListener('mouseover',function () {
    para2.style.color = 'red';
});

// 12. **Display Current Date and Time:**
//     - Add a button labeled “Show Date and Time”. Write a function that, when the button is clicked, displays the current date and time in a div below the button. You can use JavaScript’s `Date` object to get the current date and time.

let btn11 = document.createElement('button');
btn11.textContent = 'Show Date and Time';
document.body.append(btn11);

btn11.onclick = function () {
    let div4 = document.createElement('div');
    div4.textContent = new Date();
    document.body.append(div4);
}

// 13. **Remove Element:**
//     - Add a div or any other element with some content. Below it, add a button labeled “Remove Element”. Write a function that removes the element from the DOM when the button is clicked.

let div5 = document.createElement('div');
div5.textContent = 'This is the content of the div.';
document.body.append(div5);

let btn12 = document.createElement('button');
btn12.textContent = 'Remove Element';
document.body.append(btn12);

btn12.onclick = function () {
    div5.remove();
}

// 14. **Count Button Clicks:**
//     - Create a button labeled “Click Counter”. Below the button, add a paragraph that displays the number of times the button has been clicked (e.g., “Button clicked 0 times”). Write a function that increments the count every time the button is clicked.

let btn13 = document.createElement('button');
btn13.textContent = 'Click Counter';
document.body.append(btn13);

let p = document.createElement('p');
p.textContent = 'Button clicked 0 times';
document.body.append(p);

let count = 0;
btn13.onclick = function () {
    p.textContent = 'Button clicked ' + (++count) + ' times';
}

// 15. **Display Window Width:**
//     - Add a div that will display the current window width. Write a function that updates the width in the div whenever the user resizes the window. You can listen for the `resize` event and use `window.innerWidth` to get the current width.

let div6 = document.createElement('div');
div6.textContent = `Window width: ${window.innerWidth}px`;
document.body.append(div6);

window.addEventListener('resize',function () {
    div6.textContent = 'Window width: ' + window.innerWidth + 'px';
});


// 16. **Add Class to All Elements:**
//     - Add a few paragraph elements to the page. Below them, add a button labeled “Add Class”. Write a function that, when the button is clicked, adds a specific class (e.g., a class that changes the text color) to all the paragraph elements on the page.

let btn14 = document.createElement('button');
btn14.textContent = 'Add Class';
document.body.append(btn14);

btn14.onclick = function () {
    let paras = document.getElementsByTagName('p');
    for (let i = 0; i < paras.length; i++) {
        paras[i].setAttribute('class','highlight');
    }
}

// 17. **Input Validation:**
//     - Create a form with a text input field and a submit button. Write a function that validates the input field when the form is submitted. If the field is empty, display an error message below the form and prevent the form from being submitted.

let form = document.createElement('form');

let input3 = document.createElement('input');
input3.type = 'text';
form.append(input3);

let btn15 = document.createElement('button');
btn15.textContent = 'Submit';
form.append(btn15);

document.body.append(form);

btn15.onclick = function () {
    if (input3.value === '') {
        alert('Please enter a value.');
    }
}


// 18. **Change Font Size:**
//     - Add a paragraph with some text. Below the paragraph, add a button labeled “Increase Font Size”. Write a function that increases the font size of the paragraph by 2px every time the button is clicked.

let para3 = document.createElement('p');
para3.textContent = 'This is a paragraph.';
document.body.append(para3);

let btn16 = document.createElement('button');
btn16.textContent = 'Increase Font Size';
document.body.append(btn16);

btn16.onclick = function () {
    para3.style.fontSize = '2em';
}


// ### Event Handling Tasks:

// 21. **Button Hover Event:**
//     - Add a button labeled “Hover Me”. Write a function that changes the background color of the button when the user hovers over it and reverts the color when the mouse leaves.

let btn17 = document.createElement('button');
btn17.textContent = 'Hover Me';
document.body.append(btn17);

btn17.addEventListener('mouseover',function () {
    btn17.style.backgroundColor = 'red';
});

// 22. **Form Submission Event:**
//     - Create a simple form with an input field and a submit button. Write a function that prevents the form from being submitted if the input is empty, and display an error message below the form. Use `event.preventDefault()` to prevent form submission.

let form2 = document.createElement('form');

let input4 = document.createElement('input');
input4.type = 'text';
form2.append(input4);

let btn17 = document.createElement('button');
btn17.textContent = 'Submit';
form2.append(btn17);

document.body.append(form2);

form2.addEventListener('submit',function (event) {
    if (input4.value === '') {
        alert('Please enter a value.');
        event.preventDefault();
    }
})


// 23. **Keyboard Event:**
//     - Add an input field. Write a function that listens for the “Enter” key and triggers an alert when it’s pressed inside the input field. Make sure the function only works for the “Enter” key.

let input5 = document.createElement('input');
input5.type = 'text';
document.body.append(input5);

input5.addEventListener('keydown',function (event) {
    if (event.key === 'Enter') {
        alert('Enter key pressed.');
    }
})


// 24. **Double-Click Event:**
//     - Create a div with some content and write a function that changes its background color when it’s double-clicked. The background should change every time a double-click event occurs.

let div7 = document.createElement('div');
div7.textContent = 'This is a div.';
document.body.append(div7);

div7.addEventListener('dblclick',function () {
    div7.style.backgroundColor = 'red';
})


// 25. **Key Press Counter:**
//     - Add an input field and a paragraph that displays the number of times a key has been pressed inside the input field. Write a function that increments the count with every keypress and updates the paragraph.

let input6 = document.createElement('input');
input6.type = 'text';
document.body.append(input6);

let p2 = document.createElement('p');
p2.textContent = 'Number of key presses: 0';
document.body.append(p2);

input6.addEventListener('keypress',function () {
    p2.textContent = 'Number of key presses: ' + input6.value.length;
})


// 26. **Mouse Movement Tracker:**
//     - Write a function that tracks the mouse’s position on the page in real-time and displays the current x and y coordinates in a div. Update the coordinates every time the mouse moves.

let div8 = document.createElement('div');
div8.textContent = 'Mouse coordinates: 0,0';
document.body.append(div8);

div8.addEventListener('mousemove',function (event) {
    div8.textContent = 'Mouse coordinates: ' + event.clientX + ',' + event.clientY;
})


// 27. **Right-Click Event:**
//     - Add an element to your page, like a button or div. Write a function that triggers an alert when the user right-clicks on the element. Use the `contextmenu` event to handle the right-click.

let div9 = document.createElement('div');
div9.textContent = 'This is a div.';
document.body.append(div9);

div9.addEventListener('contextmenu',function () {
    alert('Right-clicked.');
})


// 28. **Mouse Over Event:**
//     - Create a div or paragraph with some text. Write a function that changes its text or color when the mouse is moved over the element and changes it back when the mouse leaves.

let div10 = document.createElement('div');
div10.textContent = 'This is a div.';
document.body.append(div10);

div10.addEventListener('mouseover',function () {
    div10.style.backgroundColor = 'red';
})



// 29. **Focus Event:**
//     - Add an input field. Write a function that changes the input field’s border color when it gains focus and reverts the color when it loses focus. Use the `focus` and `blur` events for this.

let input7 = document.createElement('input');
input7.type = 'text';
document.body.append(input7);

input7.addEventListener('focus',function () {
    input7.style.borderColor = 'red';
})

input7.addEventListener('blur',function () {
    input7.style.borderColor = 'black';
})


