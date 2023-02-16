// let counter = document.querySelectorAll(".counter");
// let click = document.querySelectorAll(".click");
// let cname = document.querySelectorAll(".name");
// let cimg = document.querySelectorAll(".img");
let catNames = ["timmy", "jimmy"];
let catLinks = ["./cat.jpeg", "./cat2.jpg"];
let nCats = 2;
let body = document.querySelector("body");
body.innerHTML = "";


let catEles =[]

function createElement(type, classNames, attr = []) {
  let ele = document.createElement(type);
  if (classNames) {
    ele.className = classNames;
  }

  for (let i = 0; i < attr.length; i++) {
    ele.setAttribute(attr[i]["key"], attr[i]["val"]);
  }

  return ele;
}

for (let i = 0; i < nCats; i++) {
    let cat = createElement("div", "cat1 cat");

    let header = createElement("h2", "name");
    header.innerHTML = catNames[i%2];
    cat.append(header);
  
    let imgDiv = createElement("div", "click");
  
    imgDiv.append(
      createElement("img", "img", [
        { key: "alt", val: "cat" },
        { key: "height", val: "450px" },
        { key: "width", val: "350px" },
        { key: "src", val: catLinks[i%2] },
      ])
    );
  
    let controlDiv = createElement("div", "control");
  
    let contentControl = createElement("div");
  
    contentControl.innerHTML = "Number of Clicks : ";
  
    let spanEle = createElement("span", "counter");
    spanEle.innerHTML = "0";
  
    contentControl.append(spanEle);
    controlDiv.append(contentControl);
  
    imgDiv.addEventListener("click", () => {
      spanEle.innerHTML = parseInt(spanEle.innerHTML) + 1;
    });
  
    cat.append(imgDiv);
    cat.append(controlDiv);
    catEles.push(cat);
  }
  


let main = createElement("div", "main");

let section1 = createElement("div","section1");
let section2 = createElement("div","section2");

section2.innerHTML = `<h2 class="default">Picture here</h2>`
let ol = createElement("ol",undefined,[{key:"type",val:"A"}]);

for(let i=0;i<nCats;i++) {
    let li = createElement("li","elems")
    li.innerHTML = catNames[i];
    li.addEventListener('click',() => {
        console.log(section2.lastChild)
        if(section2.hasChildNodes()) {
            section2.replaceChild(catEles[i], section2.lastChild)
        
        }

        section2.appendChild(catEles[i])
    })
    ol.append(li);
}

section1.append(ol);




  main.append(section1);
  main.append(section2);
  body.append(main);








