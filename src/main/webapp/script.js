document.getElementById("feedbackForm").addEventListener("submit", function (e) {
  e.preventDefault();

  const formData = new FormData(this);
  fetch("feedback", {
    method: "POST",
    body: new URLSearchParams(formData),
  })
    .then((res) => res.text())
    .then((data) => {
      document.getElementById("responseMessage").innerText = data;
      this.reset();
    })
    .catch((err) => console.error("Error:", err));
});
