const all = document.querySelectorAll('input[type="checkbox"]');
const target = document.querySelector("input[value='selectall']");

console.log(target);

target.addEventListener("click", () => {
	all.forEach((checkbox) => {
		checkbox.checked = target.checked;
	})
});
