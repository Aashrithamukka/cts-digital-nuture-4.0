
const events = [
    { name: "Past Event", date: "2022-01-01", seats: 0 },
    { name: "Upcoming Event", date: "2025-07-01", seats: 20 }
];

const today = new Date().toISOString().split('T')[0];

events.forEach(event => {
    if (event.date > today && event.seats > 0) {
        console.log("Valid Event:", event.name);
    }
});

try {
    const userSeats = -1;
    if (userSeats < 0) throw "Invalid seat count!";
    console.log("Registering user...");
} catch (err) {
    console.error("Error:", err);
}
