
function simulateSubmit() {
    const user = { name: "Jane", email: "jane@example.com" };

    console.log("Submitting data...");
    setTimeout(() => {
        fetch("https://jsonplaceholder.typicode.com/posts", {
            method: "POST",
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(user)
        })
        .then(res => res.json())
        .then(data => console.log("Success:", data))
        .catch(err => console.error("Error:", err));
    }, 2000);
}

simulateSubmit();
