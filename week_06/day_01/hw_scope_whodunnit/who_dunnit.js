// Episode 1

// const scenario = {
//     murderer: 'Miss Scarlet',
//     room: 'Library',
//     weapon: 'Rope'
//   };
  
//   const declareMurderer = function() {
//     return `The murderer is ${scenario.murderer}.`;
//   }
  
//   const verdict = declareMurderer();
//   console.log(verdict);

// Output will be: "The murderer is Miss Scarlet."
//      The variable declareMurder accesses the murderer value in the scenario object. This as assigned to verdict variable and printed in the console log.



// Episode 2

// const murderer = 'Professor Plum';

// const changeMurderer = function() {
//   murderer = 'Mrs. Peacock';
// }

// const declareMurderer = function() {
//   return `The murderer is ${murderer}.`;
// }

// changeMurderer();
// const verdict = declareMurderer();
// console.log(verdict);

// Output will be: An error
//      murder is define as a const on line 22, the function changeMurderer will try to change this, as it is a const variable it will error as it cannot be changed.



// Episode 3

// let murderer = 'Professor Plum';

// const declareMurderer = function() {
//   let murderer = 'Mrs. Peacock';
//   return `The murderer is ${murderer}.`;
// }

// const firstVerdict = declareMurderer();
// console.log('First Verdict: ', firstVerdict);

// const secondVerdict = `The murderer is ${murderer}.`;
// console.log('Second Verdict: ', secondVerdict);

// The output will be: "First Verdict: The murderer is Mrs. Peacock"  then "Second Verdict: The murderer is Professor Plum"
//      First verdict is Mrs Peacock as a new let variable is declared in the scope of the function and this is what referenced on the return.
//      Second verdict is Professor Plum as this refers to the let variable on line 41.
//      The variable on line 41 does not get over written as Mrs Peacock is define to a new variable in local scope of the function declareMurderer and the secondVerdict variable can not refernce this again due to it being in local scope.



// Episode 4

// let suspectOne = 'Miss Scarlet';
// let suspectTwo = 'Professor Plum';
// let suspectThree = 'Mrs. Peacock';

// const declareAllSuspects = function() {
//   let suspectThree = 'Colonel Mustard';
//   return `The suspects are ${suspectOne}, ${suspectTwo}, ${suspectThree}.`;
// }

// const suspects = declareAllSuspects();
// console.log(suspects);
// console.log(`Suspect three is ${suspectThree}.`);

// The output will be: "The suspects are 'Miss Scarlet', Professor Plum, Colonel Mustard." and "Suspect three is Mrs. Peacock"
//      Suspect 3 changes on the first log as this has been redefined within the declareAllSuspects scope.
//      Suspect 3 uses the decularation given on line 63 as suspectThree on line 66 cannot be seen from outside the declareAllSuspects function.



// Episode 5

// const scenario = {
//     murderer: 'Miss Scarlet',
//     room: 'Kitchen',
//     weapon: 'Candle Stick'
//   };
  
//   const changeWeapon = function(newWeapon) {
//     scenario.weapon = newWeapon;
//   }
  
//   const declareWeapon = function() {
//     return `The weapon is the ${scenario.weapon}.`;
//   }
  
//   changeWeapon('Revolver');
//   const verdict = declareWeapon();
//   console.log(verdict);

// The output is: "The weapon is the Revolver"
//      Revolver argument gets given to the function changeWeapon which replaces the weapon value in scenario object.



// Episode 6

// let murderer = 'Colonel Mustard';

// const changeMurderer = function() {
//   murderer = 'Mr. Green';

//   const plotTwist = function() {
//     murderer = 'Mrs. White';
//   }

//   plotTwist();
// }

// const declareMurderer = function () {
//   return `The murderer is ${murderer}.`;
// }

// changeMurderer();
// const verdict = declareMurderer();
// console.log(verdict);

