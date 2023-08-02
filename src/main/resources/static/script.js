// Function to toggle dark mode
function toggleDarkMode() {
  let element = document.body;
  let content = document.getElementById("DarkModetext");

  if (element.classList.contains("dark-mode")) {
    element.classList.remove("dark-mode");
    content.innerText = "Dark Mode is OFF";
    localStorage.setItem("darkMode", "off"); // Save dark mode preference
  } else {
    element.classList.add("dark-mode");
    content.innerText = "Dark Mode is ON";
    localStorage.setItem("darkMode", "on"); // Save dark mode preference
  }
}

// Check dark mode preference on page load
document.addEventListener("DOMContentLoaded", function () {
  const darkModePreference = localStorage.getItem("darkMode");
  if (darkModePreference === "on") {
    document.body.classList.add("dark-mode");
    document.getElementById("DarkModetext").innerText = "Dark Mode is ON";
  }
});
