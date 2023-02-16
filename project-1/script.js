// let counter = document.querySelectorAll(".counter");
// let click = document.querySelectorAll(".click");
// let cname = document.querySelectorAll(".name");
// let cimg = document.querySelectorAll(".img");
let catNames = ["timmy", "jimmy"];
let catLinks = ["./cat.jpeg", "./cat2.jpg"];
let nCats = 5;
let body = document.querySelector("body");
body.innerHTML = "";

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



let main = createElement("div", "main");

for (let i = 0; i < nCats; i++) {
  let cat = createElement("div", "cat1");
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
  main.append(cat);
  body.append(main);
}

// console.log(counter,click)

// for(let i=0;i<2;i++) {

//     cimg[i].setAttribute('src',catLinks[i])
//     cname[i].innerHTML = catNames[i]
//     click[i].addEventListener('click',()=>{
//         counter[i].innerHTML = parseInt(counter[i].innerHTML) + 1
//     })
// }