// The output will be: "The murderer is Mrs.White"
//      When changeMurder function is called the let variable gets changed to Mr. Green, but within this a function plotTwist gets called and the variable to Mrs White.



// Episode 7

// let murderer = 'Professor Plum';

// const changeMurderer = function() {
//   murderer = 'Mr. Green';

//   const plotTwist = function() {
//     let murderer = 'Colonel Mustard';

//     const unexpectedOutcome = function() {
//       murderer = 'Miss Scarlet';
//     }

//     unexpectedOutcome();
//   }

//   plotTwist();
// }

// const declareMurderer = function() {
//   return `The murderer is ${murderer}.`;
// }

// changeMurderer();
// const verdict = declareMurderer();
// console.log(verdict);

// The outcome will be: "The murderer is Mr Green"
//      The let variable 139 is changed to Mr Green by the function changeMurderer. A new let variable for murderer is created on line 145 within the scope of the changeMurderer. unexpectedOutcome changes the variable on line 145 as it is the child of the plotTwist function.


// Episode 8

// const scenario = {
//     murderer: 'Mrs. Peacock',
//     room: 'Conservatory',
//     weapon: 'Lead Pipe'
//   };
  
//   const changeScenario = function() {
//     scenario.murderer = 'Mrs. Peacock';
//     scenario.room = 'Dining Room';
  
//     const plotTwist = function(room) {
//       if (scenario.room === room) {
//         scenario.murderer = 'Colonel Mustard';
//       }
  
//       const unexpectedOutcome = function(murderer) {
//         if (scenario.murderer === murderer) {
//           scenario.weapon = 'Candle Stick';
//         }
//       }
  
//       unexpectedOutcome('Colonel Mustard');
//     }
  
//     plotTwist('Dining Room');
//   }
  
//   const declareWeapon = function() {
//     return `The weapon is ${scenario.weapon}.`
//   }
  
//   changeScenario();
//   const verdict = declareWeapon();
//   console.log(verdict);

// The outcome will be: "The weapon is Candle Stick"
//      There are three functions within the scope of changeScenario, as the IF statements are Falsey(Falsey?) at this point no changes are made, plotTwist is called first at the end of the function which makes the first IF statment true and allows the program to call unexpectedOutcome which is now also True(Truthy?), this changes the weapon to be Candle Stick.



// Episode 9

// let murderer = 'Professor Plum';

// if (murderer === 'Professor Plum') {
//   let murderer = 'Mrs. Peacock';
// }

// const declareMurderer = function() {
//   return `The murderer is ${murderer}.`;
// }

// const verdict = declareMurderer();
// console.log(verdict);

// The outcome will be: "The murderer is Professor Plum"
//      Although murderer === Professor Plum a new let variable is created in inner scope of the IF statement which declareMurderer cannot access.



// Episode 10

const scenario = {
    murderer: 'Barksdale',
    location: 'The streets',
    weapon: 'Unknown',
    victim: 'Stinkum'
}

const investigateMurder = function() {
    if (scenario.murderer === "Barksdale") {
        scenario.murderer = "Stringer Bell"
    
        const findWeapon = function(weapon) {
            scenario.weapon = weapon
        
            const checkWeapon = function() {
                if (scenario.weapon === "Shotgun") {
                    scenario.murderer = "Omar"
                }
            }
            checkWeapon()
        }
        findWeapon("Shotgun")
     }
}

investigateMurder()
const declareMurderer = function() {
    return `The murderer was ${scenario.murderer} using a ${scenario.weapon}`
}

const verdict = declareMurderer();
console.log(verdict)

// The outcome will be: "The murderer was Omar using a Shotgun"











// Things to ask
// Episode 8 for example, plotTwist gets executed before unexpectedOutcome. Is this because unexpectedOutcome was skipped first as the if statement of plotTwist was False till the function was called?
// When plotTwist is called and makes the function True then the unexpectedOutcome can now be called?