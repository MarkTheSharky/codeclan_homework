document.addEventListener('DOMContentLoaded', () => {
    const newItemForm = document.querySelector('#form-skills')
    newItemForm.addEventListener('submit', handleNewItemFormSubmit)

    const deleteAll = document.querySelector('#delete_all')
    deleteAll.addEventListener('click', handleDeleteAll)

})

const handleNewItemFormSubmit = function(evt) {
    evt.preventDefault()    

    const newListItem = document.createElement('li')
    newListItem.textContent = `User has ${evt.target.skill_name.value} from the ${evt.target.skill_school.value} set of skills.`

    const list = document.querySelector('#skills_list')
    list.appendChild(newListItem)
}

const handleDeleteAll = function(evt) {
    const listItems = document.querySelector('#skills_list')
    listItems.textContent = ""
    // const listItemsChild = document.querySelector('#skills_list li')
    // listItems.removeChild(listItemsChild)
}