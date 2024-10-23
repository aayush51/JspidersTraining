//+ Avoid page refresh with preventDefault()

let userForm = document.querySelector('form');
userForm.addEventListener('submit', (e) => {
    console.log('Form submited');
    e.preventDefault();
})