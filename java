const coin = document.querySelector("#coin");
const button = document.querySelector("#flip");
const status = document.querySelector("#status");
const headsDisplay = document.querySelector("#headcount");
const tailsDisplay = document.querySelector("#tailsCount");

let headsCount = 0;
let tailsCount = 0;

// Function to process the result
function processResult(result) {
  if (result === "heads") {
    headsCount++;
    headsDisplay.textContent = headsCount;
    status.textContent = "It's Heads!";
  } else {
    tailsCount++;
    tailsDisplay.textContent = tailsCount;
    status.textContent = "It's Tails!";
  }
}

// Function to flip the coin
button.addEventListener("click", () => {
  const isHeads = Math.random() > 0.5; // Randomize heads or tails
  if (isHeads) {
    coin.className = "animate_heads"; // Apply animation for heads
    setTimeout(() => processResult("heads"), 3000); // Update after animation
  } else {
    coin.className = "tailsClass animate_heads"; // Apply animation for tails
    setTimeout(() => processResult("tails"), 3000); // Update after animation
  }
});
