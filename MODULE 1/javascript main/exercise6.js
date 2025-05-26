
// Array and Methods Example
const events = [
    { name: "Music Fest", category: "music" },
    { name: "Baking Workshop", category: "cooking" },
    { name: "Jazz Night", category: "music" }
];

// Add new event
events.push({ name: "Dance Show", category: "music" });

// Filter music events
const musicEvents = events.filter(event => event.category === "music");

// Map to format display
const formattedEvents = events.map(event => `Workshop on ${event.name}`);

console.log("All Events:", events);
console.log("Music Events:", musicEvents);
console.log("Formatted:", formattedEvents);
