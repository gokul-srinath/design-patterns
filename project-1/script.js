let counter = document.querySelector('.counter');
let click = document.querySelector('.click');

click.addEventListener('click',()=>{
    counter.innerHTML = parseInt(counter.innerHTML) + 1
})


