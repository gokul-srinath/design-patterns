let counter = document.querySelectorAll('.counter');
let click = document.querySelectorAll('.click');
let cname = document.querySelectorAll('.name');
let cimg = document.querySelectorAll('.img');
let catNames = ["timmy","jimmy"]
let catLinks = ["./cat.jpeg","./cat2.jpg"]

// console.log(counter,click)

for(let i=0;i<2;i++) {
    cimg[i].setAttribute('src',catLinks[i])
    cname[i].innerHTML = catNames[i]
    click[i].addEventListener('click',()=>{
        counter[i].innerHTML = parseInt(counter[i].innerHTML) + 1
    })
}




