
console.log("Debugging registration...");

const formSubmission = {
    name: "Bob",
    email: "bob@example.com"
};

debugger; // inspect this in browser tools
console.log("Form data:", formSubmission);

fetch("https://jsonplaceholder.typicode.com/posts", {
    method: "POST",
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(formSubmission)
})
.then(response => response.json())
.then(data => console.log("Registered:", data));
