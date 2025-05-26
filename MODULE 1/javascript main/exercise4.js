
function addEvent(name, category) {
    return { name, category };
}

function registerUser(event) {
    console.log("User registered for", event.name);
}

function filterEventsByCategory(events, category) {
    return events.filter(e => e.category === category);
}

function registrationCounter() {
    let count = 0;
    return function () {
        count++;
        return count;
    };
}

const countRegistration = registrationCounter();
console.log("Registrations:", countRegistration());
console.log("Registrations:", countRegistration());
