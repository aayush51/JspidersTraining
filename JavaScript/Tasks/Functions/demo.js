// #1
console.log("___________________#1______________________");
function sayHello() {
    console.log("Hello, world!");
}
sayHello();
sayHello();
sayHello();

// #2
console.log("___________________#2______________________");

let Farewell = function () {
    console.log("Goodbye!");
}
Farewell();

// #3
console.log("___________________#3______________________");

let cheerUp = () => {
    console.log("Cheer up, buddy!");
}
cheerUp();

// #4
console.log("___________________#4______________________");

function Introduce(yourName) {
    console.log(`Hello, my name is ${yourName}`);
}
Introduce("Aayush");

// #5
console.log("___________________#5______________________");

let placeOrder = function (flavor) {
    console.log(`Ordered a ${flavor} pizza!`);
}
placeOrder("pepperoni");

// #6
console.log("___________________#6______________________");

let greetPerson = (personName) => {
    console.log(`Hi, ${personName}!`);
}
greetPerson("Gaurav");

// #7
console.log("___________________#7______________________");

var makeCoffee = function () {
    console.log("Making coffee…");
};
let startMorning = function () {
    makeCoffee();
};
startMorning();

// #8
console.log("___________________#8______________________");

let morningRoutine = function (brushTeeth, getDressed) {
    brushTeeth();
    getDressed();
};
let brushTeeth = function () {
    console.log("Brushing teeth...");
};
let getDressed = function () {
    console.log("Getting dressed...");
};
morningRoutine(brushTeeth, getDressed);

// #9
console.log("___________________#9______________________");

let takeAction = function (callBackFunc) {
    callBackFunc();
    console.log("Action completed!");
};
let cbf = function () {
    console.log("Action in progress!");
};
takeAction(cbf);

// #10
console.log("___________________#10______________________");

let calculateArea = (length, width) => {
    console.log(`The area is ${length * width}`);
};
calculateArea(12, 24);

// #11
console.log("___________________#11______________________");

let lunchBreak = function (eatLunch, takeNap) {
    eatLunch();
    takeNap();
}
let eatLunch = function () {
    console.log("Eating lunch...");
}
let takeNap = function () {
    console.log("Taking a nap...");
}
lunchBreak(eatLunch, takeNap);

// #12
console.log("___________________#12______________________");

function supportTeam(params) {
    console.log("Go, team!");
}
supportTeam();
supportTeam();
supportTeam();

// #13
console.log("___________________#13______________________");

let weatherUpdate = () => {
    console.log("The weather is great today!");
};
weatherUpdate();

// #14
console.log("___________________#14______________________");

let petTalk = function talkToPet() {
    console.log("Who’s a good pet?");
};
petTalk();

// #15
console.log("___________________#15______________________");

function favoriteMovie(movie, year) {
    console.log(`My favorite movie is ${movie} from ${year}`);
};
favoriteMovie("The Matrix", 1999);

// #16
console.log("___________________#16______________________");

function morningRoutine1() {
    console.log("Get ready for work!");
};
function work() {
    console.log("Do task given by Manager!");
};
function eveningChill() {
    console.log("netflix and chill!");
};
let dailySchedule = function () {
    morningRoutine1();
    work();
    eveningChill();
};
dailySchedule();

// #17
console.log("___________________#17______________________");

let exerciseRoutine = function (stretch, run) {
    stretch();
    run();
};
let stretch = () => {
    console.log("Stretching");
};
let run = () => {
    console.log("Running");
};
exerciseRoutine(stretch, run);

// #18
console.log("___________________#18______________________");

let motivateMe = () => {
    console.log("You can do it!");
}
motivateMe();
motivateMe();
motivateMe();
motivateMe();

// #19
console.log("___________________#19______________________");

let iceCreamTime = function orderIceCream(flavor) {
    console.log(`Ordering ${flavor} ice cream!`);
};
iceCreamTime("vanilla");

// #20
console.log("___________________#20______________________");

function nightRoutine() {
    console.log("Brushing teeth");
    console.log("Going to bed");
}
nightRoutine();
