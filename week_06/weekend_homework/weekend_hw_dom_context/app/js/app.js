document.addEventListener('DOMContentLoaded', () => {
    const newItemForm = document.querySelector('#form-skills')
    newItemForm.addEventListener('submit', handleNewItemFormSubmit)
})

const handleNewItemFormSubmit = function(event) {
    console.log("Test Print")
}