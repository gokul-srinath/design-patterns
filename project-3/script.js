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

    update: (id, object) => {
      cat = model.cats.filter((cat) => cat.id == id)[0];
      let { name, url, count } = object;
      cat.name = name;
      cat.url = url;
      cat.count = parseInt(count);
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
    update: (id, object) => {
      model.update(id, object);
      view.renderView2(id);
    },
  };

  const view = {
    init: () => {
      let cat = document.querySelector(".cat");
      let adminDiv = document.querySelector(".admin-div");

      view.renderView1();
      view.renderEventListener();
      adminDiv.style.display = "none";
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
      let adminButton = document.querySelector(".admin-button");
      let adminDiv = document.querySelector(".admin-div");
      let adminCancelButton = document.querySelector(".cancel");
      let adminSaveButton = document.querySelector(".save");

      adminButton.addEventListener("click", (e) => {
        let cat = document.querySelector(".cat");
        let id = cat.getAttribute("id");
        
        if (id) {
          adminButton.disabled = false;
          adminButton.style.display = "none";
          adminDiv.style.display = "block";
          view.renderView3();
        }

      });

      adminSaveButton.addEventListener("click", () => {
        let cat = document.querySelector(".cat");
        let id = cat.getAttribute("id");

        let catName = document.getElementById("cat-name");
        let url = document.getElementById("cat-url");
        let catCount = document.getElementById("cat-clicks");

        octopus.update(id, {
          name: catName.value,
          url: url.value,
          count: catCount.value,
        });
      });

      adminCancelButton.addEventListener("click", () => {
        adminButton.style.display = "block";
        adminDiv.style.display = "none";
      });

      imgTag.addEventListener("click", (e) => {
        // let id = e.target.getAttribute("id");
        let cat = document.querySelector(".cat");
        let id = cat.getAttribute("id");
        updatedCount = octopus.increment(id);
        counter.innerHTML = updatedCount;
      });
    },
    renderView2: (id) => {
      //   let section2 = document.querySelector(".section2");

      let adminCancelButton = document.querySelector(".cancel");
      adminCancelButton.click();

      let { name, img, count } = octopus.fetchCat(id)[0];
      let defaultTag = document.querySelector(".default");
      defaultTag.style.display = "none";
      let imgTag = document.querySelector(".img");
      let cat = document.querySelector(".cat");
      cat.style.display = "block";

      let nameTag = document.querySelector(".name");
      let counter = document.querySelector(".counter");

      imgTag.setAttribute("src", img);
      // imgTag.setAttribute("id", id);

      cat.setAttribute("id", id);

      nameTag.innerHTML = name;
      counter.innerHTML = count;
    },

    renderView3: () => {
      let cat = document.querySelector(".cat");
      let id = cat.getAttribute("id");

      let catName = document.getElementById("cat-name");
      let url = document.getElementById("cat-url");
      let catCount = document.getElementById("cat-clicks");

      let { name, img, count } = octopus.fetchCat(id)[0];

      catName.value = name;
      url.value = img;
      catCount.value = count;
    },
  };

  octopus.init();
};

main();
