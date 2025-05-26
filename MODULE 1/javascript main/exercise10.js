
// Modern JS Features
const event = {
    name: "Music Concert",
    location: "Park",
    attendees: 150
};

// Destructuring
const { name, location } = event;

// Spread Operator
const events = [event];
const copiedEvents = [...events];

// Default Parameters
function greet(user = "Guest") {
    console.log(`Welcome, ${user}`);
}

console.log("Event Details:", name, location);
console.log("Copied Events:", copiedEvents);
greet();
greet("Alice");
