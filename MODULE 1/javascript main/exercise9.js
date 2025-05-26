
// Async JavaScript using Promises and Async/Await
const mockApi = "https://jsonplaceholder.typicode.com/posts";

function fetchEvents() {
    document.body.innerHTML += "<p>Loading...</p>";
    fetch(mockApi)
        .then(response => response.json())
        .then(data => {
            console.log("Events fetched (Promise):", data.slice(0, 3));
        })
        .catch(err => console.error("Fetch error:", err));
}

async function fetchEventsAsync() {
    try {
        const res = await fetch(mockApi);
        const data = await res.json();
        console.log("Events fetched (Async):", data.slice(0, 3));
    } catch (error) {
        console.error("Async fetch error:", error);
    }
}

fetchEvents();
fetchEventsAsync();
