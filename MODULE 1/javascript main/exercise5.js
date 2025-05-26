
function Event(name, seats) {
    this.name = name;
    this.seats = seats;
}

Event.prototype.checkAvailability = function () {
    return this.seats > 0;
};

const event = new Event("Coding Bootcamp", 10);
console.log("Availability:", event.checkAvailability());

console.log("Event Keys and Values:", Object.entries(event));
