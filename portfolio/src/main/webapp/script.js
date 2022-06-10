// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random greeting to the page.
 */

const title = document.getElementById("caption");
const text = "//Aspiring Software Engineer...      ";

let index = 0;

const randomSpeed = (min, max) => {
  return Math.floor(Math.random() * (max - min) + min);
};

const play = () => {
  title.innerHTML = text.slice(0, index);
  index++;

  if (index > text.length) {
    index = 0;
  }

  clearInterval(timer);
  timer = setInterval(play, randomSpeed(50, 300));
};

let timer = setInterval(play, 300);




// function addRandomGreeting() {
//   const greetings =
//       ['Hello world!', '¡Hola Mundo!', '你好，世界！', 'Bonjour le monde!'];

//   // Pick a random greeting.
//   const greeting = greetings[Math.floor(Math.random() * greetings.length)];

//   // Add it to the page.
//   const greetingContainer = document.getElementById('greeting-container');
//   greetingContainer.innerText = greeting;
// }


// Server Response "/hello"

async function addRandomGreeting() {
    let responseFromServer = await fetch('/hello');
    if (responseFromServer.ok) {
      let text = await responseFromServer.text();
      //let jsontext = await responseFromServer.json();
      console.log("text", text);
      //console.log("jsontext", jsontext);
      const greetingContainer = document.getElementById('greeting-container');
      greetingContainer.innerText = text;
  
    } else {
      throw Error(responseFromServer.status);
    }
    // Add it to the page.
  
  }