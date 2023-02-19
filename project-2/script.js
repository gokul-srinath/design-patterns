const orderedList = document.querySelector(".list");

const main = () => {
  const model = {
    cats: [],
    init: () => {
      data = [
        {
          id: 1,
          name: "timmy",
          img: "./cat.jpeg",
          count: 0,
        },
        {
          id: 2,
          name: "jimmy",
          img: "./cat2.jpg",
          count: 0,
        },
      ];
      model.cats = data;
    },

    getCats: () => {
      return model.cats;
    },

    incrementCount: (id) => {
      cat = model.cats.filter((cat) => cat.id == id)[0];
      
      cat.count += 1;
      return cat.count;
    },
  };

  const octopus = {
    init: () => {
      model.init(), view.init();
    },

    fetchCats: () => {
      return model.getCats();
    },
    fetchCat: (id) => {
      return model.getCats().filter((cat) => cat.id == id);
    },
    increment: (id) => {
      return model.incrementCount(id);
    },
  };

  const view = {
    init: () => {
      let cat = document.querySelector(".cat");

      view.renderView1();
      view.renderEventListener();

      cat.style.display = "none";
    },
    renderView1: () => {
      let htmlStr = "";

      octopus.fetchCats().map((cat) => {
        htmlStr += `<li class='elems' id='elems-${cat.id}'>${cat.name}</li>`;
      });

      orderedList.innerHTML = htmlStr;

      const catsList = document.querySelectorAll(".elems");

      catsList.forEach((cats) => {
        cats.addEventListener("click", (event) => {
          let id = event.target.getAttribute("id");
          id = id.split("-")[1];
          view.renderView2(id);
        });
      });
    },

    renderEventListener: () => {
      let imgTag = document.querySelector(".img");
      let counter = document.querySelector(".counter");

      imgTag.addEventListener("click", (e) => {
        let id = e.target.getAttribute("id")
        updatedCount = octopus.increment(id);
        counter.innerHTML = updatedCount;
      });
    },
    renderView2: (id) => {
      //   let section2 = document.querySelector(".section2");

      let { name, img, count } = octopus.fetchCat(id)[0];
      let defaultTag = document.querySelector(".default");
      defaultTag.style.display = "none";
      let imgTag = document.querySelector(".img");
      let cat = document.querySelector(".cat");
      cat.style.display = "block";

      let nameTag = document.querySelector(".name");
      let counter = document.querySelector(".counter");

      imgTag.setAttribute("src", img);
      imgTag.setAttribute("id", id);

      nameTag.innerHTML = name;
      counter.innerHTML = count;
    },
  };

  octopus.init();
};

main();
